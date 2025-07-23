package com.enaa.brief_service.service;

import com.enaa.brief_service.dto.CompetenceDto;
import com.enaa.brief_service.mapper.CompetenceMapper;
import com.enaa.brief_service.model.Competence;
import com.enaa.brief_service.repository.CompetenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompetenceService {
    private final CompetenceRepository competenceRepository;

    public CompetenceService(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }
    public List<CompetenceDto> getAllCompetences() {
       return competenceRepository.findAll()
               .stream()
               .map(CompetenceMapper::ToDo)
               .collect(Collectors.toList());

    }
    public CompetenceDto CreateCompetence(CompetenceDto competenceDto) {
    Competence competence = CompetenceMapper.ToEntity(competenceDto);
    Competence savedCompetence = competenceRepository.save(competence);
    return CompetenceMapper.ToDo(savedCompetence);
    }
}
