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
@Table(name = "vw_md_resumen_capasgeo", schema = "sigeia")

public class VwMdResumenCapasgeo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id")
    @Id
    private Integer id;
    @Column(name = "observacion")
    private String observacion;
    @Column(name = "escala")
    private String escala;
    @Column(name = "autor_fuente")
    private String autorFuente;
    @Column(name = "ae")
    private Boolean ae;
    @Column(name = "ac")
    private Boolean ac;

    public VwMdResumenCapasgeo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getAutorFuente() {
        return autorFuente;
    }

    public void setAutorFuente(String autorFuente) {
        this.autorFuente = autorFuente;
    }

    public Boolean getAe() {
        return ae;
    }

    public void setAe(Boolean ae) {
        this.ae = ae;
    }

    public Boolean getAc() {
        return ac;
    }

    public void setAc(Boolean ac) {
        this.ac = ac;
    }
    
}
