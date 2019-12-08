package com.pushpa.Spring_Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien a = new Alien("Pishpa",1);
    	Alien as =new Alien();
        Configuration con= new 
        		Configuration().configure().addAnnotatedClass(Alien.class);
        StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
        serviceRegistryBuilder.applySettings(con.getProperties());
        ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
        SessionFactory sf = con.buildSessionFactory(serviceRegistry);
        
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.save(a);
        as = (Alien) s.get(Alien.class, 1);
        t.commit();
        System.out.println(as);
    }
}
