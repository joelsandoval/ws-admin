package com.semarnat.dgira.admin.repos;


import com.semarnat.dgira.admin.model.vistas.VwMdCambios;
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
public interface MdFechasProcesosRepository extends CrudRepository<VwMdCambios, Integer> {

    
      
        //Fechas y procesos
    @Query(value = "(select * from sigeia.vw_md_cambios c where c.id_capa = :capa and c.tipo = 1)\n" +
"union\n" +
"(select * from sigeia.vw_md_cambios c where c.id_capa = :capa order by fecha_cambio desc limit 1);" +
"        ", nativeQuery = true)
   List<VwMdCambios> dameFecProc(@Param("capa") Integer capa); 
        
    }

