package com.semarnat.dgira.admin.repos;


import com.semarnat.dgira.admin.model.vistas.VwMdLinks;
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
public interface MdLinksRepository extends CrudRepository<VwMdLinks, Integer> {

    
      
        //Links
    @Query(value = "select * from  sigeia.vw_md_links mdl where mdl.id_capa = :capa" +
"        ", nativeQuery = true)
   List<VwMdLinks> dameLink(@Param("capa") Integer capa); 
        
    }

