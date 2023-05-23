package com.semarnat.dgira.admin.repos;


import com.semarnat.dgira.admin.model.MdEstructura;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eduaro.trujillo
 */
//@Service
@Repository
public interface MdIncisosRepository extends CrudRepository<MdEstructura, Integer> {

    
         //Consulta por los 9 incisos de la estructura de los metadatos
    @Query(value = "select distinct  * from sigeia.md_estructura md\n" +
"where md.nivel = 1 order by id", nativeQuery = true)
    List<MdEstructura> dameInciso();
    
                    
    }

