package org.dine.javaprojects.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/newresource")
public class NewResource {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String message() {
		return "new resource hey";
	}
}
