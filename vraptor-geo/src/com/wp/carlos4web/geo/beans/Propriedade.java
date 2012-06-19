package com.wp.carlos4web.geo.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

import com.vividsolutions.jts.geom.Point;

@Entity(name="propriedade")
public class Propriedade implements Serializable {
	
	private static final long serialVersionUID = 5207875086769851831L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	

	@Column(nullable=false)
	@Type(type="org.hibernatespatial.GeometryUserType")
	private Point localizacao;
	
	@Transient
	private Double x, y;
	
	public Propriedade() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Point getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Point localizacao) {
		this.localizacao = localizacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
}
