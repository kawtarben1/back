package com.example.demo2.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Comptable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long comptable_id;
    private String cin;
    private String nom;
    private String prenom;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="ctgr_ctbl_id" ,referencedColumnName = "categorie_comptable_id")
    private CategorieComptable categorieComptable;

    @OneToMany(mappedBy = "comptableDeclarant", cascade = CascadeType.ALL)
    private List<DemandeDeclaration> comptableDeclarants;

    @OneToMany(mappedBy = "comptableVerifiant", cascade = CascadeType.ALL)
    private List<DemandeDeclaration> comptableVerifiants;

    public Long getId() {
        return comptable_id;
    }

    public void setId(Long id) {
        this.comptable_id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
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

    public CategorieComptable getCategorieComptable() {
        return categorieComptable;
    }

    public void setCategorieComptable(CategorieComptable categorieComptable) {
        this.categorieComptable = categorieComptable;
    }

    public Long getComptable_id() {
        return comptable_id;
    }

    public void setComptable_id(Long comptable_id) {
        this.comptable_id = comptable_id;
    }

    public List<DemandeDeclaration> getComptableDeclarants() {
        return comptableDeclarants;
    }

    public void setComptableDeclarants(List<DemandeDeclaration> comptableDeclarants) {
        this.comptableDeclarants = comptableDeclarants;
    }

    public List<DemandeDeclaration> getComptableVerifiants() {
        return comptableVerifiants;
    }

    public void setComptableVerifiants(List<DemandeDeclaration> comptableVerifiants) {
        this.comptableVerifiants = comptableVerifiants;
    }
}
