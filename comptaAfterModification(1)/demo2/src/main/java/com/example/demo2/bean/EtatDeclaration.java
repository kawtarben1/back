package com.example.demo2.bean;

import javax.persistence.*;

@Entity
public class EtatDeclaration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long etat_declaration_id;
    private String libelle;
    private String code;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DMD_DCLRTION_ID",referencedColumnName = "demande_declaration_id")
    private DemandeDeclaration demandeDeclaration;

    public Long getId() {
        return etat_declaration_id;
    }

    public void setId(Long id) {
        this.etat_declaration_id = id;
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

    public Long getEtat_declaration_id() {
        return etat_declaration_id;
    }

    public void setEtat_declaration_id(Long etat_declaration_id) {
        this.etat_declaration_id = etat_declaration_id;
    }

    public DemandeDeclaration getDemandeDeclaration() {
        return demandeDeclaration;
    }

    public void setDemandeDeclaration(DemandeDeclaration demandeDeclaration) {
        this.demandeDeclaration = demandeDeclaration;
    }
}
