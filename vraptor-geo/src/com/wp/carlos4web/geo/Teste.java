package com.wp.carlos4web.geo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wp.carlos4web.geo.beans.Propriedade;


public class Teste {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager em = factory.createEntityManager();
		
		
	//	GeometryUtils geo = new GeometryUtils();
	//	Geometry ponto = geo.from(26.9944, 56.444).to(Point.class);
		
		em.getTransaction().begin();
		
		Propriedade p = new Propriedade();
		p.setNome("Apenas um teste");
	//	p.setLocalizacao((Point) ponto);
		
		em.persist(p);
		
		em.getTransaction().commit();
	}
}
