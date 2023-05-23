/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semarnat.dgira.admin.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author eduardo.trujillo
 */
@Entity
@Table(name = "layer", schema = "sigeia")
@NamedQueries({
    @NamedQuery(name = "Layer.findAll", query = "SELECT l FROM Layer l")})
public class Layer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "wms")
    private String wms;
    @Basic(optional = false)
    @Column(name = "id_parent")
    private int idParent;
    @Basic(optional = false)
    @Column(name = "status")
    private boolean status;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIME)
    private Date createdDate;
    @Column(name = "updated_date")
    @Temporal(TemporalType.TIME)
    private Date updatedDate;
    @Basic(optional = false)
    @Column(name = "fk_id_user")
    private int fkIdUser;
    @Column(name = "metadata")
    private String metadata;
    @Column(name = "prefix")
    private String prefix;
    @Column(name = "type")
    private Integer type;
    @Column(name = "url_wms")
    private String urlWms;
    @Basic(optional = false)
    @Column(name = "orden_arbol")
    private int ordenArbol;
    @Column(name = "name_id")
    private String nameId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "xs")
    private Double xs;
    @Column(name = "xi")
    private Double xi;
    @Column(name = "ys")
    private Double ys;
    @Column(name = "yi")
    private Double yi;
    @Column(name = "active")
    private Integer active;
    @Column(name = "ae")
    private Boolean ae;
    @Column(name = "ac")
    private Boolean ac;
   
    public Layer() {
    }

    public Layer(Integer id) {
        this.id = id;
    }

    public Layer(Integer id, String name, String wms, int idParent, boolean status, int fkIdUser, int ordenArbol) {
        this.id = id;
        this.name = name;
        this.wms = wms;
        this.idParent = idParent;
        this.status = status;
        this.fkIdUser = fkIdUser;
        this.ordenArbol = ordenArbol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWms() {
        return wms;
    }

    public void setWms(String wms) {
        this.wms = wms;
    }

    public int getIdParent() {
        return idParent;
    }

    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getFkIdUser() {
        return fkIdUser;
    }

    public void setFkIdUser(int fkIdUser) {
        this.fkIdUser = fkIdUser;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrlWms() {
        return urlWms;
    }

    public void setUrlWms(String urlWms) {
        this.urlWms = urlWms;
    }

    public int getOrdenArbol() {
        return ordenArbol;
    }

    public void setOrdenArbol(int ordenArbol) {
        this.ordenArbol = ordenArbol;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public Double getXs() {
        return xs;
    }

    public void setXs(Double xs) {
        this.xs = xs;
    }

    public Double getXi() {
        return xi;
    }

    public void setXi(Double xi) {
        this.xi = xi;
    }

    public Double getYs() {
        return ys;
    }

    public void setYs(Double ys) {
        this.ys = ys;
    }

    public Double getYi() {
        return yi;
    }

    public void setYi(Double yi) {
        this.yi = yi;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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

       @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Layer)) {
            return false;
        }
        Layer other = (Layer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.semarnat.dgira.admin.Layer[ id=" + id + " ]";
    }
    
}
