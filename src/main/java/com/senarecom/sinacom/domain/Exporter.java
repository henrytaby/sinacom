package com.senarecom.sinacom.domain;

public class Exporter {
    private int exporterId;
    private String nimNumber;
    private String nitNumber;
    private String businessName;
    private String ruexNumber;

    public Integer getExporterId() {
        return exporterId;
    }

    public void setExporterId(Integer exporterId) {
        this.exporterId = exporterId;
    }

    public String getNimNumber() {
        return nimNumber;
    }

    public void setNimNumber(String nimNumber) {
        this.nimNumber = nimNumber;
    }

    public String getNitNumber() {
        return nitNumber;
    }

    public void setNitNumber(String nitNumber) {
        this.nitNumber = nitNumber;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getRuexNumber() {
        return ruexNumber;
    }

    public void setRuexNumber(String ruexNumber) {
        this.ruexNumber = ruexNumber;
    }
}
