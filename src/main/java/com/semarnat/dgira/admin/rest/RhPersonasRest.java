package com.semarnat.dgira.admin.rest;

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
    
    @GetMapping (value = "/id")
    @ResponseBody
    public List<Integer> damePersona() {
        LOGGER.info("Estro a buscar Personas");
        return repoP.damePersona();
    }
    
}
