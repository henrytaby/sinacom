package com.senarecom.sinacom.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "presentacion_producto",schema = "parametrica")
public class ParametricaPresentacionProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idPresentacionProductoId;

    private String descripcion;
    private Boolean activo;

    /*
    @Column(name="usuario_registro")
    private String usuarioRegistro;

    @Column(name="fecha_registro")
    private Timestamp fechaRegistro;

    @Column(name="usuario_ultima_modificacion")
    private String usuarioUltimaModificacion;

    @Column(name="fecha_ultima_modificacion")
    private Timestamp fechaUltimaModificacion;
*/
    @OneToMany(mappedBy = "parametricaPresentacionProducto")
    private List<FormularioM03> formularioM03s;


    public Integer getIdPresentacionProductoId() {
        return idPresentacionProductoId;
    }

    public void setIdPresentacionProductoId(Integer idPresentacionProductoId) {
        this.idPresentacionProductoId = idPresentacionProductoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public List<FormularioM03> getFormularioM03s() {
        return formularioM03s;
    }

    public void setFormularioM03s(List<FormularioM03> formularioM03s) {
        this.formularioM03s = formularioM03s;
    }
}
