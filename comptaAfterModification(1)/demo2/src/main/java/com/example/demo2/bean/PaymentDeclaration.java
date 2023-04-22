package com.example.demo2.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PaymentDeclaration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long payment_declaration_id;
    private String code;
    private Double montant;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date datePayment;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tp_pym_id",referencedColumnName = "type_payment_id")
    private TypePayment typePayment;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "d_m_dclrt_id",referencedColumnName = "demande_declaration_id")
    private DemandeDeclaration demandeDeclaration;


    public Long getId() {
        return payment_declaration_id;
    }

    public void setId(Long id) {
        this.payment_declaration_id = id;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Date getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(Date datePayment) {
        this.datePayment = datePayment;
    }

    public TypePayment getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(TypePayment typePayment) {
        this.typePayment = typePayment;
    }



    public DemandeDeclaration getDemandeDeclaration() {
        return demandeDeclaration;
    }

    public void setDemandeDeclaration(DemandeDeclaration demandeDeclaration) {
        this.demandeDeclaration = demandeDeclaration;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
