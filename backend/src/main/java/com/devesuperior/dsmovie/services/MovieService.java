package com.devesuperior.dsmovie.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.devesuperior.dsmovie.dto.MovieDTO;
import com.devesuperior.dsmovie.entities.Movie;
import com.devesuperior.dsmovie.repositories.MovieRepository;


@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true) 
	public Page<MovieDTO> FindAll(Pageable pageble) {
		Page<Movie> result = repository.findAll(pageble);
		Page<MovieDTO> page = result.map(x -> new MovieDTO (x));
		return page;
	}
	 
	@Transactional(readOnly = true) 
	public MovieDTO findById ( Long id) {
		Movie result = repository.findById(id).get();  
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
	
}
