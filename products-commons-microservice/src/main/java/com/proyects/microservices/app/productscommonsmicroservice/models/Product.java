package com.proyects.microservices.app.productscommonsmicroservice.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Table(name = "products")
public class Product implements Serializable {

	private static final long serialVersionUID = -8165569117907559095L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long Id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "nationality")
	private String nationality;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
