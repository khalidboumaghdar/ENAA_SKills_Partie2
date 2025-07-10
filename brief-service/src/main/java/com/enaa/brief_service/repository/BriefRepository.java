package com.enaa.brief_service.repository;

import com.enaa.brief_service.model.Brief;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BriefRepository extends JpaRepository<Brief,Long> {
}
