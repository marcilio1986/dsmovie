package com.devesuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.dsmovie.entities.Score;
import com.devesuperior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
