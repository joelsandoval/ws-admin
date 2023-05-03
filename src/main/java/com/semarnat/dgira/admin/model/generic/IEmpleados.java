/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.semarnat.dgira.admin.model.generic;

import java.util.Date;







/**
 *
 * @author Anallely
 */

//se creo la interface para seleccionar estos campos
public interface IEmpleados {
    Integer getId();
    String getNombreCompleto();
    String getProfesion();
    Date getFechaNacimiento();
    Date getFechaAlta();
    String getTelefono();
    String getCorreo();
    Boolean getActivo();
    
    
    
}
