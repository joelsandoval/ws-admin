package com.semarnat.dgira.admin.repos;


import com.semarnat.dgira.admin.model.vistas.VwMdResumenMet;
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
public interface MdResumenMetRepository extends CrudRepository<VwMdResumenMet, Integer> {

    
      
        //Links
    @Query(value = "select * from sigeia.vw_md_resumen_met vmrm where vmrm.id_capa = :capa order by descripcion desc" +
"        ", nativeQuery = true)
   List<VwMdResumenMet> dameVwMdResumenMet(@Param("capa") Integer capa); 
        
    }

