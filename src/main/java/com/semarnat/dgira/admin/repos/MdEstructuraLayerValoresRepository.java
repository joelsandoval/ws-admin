package com.semarnat.dgira.admin.repos;


import com.semarnat.dgira.admin.model.vistas.VwMdEstructuraLayer;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eduaro.trujillo
 */
//@Service
@Repository
public interface MdEstructuraLayerValoresRepository extends CrudRepository<VwMdEstructuraLayer, Integer> {

    
    //Consulta por tema y por inciso
    @Query(value = "select * from sigeia.vw_md_estructura_layer vmel where vmel.layer_id  = :capa and vmel.padre = :padre order by vmel.id_estructura" +
"        ", nativeQuery = true)
   List<VwMdEstructuraLayer> dameEstVal(@Param("capa") Integer layer_id,@Param("padre") Integer padre); 
    
    
           
    }

