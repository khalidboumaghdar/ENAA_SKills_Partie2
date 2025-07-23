package com.enaa.brief_service.service;

import com.enaa.brief_service.dto.BriefDto;
import com.enaa.brief_service.mapper.BriefMapper;
import com.enaa.brief_service.model.Brief;
import com.enaa.brief_service.model.Competence;
import com.enaa.brief_service.repository.BriefRepository;
import com.enaa.brief_service.repository.CompetenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BriefService {
    private  final BriefRepository briefRepository;
    private final CompetenceRepository competenceRepository;
    public BriefService(BriefRepository briefRepository, CompetenceRepository competenceRepository) {
        this.briefRepository = briefRepository;
        this.competenceRepository = competenceRepository;
    }
    public List<BriefDto> getAllBriefs() {
        return briefRepository.findAll()
                .stream()
                .map(BriefMapper::toDTO)
                .collect(Collectors.toList());
    }
    public BriefDto CreateBrief(BriefDto briefDto) {
        Brief brief = BriefMapper.toEntity(briefDto);
        if (briefDto.getCompetenceNoms() != null && !briefDto.getCompetenceNoms().isEmpty()) {
            List<Competence> competences = competenceRepository.findByNomIn(briefDto.getCompetenceNoms());

            for (Competence competence : competences) {
                competence.setBrief(brief);
            }

            brief.setCompetences(competences);
        }
        Brief saved = briefRepository.save(brief);
        return BriefMapper.toDTO(saved);
    }



}
