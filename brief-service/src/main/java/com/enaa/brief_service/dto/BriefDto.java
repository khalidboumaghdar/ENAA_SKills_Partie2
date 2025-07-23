package com.enaa.brief_service.dto;

import java.util.Date;
import java.util.List;

public class BriefDto {
    Long id ;
    String titre;
    String decription;
    Date dateDebut;
    Date dateFin;
    Long idFormateur;
    private List<String> competenceNoms;

    public List<String> getCompetenceNoms() {
        return competenceNoms;
    }

    public void setCompetenceNoms(List<String> competenceNoms) {
        this.competenceNoms = competenceNoms;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Long getIdFormateur() {
        return idFormateur;
    }

    public void setIdFormateur(Long idFormateur) {
        this.idFormateur = idFormateur;
    }
}
