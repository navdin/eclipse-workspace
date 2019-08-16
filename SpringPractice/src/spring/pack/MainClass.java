package spring.pack;



import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	
	public static void main(String[] args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//		Triangle t=(Triangle) context.getBean("triangle");
//		t.tp();
		
//		Profile p=new Profile();
//		p.setSimNumber(9866);
//		p.setName("sur");
//
//		ArrayList<Object> arl=new ArrayList<Object>();
//		arl.add(new Triangle() {int s=10;});
//		arl.add(new Profile(9866, new Date(), "sur" ) );
//		
//		System.out.println(new Date());
//		System.out.println(arl);
		Triangle t=new Triangle();
		t.setS(6);
		t.tang=30;
		Profile p1=new Profile(9866, new Date(), "sure");
		
		Profile p2=new Profile(9714, new Date(), "dine");
		t.getLp().add(p1);
		t.getLp().add(p2);
//		Configuration configuration = new Configuration();
//	    configuration.configure();
//	    System.out.println("came here 1");
//	    ServiceRegistry serviceRegistry =new StandardServiceRegistryBuilder().applySettings(
//	            configuration.getProperties()).build();
//	    System.out.println("came here 2");
//
//		//SessionFactory sf;//=  new Configuration().configure().buildSessionFactory(null);
//		SessionFactory sf = configuration.buildSessionFactory(serviceRegistry);
		Sweets s=new Sweets(1, "gulab", 70, 50, 3);
		Stock st= new Stock(10, "less");
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		ses.beginTransaction();
//		Triangle tg=ses.get(Triangle.class, );

		ses.save(s);
		ses.save(st);
		ses.getTransaction().commit();
//		ArrayList<Profile> arl=(ArrayList<Profile>)tg.getLp();
//		System.out.println(().get(0).simNumber);

	}
}
