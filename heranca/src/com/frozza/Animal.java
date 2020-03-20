package com.frozza;

// estudos herança

public class Animal {
	
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	// método construtor
	public Animal (String name, int brain, int body, int size, int weight) {
		
	}
	
	public void eat() {
		System.out.println("Animal.eat() foi chamado");
	}
	
	public void move() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBrain() {
		return brain;
	}

	public void setBrain(int brain) {
		this.brain = brain;
	}

	public int getBody() {
		return body;
	}

	public void setBody(int body) {
		this.body = body;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	

}
