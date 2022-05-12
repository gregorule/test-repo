package com.qa.main.test;

public class Lizards {
	
	private String food;
	private String sunbathe;
	private int tankTemp;
	
	public String screech() {
		return "hiss";
	}
	
	public String shed() {
		return "shedding skin";
	}

	public Lizards(String food, String sunbathe, int tankTemp) {
		super();
		this.food = food;
		this.sunbathe = sunbathe;
		this.tankTemp = tankTemp;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getSunbathe() {
		return sunbathe;
	}

	public void setSunbathe(String sunbathe) {
		this.sunbathe = sunbathe;
	}

	public int getTankTemp() {
		return tankTemp;
	}

	public void setTankTemp(int tankTemp) {
		this.tankTemp = tankTemp;
	}
	
	

}
