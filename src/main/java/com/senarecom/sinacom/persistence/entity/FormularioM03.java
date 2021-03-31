package com.senarecom.sinacom.persistence.entity;

import javax.persistence.*;
import java.time.*;

@Entity
@Table(name = "formulario_m03",schema = "exportacion")
public class FormularioM03 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idFormularioM03;

    @Column(name="id_exportador")
    private Integer idExportador;

    @Column(name="codigo")
    private String codigo;

    @Column(name="numero_factura_comercial")
    private Integer numeroFacturaComercial;

    @Column(name="certificado_analisis")
    private String certificadoAnalisis;

    @Column(name="fecha_factura_comercial")
    private LocalDate fechaFacturaComercial;

    @Column(name="fecha_exportacion")
    private LocalDate fechaExportacion;

    @Column(name="razon_social_comprador")
    private String razonSocialComprador;

    @Column(name="valor_fob_dolares")
    private double valorFobDolares;

    @Column(name="id_presentacion_producto")
    private Integer idPresentacionProducto;

    @Column(name="peso_bruto_humedo_kilogramos")
    private double pesoBrutoHumedoKilogramos;

    @Column(name="tara_kilogramos")
    private double taraKilogramos;

    @Column(name="peso_neto_humedo_kilogramos")
    private double pesoNetoHumedoKilogramos;

    @Column(name="humedad_porcentaje")
    private double humedadPorcentaje;

    @Column(name="merma_porcentaje")
    private double mermaPorcentaje;

    @Column(name="merma_kilogramos")
    private double mermaKilogramos;

    @Column(name="peso_neto_seco_kilogramos")
    private double pesoNetoSecoKilogramos;

    @Column(name="numero_lote")
    private String numeroLote;

    @Column(name="total_valor_bruto_venta_dolares")
    private double totalValorBrutoVentaDolares;

    @Column(name="total_valor_bruto_venta_bolivianos")
    private double totalValorBrutoVentaBolivianos;

    @Column(name="gasto_realizacion_porcentaje")
    private double gastoRealizacionPorcentaje;

    @Column(name="valor_neto_venta_bolivianos")
    private double valorNetoVentaBolivianos;

    @Column(name="costo_comercializacion_porcentaje")
    private double costoComercializacionPorcentaje;

    @Column(name="total_deducciones_institucionales_bolivianos")
    private double totalDeduccionesInstitucionalesBolivianos;

    @Column(name="liquido_pagable_bolivianos")
    private double liquidoPagableBolivianos;
    /*
    Variables que debe guardar de forma interna y que no pueden ser nulas
     */
    private boolean activo;

    @Column(name="usuario_registro")
    private String usuarioRegistro;

    @Column(name="fecha_registro")
    private LocalDateTime fechaRegistro;

    /*
    La relacion de la tabla
     */

    @ManyToOne
    @JoinColumn(name="id_exportador", insertable = false, updatable = false)
    private Exportador exportador;

    @ManyToOne
    @JoinColumn(name="id_presentacion_producto", insertable = false, updatable = false)
    private ParametricaPresentacionProducto parametricaPresentacionProducto;

    public Exportador getExportador() {
        return exportador;
    }

    public void setExportador(Exportador exportador) {
        this.exportador = exportador;
    }

    public FormularioM03(){
        this.activo = true;
        this.usuarioRegistro = "SENARECOM";
        this.fechaRegistro = LocalDateTime.now();
        //this.idExportador = 4;
    }

    public Integer getIdExportador() {
        return idExportador;
    }

    public void setIdExportador(Integer idExportador) {
        this.idExportador = idExportador;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(String usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdFormularioM03() {
        return idFormularioM03;
    }

    public void setIdFormularioM03(Integer idFormularioM03) {
        this.idFormularioM03 = idFormularioM03;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getNumeroFacturaComercial() {
        return numeroFacturaComercial;
    }

    public void setNumeroFacturaComercial(Integer numeroFacturaComercial) {
        this.numeroFacturaComercial = numeroFacturaComercial;
    }

    public String getCertificadoAnalisis() {
        return certificadoAnalisis;
    }

    public void setCertificadoAnalisis(String certificadoAnalisis) {
        this.certificadoAnalisis = certificadoAnalisis;
    }

    public LocalDate getFechaFacturaComercial() {
        return fechaFacturaComercial;
    }

    public void setFechaFacturaComercial(LocalDate fechaFacturaComercial) {
        this.fechaFacturaComercial = fechaFacturaComercial;
    }

    public LocalDate getFechaExportacion() {
        return fechaExportacion;
    }

    public void setFechaExportacion(LocalDate fechaExportacion) {
        this.fechaExportacion = fechaExportacion;
    }

    public String getRazonSocialComprador() {
        return razonSocialComprador;
    }

    public void setRazonSocialComprador(String razonSocialComprador) {
        this.razonSocialComprador = razonSocialComprador;
    }

    public double getValorFobDolares() {
        return valorFobDolares;
    }

    public void setValorFobDolares(double valorFobDolares) {
        this.valorFobDolares = valorFobDolares;
    }

    public Integer getIdPresentacionProducto() {
        return idPresentacionProducto;
    }

    public void setIdPresentacionProducto(Integer idPresentacionProducto) {
        this.idPresentacionProducto = idPresentacionProducto;
    }

    public double getPesoBrutoHumedoKilogramos() {
        return pesoBrutoHumedoKilogramos;
    }

    public void setPesoBrutoHumedoKilogramos(double pesoBrutoHumedoKilogramos) {
        this.pesoBrutoHumedoKilogramos = pesoBrutoHumedoKilogramos;
    }

    public double getTaraKilogramos() {
        return taraKilogramos;
    }

    public void setTaraKilogramos(double taraKilogramos) {
        this.taraKilogramos = taraKilogramos;
    }

    public double getPesoNetoHumedoKilogramos() {
        return pesoNetoHumedoKilogramos;
    }

    public void setPesoNetoHumedoKilogramos(double pesoNetoHumedoKilogramos) {
        this.pesoNetoHumedoKilogramos = pesoNetoHumedoKilogramos;
    }

    public double getHumedadPorcentaje() {
        return humedadPorcentaje;
    }

    public void setHumedadPorcentaje(double humedadPorcentaje) {
        this.humedadPorcentaje = humedadPorcentaje;
    }

    public double getMermaPorcentaje() {
        return mermaPorcentaje;
    }

    public void setMermaPorcentaje(double mermaPorcentaje) {
        this.mermaPorcentaje = mermaPorcentaje;
    }

    public double getMermaKilogramos() {
        return mermaKilogramos;
    }

    public void setMermaKilogramos(double mermaKilogramos) {
        this.mermaKilogramos = mermaKilogramos;
    }

    public double getPesoNetoSecoKilogramos() {
        return pesoNetoSecoKilogramos;
    }

    public void setPesoNetoSecoKilogramos(double pesoNetoSecoKilogramos) {
        this.pesoNetoSecoKilogramos = pesoNetoSecoKilogramos;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public double getTotalValorBrutoVentaDolares() {
        return totalValorBrutoVentaDolares;
    }

    public void setTotalValorBrutoVentaDolares(double totalValorBrutoVentaDolares) {
        this.totalValorBrutoVentaDolares = totalValorBrutoVentaDolares;
    }

    public double getTotalValorBrutoVentaBolivianos() {
        return totalValorBrutoVentaBolivianos;
    }

    public void setTotalValorBrutoVentaBolivianos(double totalValorBrutoVentaBolivianos) {
        this.totalValorBrutoVentaBolivianos = totalValorBrutoVentaBolivianos;
    }

    public double getGastoRealizacionPorcentaje() {
        return gastoRealizacionPorcentaje;
    }

    public void setGastoRealizacionPorcentaje(double gastoRealizacionPorcentaje) {
        this.gastoRealizacionPorcentaje = gastoRealizacionPorcentaje;
    }

    public double getValorNetoVentaBolivianos() {
        return valorNetoVentaBolivianos;
    }

    public void setValorNetoVentaBolivianos(double valorNetoVentaBolivianos) {
        this.valorNetoVentaBolivianos = valorNetoVentaBolivianos;
    }

    public double getCostoComercializacionPorcentaje() {
        return costoComercializacionPorcentaje;
    }

    public void setCostoComercializacionPorcentaje(double costoComercializacionPorcentaje) {
        this.costoComercializacionPorcentaje = costoComercializacionPorcentaje;
    }

    public double getTotalDeduccionesInstitucionalesBolivianos() {
        return totalDeduccionesInstitucionalesBolivianos;
    }

    public void setTotalDeduccionesInstitucionalesBolivianos(double totalDeduccionesInstitucionalesBolivianos) {
        this.totalDeduccionesInstitucionalesBolivianos = totalDeduccionesInstitucionalesBolivianos;
    }

    public double getLiquidoPagableBolivianos() {
        return liquidoPagableBolivianos;
    }

    public void setLiquidoPagableBolivianos(double liquidoPagableBolivianos) {
        this.liquidoPagableBolivianos = liquidoPagableBolivianos;
    }

    public ParametricaPresentacionProducto getParametricaPresentacionProducto() {
        return parametricaPresentacionProducto;
    }

    public void setParametricaPresentacionProducto(ParametricaPresentacionProducto parametricaPresentacionProducto) {
        this.parametricaPresentacionProducto = parametricaPresentacionProducto;
    }
}
