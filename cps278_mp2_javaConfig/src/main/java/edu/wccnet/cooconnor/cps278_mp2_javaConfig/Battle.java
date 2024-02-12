package edu.wccnet.cooconnor.cps278_mp2_javaConfig;

public class Battle {
	
	private Character c1;
	private Character c2;
	private BattleGround battleGround; 
	
	
	
	public Battle(Character c1, Character c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		
	}
	
	public void Fight() 
	{
		
		System.out.println(battleGround.getBattleGroundDesc() + c1.getName() + " and " + c2.getName() + " are fighting. " + c1.useFightingPower() + c2.useFightingPower());
	}

	public Character getC1() {
		return c1;
	}

	public void setC1(Character c1) {
		this.c1 = c1;
	}

	public Character getC2() {
		return c2;
	}

	public void setC2(Character c2) {
		this.c2 = c2;
	}

	public BattleGround getBattleGround() {
		return battleGround;
	}

	public void setBattleGround(BattleGround battleGround) {
		this.battleGround = battleGround;
	}
	
	
}
