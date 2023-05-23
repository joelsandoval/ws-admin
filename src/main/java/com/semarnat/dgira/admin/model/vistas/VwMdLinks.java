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
@Table(name = "vw_md_links", schema = "sigeia")
@NamedQueries({
    @NamedQuery(name = "VwMdLinks.findAll", query = "SELECT v FROM VwMdLinks v")})
public class VwMdLinks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_capa")
    private Integer idCapa;
    @Column(name = "sitio")
    private String sitio;
    @Column(name = "url")
    private String url;

    public VwMdLinks() {
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

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
