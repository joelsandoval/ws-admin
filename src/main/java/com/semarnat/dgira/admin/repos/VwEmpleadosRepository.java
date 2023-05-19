/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.semarnat.dgira.admin.repos;

import com.semarnat.dgira.admin.model.generic.VwEmpleados;
import java.util.List;
import static javax.management.Query.value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Anallely
 */
public interface VwEmpleadosRepository extends CrudRepository<VwEmpleados, Integer>{
    
    /**
     *
     * @return
     */
    @Query(value = "select * from administracion.vw_empleados", nativeQuery = true)
    List<VwEmpleados> dameEmpleados();    
}
