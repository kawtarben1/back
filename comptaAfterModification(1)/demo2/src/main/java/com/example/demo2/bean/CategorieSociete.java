package com.example.demo2.bean;

import javax.persistence.*;
import java.util.List;

@Entity

public class CategorieSociete {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categorie_societe_id;
    private String libelle;
    private String code;

    @OneToMany(mappedBy = "categorieSociete", cascade = CascadeType.ALL)
    private List<Societe> societes;

    public Long getId() {
        return categorie_societe_id;
    }

    public void setId(Long id) {
        this.categorie_societe_id = id;
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

    public Long getCategorie_societe_id() {
        return categorie_societe_id;
    }

    public void setCategorie_societe_id(Long categorie_societe_id) {
        this.categorie_societe_id = categorie_societe_id;
    }

    public List<Societe> getSocietes() {
        return societes;
    }

    public void setSocietes(List<Societe> societes) {
        this.societes = societes;
    }
}
