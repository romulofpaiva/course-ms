package com.devsuperior.hrworker.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrworker.dtos.WorkerDTO;
import com.devsuperior.hrworker.services.WorkerService;

@RestController
@RequestMapping(value="/workers")
public class WorkerResources {
	
	private static Logger logger = LoggerFactory.getLogger( WorkerResources.class );
	
	@Autowired
	private Environment env;

	@Autowired
	private WorkerService service;
	
	@GetMapping
	public ResponseEntity<List<WorkerDTO>> findAll() {
		return ResponseEntity.ok( 
			service.findAll()
				.stream()
				.map( i -> i.asDTO() )
				.collect( Collectors.toList() ) );
 	}
	
	@GetMapping("/{id}")
	public ResponseEntity<WorkerDTO> findById(@PathVariable Long id) {
		
		logger.info("port = " + env.getProperty("local.server.port"));
		
		return ResponseEntity.ok( service.findById( id ).asDTO() );
 	}
}
