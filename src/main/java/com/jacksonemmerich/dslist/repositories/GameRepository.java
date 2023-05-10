package com.jacksonemmerich.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacksonemmerich.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
