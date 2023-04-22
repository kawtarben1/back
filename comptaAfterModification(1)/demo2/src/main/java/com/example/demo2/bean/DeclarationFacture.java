package com.example.demo2.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DeclarationFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long declaration_facture_id;
    private String ref;
    private Double montantTTC;
    private Double tva;
    private Double montantHT;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateFacture;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tp_fctr_id",referencedColumnName = "type_facture_id")
    private TypeFacture typeFacture;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dmd_dclrt_id",referencedColumnName = "demande_declaration_id")
    private DemandeDeclaration demandeDeclaration;



    public Long getId() {
        return declaration_facture_id;
    }

    public void setId(Long id) {
        this.declaration_facture_id = id;
    }

    public DemandeDeclaration getDemandeDeclaration() {
        return demandeDeclaration;
    }

    public void setDemandeDeclaration(DemandeDeclaration demandeDeclaration) {
        this.demandeDeclaration = demandeDeclaration;
    }

    public Double getMontantTTC() {
        return montantTTC;
    }

    public void setMontantTTC(Double montantTTC) {
        this.montantTTC = montantTTC;
    }

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

    public Double getMontantHT() {
        return montantHT;
    }

    public void setMontantHT(Double montantHT) {
        this.montantHT = montantHT;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public TypeFacture getTypeFacture() {
        return typeFacture;
    }

    public void setTypeFacture(TypeFacture typeFacture) {
        this.typeFacture = typeFacture;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}

