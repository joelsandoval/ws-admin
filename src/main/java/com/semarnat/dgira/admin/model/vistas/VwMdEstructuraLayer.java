/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semarnat.dgira.admin.model.vistas;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author eduardo.trujillo
 */
@Entity
@Table(name = "vw_md_estructura_layer", schema = "sigeia")
@NamedQueries({
    @NamedQuery(name = "VwMdEstructuraLayer.findAll", query = "SELECT v FROM VwMdEstructuraLayer v")})
public class VwMdEstructuraLayer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "layer_id")
    private Integer layerId;
    @Column(name = "id_estructura")
    private Integer idEstructura;
    @Column(name = "nivel")
    private Integer nivel;
    @Column(name = "padre")
    private Integer padre;
    @Column(name = "inciso")
    private String inciso;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "valor")
    private String valor;

    public VwMdEstructuraLayer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLayerId() {
        return layerId;
    }

    public void setLayerId(Integer layerId) {
        this.layerId = layerId;
    }

    public Integer getIdEstructura() {
        return idEstructura;
    }

    public void setIdEstructura(Integer idEstructura) {
        this.idEstructura = idEstructura;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getPadre() {
        return padre;
    }

    public void setPadre(Integer padre) {
        this.padre = padre;
    }

    public String getInciso() {
        return inciso;
    }

    public void setInciso(String inciso) {
        this.inciso = inciso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
