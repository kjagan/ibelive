package com.ibelive.dropwizard.resources;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import org.skife.jdbi.v2.DBI;

import com.ibelive.dropwizard.dao.UserDetailsDao;
import com.ibelive.dropwizard.representation.UserDetails;

/**
 * @author JK035766
 *
 */
@Path("/userDetails")
@Produces(MediaType.APPLICATION_JSON)
public class UserDetailsResource {
	
	private UserDetailsDao userDetailsDao =  null;
	
	public UserDetailsResource(DBI jdbi) {
		userDetailsDao = jdbi.onDemand(UserDetailsDao.class);
    }
	@GET
	@Path("/{id}")
	public Response getContact(@PathParam("id") int id) {
		UserDetails userDetails =  userDetailsDao.getContactById(id);
		return Response.ok(userDetails).build();
	}
	
	@POST
	public Response createUser(UserDetails userDetails) throws URISyntaxException{
		int userId  =  userDetailsDao.createUser(userDetails.getName(), userDetails.getHeight(), userDetails.getWeight());
		return Response.created(new URI(String.valueOf(userId))).build();
	}
	
}
