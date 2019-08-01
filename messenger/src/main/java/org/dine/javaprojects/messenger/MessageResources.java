package org.dine.javaprojects.messenger;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.dine.javaprojects.messenger.exceptions.DataNotFoundException;
import org.dine.javaprojects.messenger.likesapi.LikesApi;
import org.dine.javaprojects.messenger.models.ErrorMessage;
import org.dine.javaprojects.messenger.models.Profiles;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Path("messages")
public class MessageResources {

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> message() {
		Message m1=new Message("dine", "muke", "hey how r muke");
		Message m2=new Message("muke", "dine", "hey how r dine");
		List<Message> list=new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{id}")
	public static String main(@PathParam("id") String id) {
		return "posted id = "+id;
	}
	
	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/add/{index}")
	public Message add(List<Message> ml, @PathParam("index") int index) {
//		return ml;
		System.out.println(ml.get(1));
		return ml.get(index);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/erm")
	public ErrorMessage erMsg(Comment comment, @Context UriInfo uriInfo) {
		if(comment.id==0)
			throw new DataNotFoundException("Not found");
		System.out.println("came to /erm");
		URI uri=uriInfo.getAbsolutePathBuilder().path("id").build();
		ErrorMessage erm=new ErrorMessage("Internal server error", 500, "google.com");
		return erm;
//		return Response.created(uri)
//					   .entity(comment)
//					   .build();
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/add/comment")
	public Response addComment(Comment comment, @Context UriInfo uriInfo) {
		if(comment.id==0)
			throw new DataNotFoundException("Not found");
		System.out.println("came to /add/comment");
		URI uri=uriInfo.getAbsolutePathBuilder().path("id").build();
		return Response.created(uri)
					   .entity(comment)
					   .build();
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{do}/profile")
	public Profiles addComment(Profiles p,@PathParam("do") int dothis, @Context UriInfo uriInfo) {
		if(dothis!=0 && dothis!=1)
			throw new DataNotFoundException("Not found");
		System.out.println("came to /{do}/profile");
		SessionFactory sf=  new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		ses.beginTransaction();
		if(dothis==1) {
			ses.save(p);
		}
		ses.getTransaction().commit();
		URI uri=uriInfo.getAbsolutePathBuilder().path("id").build();
		return p;
//		return Response.created(uri)
//					   .entity(p)
//					   .build();
	}
	
	
	@Path("/likes")
	@Produces(MediaType.APPLICATION_JSON)
//	@POST
	public LikesApi likesby(@Context UriInfo info) {
		System.out.println("came to messages/likes");
		LikesApi lap=new LikesApi();
//		lap.setA(1);
//		lap.setB(2);
		return lap;
	}
	
}
