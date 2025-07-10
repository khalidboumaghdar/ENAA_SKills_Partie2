package com.enaa.brief_service.repository;

import com.enaa.brief_service.model.Competence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompetenceRepository extends JpaRepository<Competence, Long> {
    List<Competence> findByNomIn(List<String> noms);

}
