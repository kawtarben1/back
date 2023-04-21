package com.example.demo2.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class DemandeDeclaration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long demande_declaration_id;
    private String ref;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDeclaration;
    private Double totalPaye;
    private Double total;
    private Double totalEsps;
    private Double totalNonEsps;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "categorie_declaration_id")
    private CategorieDeclaration categorieDeclaration;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "comptable_id")
    private Comptable comptableDeclarant;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "comptable_id_1" )
    private Comptable comptableVerifiant;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "societe_id")
    private Societe societe;

    @OneToMany(mappedBy = "demandeDeclaration", cascade = CascadeType.ALL)
    private List<DeclarationFacture> declarationFactures;

    @OneToMany(mappedBy = "demandeDeclaration", cascade = CascadeType.ALL)
    private List<DeclarationIRdetailles> declarationIRdetailles;

    @OneToMany(mappedBy = "demandeDeclaration", cascade = CascadeType.ALL)
    private List<DemandeDeclarationDetailles> demandeDeclarationDetailles;

    @OneToMany(mappedBy = "demandeDeclaration", cascade = CascadeType.ALL)
    private List<PaymentDeclaration> paymentDeclarations;



    public Long getId() {
        return demande_declaration_id;
    }

    public void setId(Long id) {
        this.demande_declaration_id = id;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public CategorieDeclaration getCategorieDeclaration() {
        return categorieDeclaration;
    }

    public void setCategorieDeclaration(CategorieDeclaration categorieDeclaration) {
        this.categorieDeclaration = categorieDeclaration;
    }

    public Comptable getComptableDeclarant() {
        return comptableDeclarant;
    }

    public void setComptableDeclarant(Comptable comptableDeclarant) {
        this.comptableDeclarant = comptableDeclarant;
    }

    public Comptable getComptableVerifiant() {
        return comptableVerifiant;
    }

    public void setComptableVerifiant(Comptable comptableVerifiant) {
        this.comptableVerifiant = comptableVerifiant;
    }


    public Double getTotalPaye() {
        return totalPaye;
    }

    public void setTotalPaye(Double totalPaye) {
        this.totalPaye = totalPaye;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setEtatDeclaration(EtatDeclaration newEtatDeclaration) {
    }

    public Double getTotalEsps() {
        return totalEsps;
    }

    public void setTotalEsps(Double totalEsps) {
        this.totalEsps = totalEsps;
    }

    public Double getTotalNonEsps() {
        return totalNonEsps;
    }

    public void setTotalNonEsps(Double totalNonEsps) {
        this.totalNonEsps = totalNonEsps;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }
}
