package com.semarnat.dgira.admin.repos;

import com.semarnat.dgira.admin.model.vistas.VwMdResumenCapasgeo;
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
public interface MdResumenCapasGeoRepository extends CrudRepository<VwMdResumenCapasgeo, Integer> {

    //Links
    @Query(value = "select * from sigeia.vw_md_resumen_capasgeo vmrc where vmrc.id = :capa"
            + "        ", nativeQuery = true)
    VwMdResumenCapasgeo dameVwMdResumenCapasGeo(@Param("capa") Integer capa);

}
