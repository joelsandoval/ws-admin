/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semarnat.dgira.admin.model.vistas;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eduardo.trujillo
 */
@Entity
@Table(name = "vw_md_resumen_met", schema = "sigeia")

public class VwMdResumenMet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id")
    @Id
    private String id;
    @Column(name = "id_capa")
    private Integer idCapa;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "valor")
    private String valor;

    public VwMdResumenMet() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIdCapa() {
        return idCapa;
    }

    public void setIdCapa(Integer idCapa) {
        this.idCapa = idCapa;
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
