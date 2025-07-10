package com.enaa.brief_service.controller;

import com.enaa.brief_service.dto.BriefDto;
import com.enaa.brief_service.service.BriefService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brief")
public class BriefController {
    private final BriefService briefService;
    public BriefController(BriefService briefService) {
        this.briefService = briefService;
    }
    @GetMapping
public List<BriefDto> getAllBriefs() {
        return briefService.getAllBriefs();
}
@PostMapping
    public BriefDto addBrief(@RequestBody BriefDto briefDto) {
        return briefService.CreateBrief(briefDto);
}


}
