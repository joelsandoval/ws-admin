package com.semarnat.dgira.admin.rest;

import com.semarnat.dgira.admin.model.RhPersonas;
import com.semarnat.dgira.admin.repos.RhPersonasRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @GetMapping (value = "/lista")
    @ResponseBody
    public List<RhPersonas> dameTpersona() {
        LOGGER.info("Estro a buscar Personas");
        return repoP.dameTpersona();
    }

    /*@GetMapping(value = "/cumples/{mes}")
    @ResponseBody
    public List<RhPersonas> dameCumplesMes(@PathVariable("mes") Integer mes) {
        LOGGER.info("Entró a buscar los cumpleañeros");
        return repoP.dameCumpleaniosMes(mes);
    }
    */
}
