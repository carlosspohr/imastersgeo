package com.wp.carlos4web.geo.controllers;

import java.util.Collection;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.vividsolutions.jts.geom.Point;
import com.wp.carlos4web.geo.beans.Propriedade;
import com.wp.carlos4web.geo.parser.GeometryUtils;


@Resource
public class PropriedadeController {

	private final Result result;
	
	private final EntityManager manager;
	
	public PropriedadeController(Result result, EntityManager manager) {
		super();
		this.result = result;
		this.manager = manager;
	}

	@Get("/propriedades/listar/")
	public void listaPropriedades(){
		String query = "SELECT p FROM propriedade p ORDER BY p.nome";
		
		Collection<Propriedade> propriedades = manager.createQuery(query, Propriedade.class).getResultList();
		result.include("propriedades", propriedades);
	}
	
	@Get("/propriedades/cadastrar/")
	public void formulario(){
		
	}
	
	@Post("/propriedades/salvar/")
	public void salvar(Propriedade propriedade){
		
		if(propriedade == null){
			throw new IllegalArgumentException("Nenhuma propriedade informada");
		}
		Point localizacao = new GeometryUtils().from(propriedade.getX(), propriedade.getY()).convertTo(Point.class);
		propriedade.setLocalizacao(localizacao);
		
		manager.persist(propriedade);
		
		result.redirectTo(this.getClass()).listaPropriedades();
	}
}
