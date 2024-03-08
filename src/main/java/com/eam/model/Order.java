package com.eam.model;

import jakarta.persistence.*;

@Table(name = "ORDERS")
@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "meal")
	private String meal;

	@Column(name = "drink")
	private String drink;

	@Column(name = "sweet")
	private String sweet;

	@Column(name = "dessert")
	private String dessert;

	@Column(name = "fruit")
	private String fruit;

	public Order(Long id, String meal, String drink, String sweet, String dessert, String fruit) {
		super();
		this.id = id;
		this.meal = meal;
		this.drink = drink;
		this.sweet = sweet;
		this.dessert = dessert;
		this.fruit = fruit;
	}
	
	public Order() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getSweet() {
		return sweet;
	}

	public void setSweet(String sweet) {
		this.sweet = sweet;
	}

	public String getDessert() {
		return dessert;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	

}
