package com.ltts.demoSpring.Dao;

import org.springframework.stereotype.Repository;

import com.ltts.demoSpring.model.Player;

@Repository
public class PlayerDao {
	
	
	
	public boolean insertPlayer(Player p) {
		//Hibernate based Code or Spring DataJPA
		//MyCodes are here
		System.out.println("Successfully inserted "+p);
		return false;
	}

}
