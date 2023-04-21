package com.example.demo2.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class CategorieDeclaration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categorie_declaration_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateMin;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateMax;
    private String code;
    private Double prixParFac;
    private String libelle;

    @OneToMany(mappedBy = "categorieDeclaration", cascade = CascadeType.ALL)
    private List<DemandeDeclaration> demandeDeclarations;

    public Long getId() {
        return categorie_declaration_id;
    }

    public void setId(Long id) {
        this.categorie_declaration_id = id;
    }

    public Date getDateMin() {
        return dateMin;
    }

    public void setDateMin(Date dateMin) {
        this.dateMin = dateMin;
    }

    public Date getDateMax() {
        return dateMax;
    }

    public void setDateMax(Date dateMax) {
        this.dateMax = dateMax;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrixParFac() {
        return prixParFac;
    }

    public void setPrixParFac(Double prixParFac) {
        this.prixParFac = prixParFac;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
