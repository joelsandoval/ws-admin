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
@Table(name = "md_layer", schema = "sigeia")
@NamedQueries({
    @NamedQuery(name = "MdLayer.findAll", query = "SELECT m FROM MdLayer m")})
public class MdLayer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "valor")
    private String valor;
    @JoinColumn(name = "capa", referencedColumnName = "id")
    @ManyToOne
    private Layer capa;
    @JoinColumn(name = "estructura", referencedColumnName = "id")
    @ManyToOne
    private MdEstructura estructura;

    public MdLayer() {
    }

    public MdLayer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Layer getCapa() {
        return capa;
    }

    public void setCapa(Layer capa) {
        this.capa = capa;
    }

    public MdEstructura getEstructura() {
        return estructura;
    }

    public void setEstructura(MdEstructura estructura) {
        this.estructura = estructura;
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
        if (!(object instanceof MdLayer)) {
            return false;
        }
        MdLayer other = (MdLayer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.semarnat.dgira.admin.MdLayer[ id=" + id + " ]";
    }
    
}
