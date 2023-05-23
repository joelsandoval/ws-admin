                                                            package com.semarnat.dgira.admin.rest;

import com.semarnat.dgira.admin.model.MdEstructura;
import com.semarnat.dgira.admin.model.MdLink;
import com.semarnat.dgira.admin.model.vistas.VwMdCambios;
import com.semarnat.dgira.admin.model.vistas.VwMdEstructuraLayer;
import com.semarnat.dgira.admin.model.vistas.VwMdLinks;
import com.semarnat.dgira.admin.repos.MdEstructuraLayerValoresRepository;
import com.semarnat.dgira.admin.repos.MdFechasProcesosRepository;
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
import com.semarnat.dgira.admin.repos.MdIncisosRepository;
import com.semarnat.dgira.admin.repos.MdLinksRepository;

/**
 *
 * @author eduardo.trujillo
 */
@RestController
@RequestMapping(value = "mdestructura")
@CrossOrigin
class MdEstructuraREST {

    private static final Logger LOGGER = LoggerFactory.getLogger(MdEstructuraREST.class);

    @Autowired
    private MdIncisosRepository secc;

    @Autowired
    private MdEstructuraLayerValoresRepository estval;
    
      @Autowired
    private MdFechasProcesosRepository fecproc;
      
       @Autowired
    private MdLinksRepository Urls;

    @GetMapping(value = "todasec")
    @ResponseBody
    public List<MdEstructura> dameInciso() {
        LOGGER.info("Da secciones");
        return secc.dameInciso();

    }

    @GetMapping(value = "estrucvalores/{capa},{padre}")
    @ResponseBody
    public List<VwMdEstructuraLayer> dameEstVal(@PathVariable("capa") Integer capa, @PathVariable("padre") Integer padre) {
        LOGGER.info("Da Estructura y sus valores de un tema");
        return estval.dameEstVal(capa, padre);

    }
    
@GetMapping(value = "fechasprocesos/{capa}")
    @ResponseBody
    public List<VwMdCambios> dameFecProc(@PathVariable("capa") Integer capa) {
        LOGGER.info("Presenta Fechas y procesos");
        return fecproc.dameFecProc(capa);

    }
   
  @GetMapping(value = "links/{capa}")
    @ResponseBody
    public List<VwMdLinks> dameLink(@PathVariable("capa") Integer capa) {
        LOGGER.info("Presenta Ligas de temas");
        return Urls.dameLink(capa);

    }  
    
}
