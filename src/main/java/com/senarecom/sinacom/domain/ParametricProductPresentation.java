package com.senarecom.sinacom.domain;

public class ParametricProductPresentation {

    private int productPresentationId;
    private String description;
    private boolean active;

    public int getProductPresentationId() {
        return productPresentationId;
    }

    public void setProductPresentationId(int productPresentationId) {
        this.productPresentationId = productPresentationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
