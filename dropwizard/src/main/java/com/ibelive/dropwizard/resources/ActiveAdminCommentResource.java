/**
 * 
 */
package com.ibelive.dropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.skife.jdbi.v2.DBI;

import com.ibelive.dropwizard.dao.ActiveAdminCommentDao;
import com.ibelive.dropwizard.representation.ActiveAdminComment;

/**
 * @author JK035766
 *
 */
@Path("/activeAdminComment")
@Produces(MediaType.APPLICATION_JSON)
public class ActiveAdminCommentResource {
	private ActiveAdminCommentDao activeAdminCommentDao =  null;
	
	public ActiveAdminCommentResource(DBI jdbi) {
		activeAdminCommentDao = jdbi.onDemand(ActiveAdminCommentDao.class);
    }
	@GET
	@Path("/{id}")
	public Response getActiveAdminComment(@PathParam("id") int id) {
		ActiveAdminComment activeAdminComment =  activeAdminCommentDao.getActiveAdminCommentById(id);
		return Response.ok(activeAdminComment).build();
	}
}
