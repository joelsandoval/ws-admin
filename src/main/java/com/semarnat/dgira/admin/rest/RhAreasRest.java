
package com.semarnat.dgira.admin.rest;

import com.semarnat.dgira.admin.model.RhAreas;
import com.semarnat.dgira.admin.model.RhPersonas;
import com.semarnat.dgira.admin.repos.RhAreasRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Anallely
 */

@RestController
@RequestMapping(value = "areas")
@CrossOrigin
public class RhAreasRest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RhAreasRest.class);
    
    @Autowired
    private RhAreasRepository repoA;
    
    @GetMapping (value = "/listarea")
    @ResponseBody
    public List<RhAreas> dameDirecciones() {
        LOGGER.info("Estro a buscar Direcciones");
        return repoA.dameDirecciones();
    }
    
    //Servicio predeterminado de guardado y Actualizar
    @PostMapping 
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public RhAreas guardaArea(@RequestBody RhAreas area) {
        LOGGER.info("Entró a Guardar");
        return repoA.save(area);
    }
}
