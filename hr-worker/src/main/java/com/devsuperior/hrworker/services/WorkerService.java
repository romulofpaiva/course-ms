package com.devsuperior.hrworker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository repository;
	
	public List<Worker> findAll() {
		return repository.findAll();
 	}
	
	public Worker findById(@PathVariable Long id) {
		return repository.findById( id ).get();
 	}
}
