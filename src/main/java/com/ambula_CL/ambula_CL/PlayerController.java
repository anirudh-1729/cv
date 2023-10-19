package com.ambula_CL.ambula_CL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class PlayerController {
	
	@Autowired
	private Player_service play_service;
	
	@GetMapping("/players")
	public List<Player> GetAllPlayer(){
		
		return play_service.getallplayer();
	}
	
	
	@GetMapping("/players/{id}")
	public Optional<Player> GetById(@PathVariable("id") int id) {
		
		return play_service.getByPlayerId(id);
	}
	
	@PostMapping("/players")
	public Player create_player(@Valid @RequestBody Player player) {
		
		return play_service.addPlayer(player);
		
	}

}
