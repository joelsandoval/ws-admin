/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.semarnat.dgira.admin.repos;

import com.semarnat.dgira.admin.model.RhPersonas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Anallely
 */
@Repository
public interface RhPersonasRepository extends CrudRepository<RhPersonas, Integer> {

    //Consultas Nativas
    @Query(value = "select distinct rp.id from administracion.rh_personas rp", nativeQuery = true)
    List<Integer> damePersona();

    @Query(value = "select * from administracion.rh_personas p \n"
            + "where extract(month from p.fecha_nacimiento) = :mes order by fecha_nacimiento", nativeQuery = true)
    List<RhPersonas> dameCumpleaniosMes(@Param("mes") Integer mes);

}
