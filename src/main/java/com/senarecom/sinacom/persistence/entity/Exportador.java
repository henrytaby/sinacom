package com.senarecom.sinacom.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "exportador",schema = "exportacion")
public class Exportador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idExportador;

    @Column(name="numero_nim")
    private String numeroNim;

    @Column(name="numero_nit")
    private String numeroNit;

    @Column(name="razon_social")
    private String razonSocial;

    @Column(name="numero_ruex")
    private String numeroRuex;

    @OneToMany(mappedBy = "exportador")
    private List<FormularioM03> formularioM03s;

    public List<FormularioM03> getFormularioM03s() {
        return formularioM03s;
    }

    public void setFormularioM03s(List<FormularioM03> formularioM03s) {
        this.formularioM03s = formularioM03s;
    }

    public Integer getIdExportador() {
        return idExportador;
    }

    public void setIdExportador(Integer idExportador) {
        this.idExportador = idExportador;
    }

    public String getNumeroNim() {
        return numeroNim;
    }

    public void setNumeroNim(String numeroNim) {
        this.numeroNim = numeroNim;
    }

    public String getNumeroNit() {
        return numeroNit;
    }

    public void setNumeroNit(String numeroNit) {
        this.numeroNit = numeroNit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNumeroRuex() {
        return numeroRuex;
    }

    public void setNumeroRuex(String numeroRuex) {
        this.numeroRuex = numeroRuex;
    }
}
