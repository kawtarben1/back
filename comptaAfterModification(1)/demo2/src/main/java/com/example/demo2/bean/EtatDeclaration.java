package com.example.demo2.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EtatDeclaration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long etat_declaration_id;
    private String libelle;
    private String code;

    public Long getId() {
        return etat_declaration_id;
    }

    public void setId(Long id) {
        this.etat_declaration_id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
