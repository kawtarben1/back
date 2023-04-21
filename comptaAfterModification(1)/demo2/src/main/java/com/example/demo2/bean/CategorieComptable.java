package com.example.demo2.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class CategorieComptable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categorie_comptable_id;
    private String libelle;
    private String code;
    @OneToMany(mappedBy = "categorieComptable", cascade = CascadeType.ALL)
    private List<Comptable> comptables;

    public Long getId() {
        return categorie_comptable_id;
    }

    public void setId(Long id) {
        this.categorie_comptable_id = id;
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
