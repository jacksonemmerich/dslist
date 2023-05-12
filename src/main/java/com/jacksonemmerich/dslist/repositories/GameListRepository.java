package com.jacksonemmerich.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacksonemmerich.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
