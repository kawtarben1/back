package com.example.demo2.bean;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class DeclarationIR {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long declarationir_id;
    private String code;

    private Double totalTaxe;
    private Double salaireTotalNet;
    private Double salaireTotalBrute;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @OneToMany(mappedBy = "declarationIR", cascade = CascadeType.ALL)
    private List<DeclarationIRdetailles> declarationIRdetailles;

    public Long getId() {
        return declarationir_id;
    }

    public void setId(Long id) {
        this.declarationir_id = id;
    }

    public Double getTotalTaxe() {
        return totalTaxe;
    }

    public void setTotalTaxe(Double totalTaxe) {
        this.totalTaxe = totalTaxe;
    }

    public Double getSalaireTotalNet() {
        return salaireTotalNet;
    }

    public void setSalaireTotalNet(Double salaireTotalNet) {
        this.salaireTotalNet = salaireTotalNet;
    }

    public Double getSalaireTotalBrute() {
        return salaireTotalBrute;
    }

    public void setSalaireTotalBrute(Double salaireTotalBrute) {
        this.salaireTotalBrute = salaireTotalBrute;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<DeclarationIRdetailles> getDeclarationIRdetailles() {
        return declarationIRdetailles;
    }

    public void setDeclarationIRdetailles(List<DeclarationIRdetailles> declarationIRdetailles) {
        this.declarationIRdetailles = declarationIRdetailles;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
