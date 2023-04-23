package com.example.demo2.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employe_id;
    private String nom;
    private String prenom;
    private String cin;

    @OneToMany(mappedBy = "employe", cascade = CascadeType.ALL)
    private List<DeclarationIRdetailles> declarationIRdetailles;

    public Long getId() {
        return employe_id;
    }

    public void setId(Long id) {
        this.employe_id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Long getEmploye_id() {
        return employe_id;
    }

    public void setEmploye_id(Long employe_id) {
        this.employe_id = employe_id;
    }

    public List<DeclarationIRdetailles> getDeclarationIRdetailles() {
        return declarationIRdetailles;
    }

    public void setDeclarationIRdetailles(List<DeclarationIRdetailles> declarationIRdetailles) {
        this.declarationIRdetailles = declarationIRdetailles;
    }
}
