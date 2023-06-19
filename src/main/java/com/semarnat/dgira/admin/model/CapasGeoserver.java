/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semarnat.dgira.admin.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eduardo.trujillo
 */
@Entity
@Table(name = "capas_geoserver", schema = "sigeia")

public class CapasGeoserver implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "wms")
    private String wms;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "prefix")
    private String prefix;
    @Column(name = "name_id")
    private String nameId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "minx")
    private Float minx;
    @Column(name = "miny")
    private Float miny;
    @Column(name = "maxx")
    private Float maxx;
    @Column(name = "maxy")
    private Float maxy;
    @Column(name = "orden")
    private Integer orden;
    @Column(name = "type")
    private Integer type;
    @Column(name = "zoom")
    private Integer zoom;
    @Column(name = "url_base")
    private String urlBase;
    @Column(name = "opciones")
    private String opciones;
    @Column(name = "ae")
    private Boolean ae;
    @Column(name = "ac")
    private Boolean ac;
    @Column(name = "observacion")
    private String observacion;
    @Column(name = "escala")
    private String escala;
    @Column(name = "autor_fuente")
    private String autorFuente;

    public CapasGeoserver() {
    }

    public CapasGeoserver(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getWms() {
        return wms;
    }

    public void setWms(String wms) {
        this.wms = wms;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public Float getMinx() {
        return minx;
    }

    public void setMinx(Float minx) {
        this.minx = minx;
    }

    public Float getMiny() {
        return miny;
    }

    public void setMiny(Float miny) {
        this.miny = miny;
    }

    public Float getMaxx() {
        return maxx;
    }

    public void setMaxx(Float maxx) {
        this.maxx = maxx;
    }

    public Float getMaxy() {
        return maxy;
    }

    public void setMaxy(Float maxy) {
        this.maxy = maxy;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public void setUrlBase(String urlBase) {
        this.urlBase = urlBase;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CapasGeoserver)) {
            return false;
        }
        CapasGeoserver other = (CapasGeoserver) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.semarnat.dgira.admin.model.CapasGeoserver[ id=" + id + " ]";
    }
    
}
