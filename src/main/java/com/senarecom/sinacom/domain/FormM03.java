package com.senarecom.sinacom.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FormM03 {

    private int formM03Id;
    private String code;
    private int comercialInvoiceNumber;
    private String analysisCertificate;
    private LocalDate commercialInvoiceDate;
    private LocalDate exportDate;
    private String buyerSocialReason;
    private double valueFobDollars;
    private Integer productPresentationId;
    private double grossWetWeightKilograms;
    private double taraKilograms;
    private double wetNetWeightKilograms;
    private double humidityPercentage;
    private double decreasePercentage;
    private double decreaseKilograms;
    private double netDryWeightKilograms;
    private String lotNumber;
    private double totalGrossValueSaleDollars;
    private double totalGrossValueSaleBolivianos;
    private double expenditureRealizationPercentage;
    private double netValueSaleBolivianos;
    private double costMarketingPercentage;
    private double totalInstitutionalDeductionsBolivians;
    private double liquidPayableBolivianos;
    private ParametricProductPresentation parametricProductPresentation;
    private Integer exporterId;
    private Exporter exporter;

    /*
   Variables que debe guardar de forma interna y que no pueden ser nulas
    */
    private boolean active;


    public Integer getExporterId() {
        return exporterId;
    }

    public void setExporterId(Integer exporterId) {
        this.exporterId = exporterId;
    }

    public Exporter getExporter() {
        return exporter;
    }

    public void setExporter(Exporter exporter) {
        this.exporter = exporter;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getFormM03Id() {
        return formM03Id;
    }

    public void setFormM03Id(int formM03Id) {
        this.formM03Id = formM03Id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getComercialInvoiceNumber() {
        return comercialInvoiceNumber;
    }

    public void setComercialInvoiceNumber(int comercialInvoiceNumber) {
        this.comercialInvoiceNumber = comercialInvoiceNumber;
    }

    public String getAnalysisCertificate() {
        return analysisCertificate;
    }

    public void setAnalysisCertificate(String analysisCertificate) {
        this.analysisCertificate = analysisCertificate;
    }

    public LocalDate getCommercialInvoiceDate() {
        return commercialInvoiceDate;
    }

    public void setCommercialInvoiceDate(LocalDate commercialInvoiceDate) {
        this.commercialInvoiceDate = commercialInvoiceDate;
    }

    public ParametricProductPresentation getParametricProductPresentation() {
        return parametricProductPresentation;
    }

    public void setParametricProductPresentation(ParametricProductPresentation parametricProductPresentation) {
        this.parametricProductPresentation = parametricProductPresentation;
    }

    public LocalDate getExportDate() {
        return exportDate;
    }

    public void setExportDate(LocalDate exportDate) {
        this.exportDate = exportDate;
    }

    public String getBuyerSocialReason() {
        return buyerSocialReason;
    }

    public void setBuyerSocialReason(String buyerSocialReason) {
        this.buyerSocialReason = buyerSocialReason;
    }

    public double getValueFobDollars() {
        return valueFobDollars;
    }

    public void setValueFobDollars(double valueFobDollars) {
        this.valueFobDollars = valueFobDollars;
    }

    public Integer getProductPresentationId() {
        return productPresentationId;
    }

    public void setProductPresentationId(Integer productPresentationId) {
        this.productPresentationId = productPresentationId;
    }

    public double getGrossWetWeightKilograms() {
        return grossWetWeightKilograms;
    }

    public void setGrossWetWeightKilograms(double grossWetWeightKilograms) {
        this.grossWetWeightKilograms = grossWetWeightKilograms;
    }

    public double getTaraKilograms() {
        return taraKilograms;
    }

    public void setTaraKilograms(double taraKilograms) {
        this.taraKilograms = taraKilograms;
    }

    public double getWetNetWeightKilograms() {
        return wetNetWeightKilograms;
    }

    public void setWetNetWeightKilograms(double wetNetWeightKilograms) {
        this.wetNetWeightKilograms = wetNetWeightKilograms;
    }

    public double getHumidityPercentage() {
        return humidityPercentage;
    }

    public void setHumidityPercentage(double humidityPercentage) {
        this.humidityPercentage = humidityPercentage;
    }

    public double getDecreasePercentage() {
        return decreasePercentage;
    }

    public void setDecreasePercentage(double decreasePercentage) {
        this.decreasePercentage = decreasePercentage;
    }

    public double getDecreaseKilograms() {
        return decreaseKilograms;
    }

    public void setDecreaseKilograms(double decreaseKilograms) {
        this.decreaseKilograms = decreaseKilograms;
    }

    public double getNetDryWeightKilograms() {
        return netDryWeightKilograms;
    }

    public void setNetDryWeightKilograms(double netDryWeightKilograms) {
        this.netDryWeightKilograms = netDryWeightKilograms;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public double getTotalGrossValueSaleDollars() {
        return totalGrossValueSaleDollars;
    }

    public void setTotalGrossValueSaleDollars(double totalGrossValueSaleDollars) {
        this.totalGrossValueSaleDollars = totalGrossValueSaleDollars;
    }

    public double getTotalGrossValueSaleBolivianos() {
        return totalGrossValueSaleBolivianos;
    }

    public void setTotalGrossValueSaleBolivianos(double totalGrossValueSaleBolivianos) {
        this.totalGrossValueSaleBolivianos = totalGrossValueSaleBolivianos;
    }

    public double getExpenditureRealizationPercentage() {
        return expenditureRealizationPercentage;
    }

    public void setExpenditureRealizationPercentage(double expenditureRealizationPercentage) {
        this.expenditureRealizationPercentage = expenditureRealizationPercentage;
    }

    public double getNetValueSaleBolivianos() {
        return netValueSaleBolivianos;
    }

    public void setNetValueSaleBolivianos(double netValueSaleBolivianos) {
        this.netValueSaleBolivianos = netValueSaleBolivianos;
    }

    public double getCostMarketingPercentage() {
        return costMarketingPercentage;
    }

    public void setCostMarketingPercentage(double costMarketingPercentage) {
        this.costMarketingPercentage = costMarketingPercentage;
    }

    public double getTotalInstitutionalDeductionsBolivians() {
        return totalInstitutionalDeductionsBolivians;
    }

    public void setTotalInstitutionalDeductionsBolivians(double totalInstitutionalDeductionsBolivians) {
        this.totalInstitutionalDeductionsBolivians = totalInstitutionalDeductionsBolivians;
    }

    public double getLiquidPayableBolivianos() {
        return liquidPayableBolivianos;
    }

    public void setLiquidPayableBolivianos(double liquidPayableBolivianos) {
        this.liquidPayableBolivianos = liquidPayableBolivianos;
    }
}
