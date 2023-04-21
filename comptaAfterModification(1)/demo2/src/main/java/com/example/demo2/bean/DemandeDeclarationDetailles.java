package com.example.demo2.bean;

import javax.persistence.*;

@Entity
public class DemandeDeclarationDetailles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long demande_declaration_detailles_id;
    private String ref;
    private String pathFichier;
    private String description;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "demande_declaration_id")
    private DemandeDeclaration demandeDeclaration;

    public Long getId() {
        return demande_declaration_detailles_id;
    }

    public void setId(Long id) {
        this.demande_declaration_detailles_id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getPathFichier() {
        return pathFichier;
    }

    public void setPathFichier(String pathFichier) {
        this.pathFichier = pathFichier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DemandeDeclaration getDemandeDeclaration() {
        return demandeDeclaration;
    }

    public void setDemandeDeclaration(DemandeDeclaration demandeDeclaration) {
        this.demandeDeclaration = demandeDeclaration;
    }
}
