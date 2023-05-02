/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.semarnat.dgira.admin.repos;

import com.semarnat.dgira.admin.model.RhPersonas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Anallely
 */
@Repository
public interface RhPersonasRepository extends CrudRepository<RhPersonas, Integer> {

    //Consultas Nativas
    @Query(value = "select rp.id, concat(rp.nombre,' ',rp.apellido_pat,' ',rp.apellido_mat) as nombre_completo,\n"
            + " rpt.nombre_puesto, rn.nombre, ra2.dir_corto,ra.activo\n"
            + "from administracion.rh_personas rp\n"
            + "inner join administracion.rh_adscripcion ra on rp.id = ra.persona\n"
            + "inner join administracion.rh_puesto_tipo rpt on rpt.id = ra.puesto\n"
            + "inner join administracion.rh_nombramiento rn on rn.id = rpt.tipo_nombramiento\n"
            + "inner join administracion.rh_areas ra2 on ra2.id = rpt.tipo_area", nativeQuery = true)
    List<String> dameTpersona();
}
