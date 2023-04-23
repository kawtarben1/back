package com.example.demo2.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypePayment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long type_payment_id;
    private String libelle;
    private String code;

    @OneToMany(mappedBy = "typePayment", cascade = CascadeType.ALL)
    private List<PaymentDeclaration> paymentDeclarations;

    public Long getId() {
        return type_payment_id;
    }

    public void setId(Long id) {
        this.type_payment_id = id;
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

    public Long getType_payment_id() {
        return type_payment_id;
    }

    public void setType_payment_id(Long type_payment_id) {
        this.type_payment_id = type_payment_id;
    }

    public List<PaymentDeclaration> getPaymentDeclarations() {
        return paymentDeclarations;
    }

    public void setPaymentDeclarations(List<PaymentDeclaration> paymentDeclarations) {
        this.paymentDeclarations = paymentDeclarations;
    }
}
