//package org.dine.javaprojects.messenger.exceptions;
//
//import javax.ws.rs.core.Response;
//import javax.ws.rs.core.Response.Status;
//import javax.ws.rs.ext.ExceptionMapper;
//import javax.ws.rs.ext.Provider;
//
//import org.dine.javaprojects.messenger.models.ErrorMessage;
//
//@Provider
//public class GenericExceptionMapper implements ExceptionMapper<Throwable>{
//
//	@Override
//	public Response toResponse(Throwable exception) {
//		// TODO Auto-generated method stub
//		ErrorMessage erm=new ErrorMessage("Internal server error", 500, "google.com");
//		System.out.println("generic ex reached");
//		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(erm).build();
//	}
//
//	
//}
