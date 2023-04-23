package com.example.demo2.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class DeclarationIRdetailles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long declarationir_detailles_id;
    private String code;
    private Double salaireEmployeNet;
    private Double salaireEmployeBrute;
    private Double montantIR;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "txIR_id",referencedColumnName = "tauxir_id")
    private TauxIR tauxIR;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DMD_DCLRT_ID",referencedColumnName = "demande_declaration_id")
    private DemandeDeclaration demandeDeclaration;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EPLY_ID",referencedColumnName = "employe_id")
    private Employe employe;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DCLRT_IR_ID",referencedColumnName = "declarationir_id")
    private DeclarationIR declarationIR;


    public DeclarationIR getDeclarationIR() {
        return declarationIR;
    }

    public void setDeclarationIR(DeclarationIR declarationIR) {
        this.declarationIR = declarationIR;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return declarationir_detailles_id;
    }

    public void setId(Long id) {
        this.declarationir_detailles_id = id;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Double getSalaireEmployeNet() {
        return salaireEmployeNet;
    }

    public void setSalaireEmployeNet(Double salaireEmploye) {
        this.salaireEmployeNet = salaireEmploye;
    }

    public Double getSalaireEmployeBrute() {
        return salaireEmployeBrute;
    }

    public void setSalaireEmployeBrute(Double salaireEmployeBrute) {
        this.salaireEmployeBrute = salaireEmployeBrute;
    }

    public TauxIR getTauxIR() {
        return tauxIR;
    }

    public void setTauxIR(TauxIR tauxIR) {
        this.tauxIR = tauxIR;
    }

    public Double getMontantIR() {
        return montantIR;
    }

    public void setMontantIR(Double montantIR) {
        this.montantIR = montantIR;
    }

    public Long getDeclarationir_detailles_id() {
        return declarationir_detailles_id;
    }

    public void setDeclarationir_detailles_id(Long declarationir_detailles_id) {
        this.declarationir_detailles_id = declarationir_detailles_id;
    }

    public DemandeDeclaration getDemandeDeclaration() {
        return demandeDeclaration;
    }

    public void setDemandeDeclaration(DemandeDeclaration demandeDeclaration) {
        this.demandeDeclaration = demandeDeclaration;
    }
}
