package com.enaa.brief_service.mapper;

import com.enaa.brief_service.dto.BriefDto;
import com.enaa.brief_service.model.Brief;
import com.enaa.brief_service.model.Competence;

import java.util.List;
import java.util.stream.Collectors;

public class BriefMapper {
    public static BriefDto toDTO(Brief brief) {
        BriefDto dto = new BriefDto();
        dto.setId(brief.getId());
        dto.setTitre(brief.getTitre());
        dto.setDecription(brief.getDecription());
        dto.setDateDebut(brief.getDateDebut());
        dto.setDateFin(brief.getDateFin());
        dto.setIdFormateur(brief.getIdFormateur());
        List<String> noms = brief.getCompetences()
                .stream()
                .map(Competence::getNom)
                .collect(Collectors.toList());

        dto.setCompetenceNoms(noms);
        return dto;
    }

    public static Brief toEntity(BriefDto dto) {
        Brief brief = new Brief();
        brief.setId(dto.getId());
        brief.setTitre(dto.getTitre());
        brief.setDecription(dto.getDecription());
        brief.setDateDebut(dto.getDateDebut());
        brief.setDateFin(dto.getDateFin());
        brief.setIdFormateur(dto.getIdFormateur());
        return brief;
    }
}
