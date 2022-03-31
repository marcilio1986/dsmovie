package com.devesuperior.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devesuperior.dsmovie.dto.MovieDTO;
import com.devesuperior.dsmovie.dto.ScoreDto;
import com.devesuperior.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value ="/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service ;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDto dto) {
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
		
	}
	
}
