package com.example.demo2.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class TauxIR {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tauxir_id;
    private double pourcentage;
    private double salaireMin;
    private Double salaireMax;
    private String libelle;

    @OneToMany(mappedBy = "tauxIR", cascade = CascadeType.ALL)
    private List<DeclarationIRdetailles> declarationIRdetailles;

    public Double getSalaireMax() {
        return salaireMax;
    }

    public void setSalaireMax(Double salaireMax) {
        this.salaireMax = salaireMax;
    }

    public double getSalaireMin() {
        return salaireMin;
    }

    public void setSalaireMin(double salaireMin) {
        this.salaireMin = salaireMin;
    }

    public Long getId() {
        return tauxir_id;
    }

    public void setId(Long id) {
        this.tauxir_id = id;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Long getTauxir_id() {
        return tauxir_id;
    }

    public void setTauxir_id(Long tauxir_id) {
        this.tauxir_id = tauxir_id;
    }

    public List<DeclarationIRdetailles> getDeclarationIRdetailles() {
        return declarationIRdetailles;
    }

    public void setDeclarationIRdetailles(List<DeclarationIRdetailles> declarationIRdetailles) {
        this.declarationIRdetailles = declarationIRdetailles;
    }
}
