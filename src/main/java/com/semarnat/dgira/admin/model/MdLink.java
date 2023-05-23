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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author eduardo.trujillo
 */
@Entity
@Table(name = "md_link", schema = "sigeia")
@NamedQueries({
    @NamedQuery(name = "MdLink.findAll", query = "SELECT m FROM MdLink m")})
public class MdLink implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "url")
    private String url;
    @Column(name = "sitio")
    private String sitio;
    //@JoinColumn(name = "id_capa", referencedColumnName = "id")
    //@ManyToOne
    //private Layer idCapa;

    public MdLink() {
    }

    public MdLink(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

   // public Layer getIdCapa() {
 //      return idCapa;
   // }

   // public void setIdCapa(Layer idCapa) {
    //   this.idCapa = idCapa;
   // }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdLink)) {
            return false;
        }
        MdLink other = (MdLink) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.semarnat.dgira.admin.MdLink[ id=" + id + " ]";
    }
    
}
