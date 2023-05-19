package com.semarnat.dgira.admin.rest;

import com.semarnat.dgira.admin.model.RhAreas;
import com.semarnat.dgira.admin.model.RhPersonas;
import com.semarnat.dgira.admin.model.generic.IEmpleados;
import com.semarnat.dgira.admin.model.generic.VwEmpleados;
import com.semarnat.dgira.admin.repos.RhAreasRepository;
import com.semarnat.dgira.admin.repos.RhPersonasRepository;
import com.semarnat.dgira.admin.repos.VwEmpleadosRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 *
 * @author Anallely
 */

@RestController
@RequestMapping(value = "personas")
@CrossOrigin
public class RhPersonasRest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(RhPersonasRest.class);
    
    @Autowired
    private RhPersonasRepository repoP;
    
    @Autowired
    private VwEmpleadosRepository repoE;
    
    
    @GetMapping (value = "/lista")
    @ResponseBody
    public List<IEmpleados> dameTpersona() {
        LOGGER.info("Estro a buscar Personas");
        return repoP.dameTpersona();
    }
    
    @GetMapping (value = "/busqueda/{criterio}")
    @ResponseBody
    public List<RhPersonas> BuscaPersona(@PathVariable ("criterio") String criterio){
        LOGGER.info("Entro a Buscar Personas");
        return repoP.BuscaPersona(criterio);
    }
    //Servicio predeterminado de guardado y Actualizar
    @PostMapping 
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public RhPersonas guardaPersona(@RequestBody RhPersonas persona) {
        LOGGER.info("Entró a Guardar");
        return repoP.save(persona);
    }
    
    @GetMapping (value = "/empleados")
    @ResponseBody
    public List<VwEmpleados> dameEmpleados(){
        LOGGER.info("Entro a Buscar Empleados");
        return repoE.dameEmpleados();
    }
}
