package com.enaa.brief_service.mapper;

import com.enaa.brief_service.dto.CompetenceDto;
import com.enaa.brief_service.model.Competence;

public class CompetenceMapper {
    public static CompetenceDto ToDo(Competence competence){
        CompetenceDto competenceDto = new CompetenceDto();
        competenceDto.setId(competence.getId());
        competenceDto.setNom(competence.getNom());
        competenceDto.setDescription(competence.getDescription());
        return competenceDto;
    }
    public static Competence ToEntity(CompetenceDto competenceDto){
        Competence competence = new Competence();
        competence.setId(competenceDto.getId());
        competence.setNom(competenceDto.getNom());
        competence.setDescription(competenceDto.getDescription());
        return competence;
    }
}
