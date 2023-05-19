/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semarnat.dgira.admin.model.generic;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Anallely
 */
@Entity
@Table(name = "vw_empleados")
@NamedQueries({
    @NamedQuery(name = "VwEmpleados.findAll", query = "SELECT v FROM VwEmpleados v")})
public class VwEmpleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id")
    @Id
    private Integer id;
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Column(name = "nombre_puesto")
    private String nombrePuesto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "dir_corto")
    private String dirCorto;
    @Column(name = "activo")
    private Boolean activo;

    public VwEmpleados() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirCorto() {
        return dirCorto;
    }

    public void setDirCorto(String dirCorto) {
        this.dirCorto = dirCorto;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
}
