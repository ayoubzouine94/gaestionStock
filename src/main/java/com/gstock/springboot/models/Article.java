package com.gstock.springboot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="article")
public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idArticle;
	
	private String marqueArticle;
	private String nomArticle;
	private String descArticle ;
	private String prix ;
	
	public Article() {
		super();
		
	}
	
	//Contructor
	public Article( String marqueArticle, String nomArticle, String descArticle, String prix) {
		super();
		
		this.marqueArticle = marqueArticle;
		this.nomArticle = nomArticle;
		this.descArticle = descArticle;
		this.prix = prix;
	}

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getMarqueArticle() {
		return marqueArticle;
	}

	public void setMarqueArticle(String marqueArticle) {
		this.marqueArticle = marqueArticle;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescArticle() {
		return descArticle;
	}

	public void setDescArticle(String descArticle) {
		this.descArticle = descArticle;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	
	
	
	

}
