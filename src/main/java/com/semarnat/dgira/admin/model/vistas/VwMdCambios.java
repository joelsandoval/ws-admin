/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semarnat.dgira.admin.model.vistas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author eduardo.trujillo
 */
@Entity
@Table(name = "vw_md_cambios", schema = "sigeia")
@NamedQueries({
    @NamedQuery(name = "VwMdCambios.findAll", query = "SELECT v FROM VwMdCambios v")})
public class VwMdCambios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id")
    @Id
    private Integer id;
    @Column(name = "id_capa")
    private Integer idCapa;
    @Column(name = "tipo")
    private Integer tipo;
    @Column(name = "fecha_cambio")
    @Temporal(TemporalType.DATE)
    private Date fechaCambio;
    @Column(name = "observacion")
    private String observacion;

    public VwMdCambios() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCapa() {
        return idCapa;
    }

    public void setIdCapa(Integer idCapa) {
        this.idCapa = idCapa;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
}
