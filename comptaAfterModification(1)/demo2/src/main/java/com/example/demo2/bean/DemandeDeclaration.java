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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ctgr_dclrt_id",referencedColumnName = "categorie_declaration_id")
    private CategorieDeclaration categorieDeclaration;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ctbl_id",referencedColumnName = "comptable_id")
    private Comptable comptableDeclarant;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ctbl_vrf",referencedColumnName = "comptable_id" )
    private Comptable comptableVerifiant;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sct_id",referencedColumnName = "societe_id")
    private Societe societe;

    @OneToMany(mappedBy = "demandeDeclaration", cascade = CascadeType.ALL)
    private List<DeclarationFacture> declarationFactures;

    @OneToMany(mappedBy = "demandeDeclaration", cascade = CascadeType.ALL)
    private List<DeclarationIRdetailles> declarationIRdetailles;

    @OneToMany(mappedBy = "demandeDeclaration", cascade = CascadeType.ALL)
    private List<DemandeDeclarationDetailles> demandeDeclarationDetailles;

    @OneToMany(mappedBy = "demandeDeclaration", cascade = CascadeType.ALL)
    private List<PaymentDeclaration> paymentDeclarations;

    @OneToMany(mappedBy = "demandeDeclaration", cascade = CascadeType.ALL)
    private List<EtatDeclaration> etatDeclarations;



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

    public Long getDemande_declaration_id() {
        return demande_declaration_id;
    }

    public void setDemande_declaration_id(Long demande_declaration_id) {
        this.demande_declaration_id = demande_declaration_id;
    }

    public List<DeclarationFacture> getDeclarationFactures() {
        return declarationFactures;
    }

    public void setDeclarationFactures(List<DeclarationFacture> declarationFactures) {
        this.declarationFactures = declarationFactures;
    }

    public List<DeclarationIRdetailles> getDeclarationIRdetailles() {
        return declarationIRdetailles;
    }

    public void setDeclarationIRdetailles(List<DeclarationIRdetailles> declarationIRdetailles) {
        this.declarationIRdetailles = declarationIRdetailles;
    }

    public List<DemandeDeclarationDetailles> getDemandeDeclarationDetailles() {
        return demandeDeclarationDetailles;
    }

    public void setDemandeDeclarationDetailles(List<DemandeDeclarationDetailles> demandeDeclarationDetailles) {
        this.demandeDeclarationDetailles = demandeDeclarationDetailles;
    }

    public List<PaymentDeclaration> getPaymentDeclarations() {
        return paymentDeclarations;
    }

    public void setPaymentDeclarations(List<PaymentDeclaration> paymentDeclarations) {
        this.paymentDeclarations = paymentDeclarations;
    }

    public List<EtatDeclaration> getEtatDeclarations() {
        return etatDeclarations;
    }

    public void setEtatDeclarations(List<EtatDeclaration> etatDeclarations) {
        this.etatDeclarations = etatDeclarations;
    }

}
