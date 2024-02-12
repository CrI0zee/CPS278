package edu.wccnet.cooconnor.cps278_mp2_javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("edu.wccnet.cooconnor.cps278_mp2_javaConfig")
public class javaConfig {
	
	@Bean
	public Battle Hyrule() {
		Battle Hyrule = new Battle(Naruto(),Sasuke());
		Hyrule.setBattleGround(hyrule());
		return Hyrule;
	}
	
	@Bean
	public Battle Ammuud() {
		Battle Ammuud = new Battle(Naruto(),Sasuke());
		Ammuud.setBattleGround(ammuud());
		return Ammuud;
	}
	
	@Bean
	public Ammuud ammuud() {
		return new Ammuud();
	}
	
	@Bean
	public Hyrule hyrule() {
		return new Hyrule();
	}
	
	@Bean
	public Character Naruto() {
		Character Naruto = new Character();
		Naruto.setFightingPower(fireBall());
		Naruto.setName("Naruto");

		return Naruto;
	}
	
	@Bean
	public Character Sasuke() {
		Character Sasuke = new Character();
		Sasuke.setFightingPower(shuriken());
		Sasuke.setName("Sasuke");
		return Sasuke;
	}
	
	@Bean 
	public Fireball fireBall() {
		return new Fireball();
	}
	
	@Bean 
	public Shurikens shuriken() {
		return new Shurikens();
	}
}
