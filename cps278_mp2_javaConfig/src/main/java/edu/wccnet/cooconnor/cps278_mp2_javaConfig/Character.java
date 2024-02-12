package edu.wccnet.cooconnor.cps278_mp2_javaConfig;

public class Character {

	private String name; 
	private double health;
	private double strength;
	private FightingPower fightingPower;
	
	public Character() {
		
	}
	
	public Character(String name, double health, double strength, FightingPower fightingPower) {
		super();
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.fightingPower = fightingPower;
	}
	
	
	
	public String useFightingPower() {
		return name + fightingPower.getFightingPowerDesc(); 
	}

	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public FightingPower getFightingPower() {
		return fightingPower;
	}

	public void setFightingPower(FightingPower fightingPower) {
		this.fightingPower = fightingPower;
	}

	
}
