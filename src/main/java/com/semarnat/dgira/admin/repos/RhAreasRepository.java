/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.semarnat.dgira.admin.repos;

import com.semarnat.dgira.admin.model.RhAreas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Anallely
 */
public interface RhAreasRepository extends CrudRepository<RhAreas, Integer>{
    
    //consulta para traer direccion general y areas
    @Query(value = "select ra.* from administracion.rh_areas ra where ra.parent_id = 0 "
            + "or ra.parent_id = 1", nativeQuery =true)
    List<RhAreas> dameDirecciones();
    
}
