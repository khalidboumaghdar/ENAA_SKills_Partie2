package com.enaa.brief_service.controller;

import com.enaa.brief_service.dto.CompetenceDto;
import com.enaa.brief_service.model.Competence;
import com.enaa.brief_service.service.CompetenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/competence")
public class CompetenceController {
    private final CompetenceService competenceService;
    public CompetenceController(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }
    @GetMapping
    public List<CompetenceDto> getCompetences() {
        return  competenceService.getAllCompetences();
    }
@PostMapping
    public CompetenceDto createCompetence(@RequestBody CompetenceDto competenceDto) {
        return competenceService.CreateCompetence(competenceDto);
}
}
