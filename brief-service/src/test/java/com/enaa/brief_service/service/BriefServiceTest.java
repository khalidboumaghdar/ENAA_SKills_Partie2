package com.enaa.brief_service.service;

import com.enaa.brief_service.dto.BriefDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BriefServiceTest {
@Autowired
private BriefService briefService;
    @Test
    void getAllBriefs() {
        BriefDto briefDto = new BriefDto();
        briefDto.setTitre("Brief");
        BriefDto newBriefDto1 = briefService.CreateBrief(briefDto);
        List<BriefDto> briefDtos = briefService.getAllBriefs();
        assertNotNull(briefDtos);
        assertTrue(briefDtos.size()>0);

    }

    @Test
    void createBrief() {
        BriefDto briefDto = new BriefDto();
        briefDto.setTitre("Brief");
        BriefDto newBriefDto1 = briefService.CreateBrief(briefDto);
        assertNotNull(newBriefDto1);
        assertEquals("Brief", newBriefDto1.getTitre());

    }
}