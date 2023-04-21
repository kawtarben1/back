package com.example.demo2.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long societe_id;
    private String ice;
    private String libelle;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "categorie_societe_id")
    private CategorieSociete categorieSociete;

    @OneToMany(mappedBy = "societe", cascade = CascadeType.ALL)
    private List<DemandeDeclaration> demandeDeclarations;

    public Long getId() {

        return societe_id;
    }

    public void setId(Long id) {
        this.societe_id = id;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public CategorieSociete getCategorieSociete() {
        return categorieSociete;
    }

    public void setCategorieSociete(CategorieSociete categorieSociete) {
        this.categorieSociete = categorieSociete;
    }
}
