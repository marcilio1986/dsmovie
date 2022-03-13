package com.devesuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;import com.devesuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
