package com.eduardopucinelli.hrworker.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduardopucinelli.hrworker.entities.Worker;
import com.eduardopucinelli.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

	@Value("${test.config}")
	private String testConfig;

	@Autowired
	private Environment env;

	@Autowired
	private WorkerRepository workerRepository;

	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> workers = workerRepository.findAll();
		return ResponseEntity.ok().body(workers);
	}

	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigs() {
		logger.info("Config = " + testConfig);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Worker> findById(@PathVariable Long id) {

		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		logger.info("PORT = " + env.getProperty("local.server.port"));

		Worker worker = workerRepository.findById(id).get();
		return ResponseEntity.ok().body(worker);

	}

}