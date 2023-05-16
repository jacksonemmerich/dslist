package com.jacksonemmerich.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.jacksonemmerich.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	@Modifying

	@Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
	void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
	
	//select para ver a posição se foi alterada
	/*
	 * SELECT tb_belonging .*, tb_game.title from tb_belonging inner join tb_game on
	 * tb_game.id = tb_belonging.game_id WHERE list_id = 2 ORDER BY position
	 */

}
