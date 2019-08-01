package org.dine.javaprojects.messenger.profiles;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dine.javaprojects.messenger.models.Profiles;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;

@Path("profiles")
public class ProfileResources {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/add")
	public Profiles addProfile(Profiles p) {
//		System.out.println();
//		SessionFactory sf=new Configuration().configure().buildSessionFactory();
//		Session ss=sf.openSession();
//		ss.beginTransaction();
//		ss.save(p);
//		ss.getTransaction().commit();
		return p;
	}
}
