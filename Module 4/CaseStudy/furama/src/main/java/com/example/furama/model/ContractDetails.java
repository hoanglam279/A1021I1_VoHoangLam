package com.example.furama.model;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class ContractDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractDetailsId;

    @ManyToOne
    @JoinColumn(name = "contract_id" )
    private Contract contractId;


    @ManyToOne
    @JoinColumn(name = "attach_service_id")
    private AttachService attachServiceId;

    @NumberFormat
    @NotEmpty
    private int quality;

    public ContractDetails() {
    }

    public Integer getContractDetailsId() {
        return contractDetailsId;
    }

    public void setContractDetailsId(Integer contractDetailsId) {
        this.contractDetailsId = contractDetailsId;
    }

    public Contract getContractId() {
        return contractId;
    }

    public void setContractId(Contract contractId) {
        this.contractId = contractId;
    }

    public AttachService getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(AttachService attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
