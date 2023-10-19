package com.ambula_CL.ambula_CL;

import java.util.List;
import java.util.Optional;

public interface PlayerServiceInt {
	
	/*Add player*/
	Player addPlayer(Player player);
		
	/*Delete Player*/
	void deleteByPlayerId(int id);
	
	/*Get player detail by id*/
	Optional<Player> getByPlayerId(int id);
	
	/*Get all player*/
	List<Player> getallplayer();

}
