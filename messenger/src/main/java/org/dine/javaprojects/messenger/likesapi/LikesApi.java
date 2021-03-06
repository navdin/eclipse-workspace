package org.dine.javaprojects.messenger.likesapi;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.dine.javaprojects.messenger.Comment;
import org.dine.javaprojects.messenger.Message;

public class LikesApi {
	
	
	
//	public LikesApi(){
//		
//	}
//	   int a=1;
//	   int b=2;
//	   
//	public int getA() {
//		return a;
//	}
//
//	public void setA(int a) {
//		this.a = a;
//	}
//
//	public int getB() {
//		return b;
//	}
//
//	public void setB(int b) {
//		this.b = b;
//	}

	public static class Robj{
//		Robj(){
//			
//		}
		 String path;
		 String commen;
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getCommen() {
			return commen;
		}
		public void setCommen(String commen) {
			this.commen = commen;
		}
		 
	 }
	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Robj likes(@Context UriInfo info, Comment comment){
//		List<String> lp=new ArrayList<String>();
//		System.out.println("came to /likes");
//		lp.add("person1");
//		lp.add("person2");
//		Robj robj=new Robj();
//		robj.path=info.getPath();
//		robj.commen=comment.getComment();
//		System.out.println("came to /likes end");
//		 
//		 		 
//		return robj;
//	}
	
	
	
//	@POST
////	@GET
//	@Path("/lp")
////	@Consumes(MediaType.APPLICATION_JSON)
////	@Produces(MediaType.TEXT_PLAIN)
//	public Robj likesby(@Context UriInfo info, Comment comment){
//		List<String> lp=new ArrayList<String>();
//		System.out.println("came to /likes");
//		lp.add("person1");
//		lp.add("person2");
//		lp.add(info.getPath());
//		lp.add(comment.getComment());
//		System.out.println("came to /likes end"); 
//		Robj ro=new Robj();
//		ro.commen="robj com";
//		ro.path="/lp";
//		 
//		String r=info.getAbsolutePath()+comment.getComment();
//		 
//		return ro;
//	}
	

	@POST
//	@GET
	@Path("/lp")
//	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message likesby(@Context UriInfo info, List<Message> ml){
		List<String> lp=new ArrayList<String>();
		System.out.println("came to /likes");
		lp.add("person1");
		lp.add("person2");
		lp.add(info.getPath());
		System.out.println("came to /likes end"); 
		Robj ro=new Robj();
		ro.commen="robj com";
		ro.path="/lp";
		 
//		String r=info.getAbsolutePath()+comment.getComment();
		 
		return ml.get(1);
	}
	
	
	
//	@POST
	@GET
	@Path("/l")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String likesb(@Context UriInfo info){
		List<String> lp=new ArrayList<String>();
		System.out.println("came to /likes");
		lp.add("person1");
		lp.add("person2");
		lp.add(info.getPath());
		//lp.add(comment.getComment());
		System.out.println("came to /l end"); 
		 
		String r=info.getAbsolutePath().toString();//+comment.getComment();
		 
		return r;
	}
}
