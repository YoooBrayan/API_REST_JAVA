/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apirest.controller;

import com.mycompany.apirest.model.ResponseGeneric;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author braya
 */
@Path("generic")
@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.apirest.controller.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getJson")
    public String getJson() {
        //TODO return proper representation object
        return "HOLA MUNDO";
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    @Path("/getObjectJson")
    public ResponseGeneric getObjectJson(ResponseGeneric req) {
        //TODO return proper representation object
        ResponseGeneric response = new ResponseGeneric();
        response.message = "ÓK";
        response.rta = true;
        response.value = 1;
        return req;
    }
    

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
