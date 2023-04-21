package com.example.demo2.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeFacture {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long type_facture_id;
    private String libelle;
    private String code;

    @OneToMany(mappedBy = "typeFacture", cascade = CascadeType.ALL)
    private List<DeclarationFacture> declarationFactures;

    public Long getId() {
        return type_facture_id;
    }

    public void setId(Long id) {
        this.type_facture_id = id;
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
