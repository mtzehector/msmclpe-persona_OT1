/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.personaback.endpoint;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import mx.gob.imss.dpes.common.endpoint.BaseGUIEndPoint;
import mx.gob.imss.dpes.common.exception.BusinessException;
import mx.gob.imss.dpes.common.model.Message;
import mx.gob.imss.dpes.personaback.entity.McltPersona;
import mx.gob.imss.dpes.personaback.service.ObtenerPersonaPersistenceService;


/**
 *
 * @author antonio
 */
@ApplicationScoped
@Path("/persona")
public class PersonaEndPoint extends BaseGUIEndPoint<McltPersona, McltPersona, McltPersona>{
    @Inject
    private ObtenerPersonaPersistenceService service;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
  @Override
    public Response create(McltPersona persona) throws BusinessException {
     
        Message<McltPersona> execute =
           service.execute( new Message<>(persona) );        
        return toResponse(execute);
    }    
}
