package com.eduardopucinelli.hrworker.resources;

import com.eduardopucinelli.hrworker.entities.Worker;
import com.eduardopucinelli.hrworker.repositories.WorkerRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository workerRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Worker>> findAll() {
         List<Worker> workers = workerRepository.findAll();
         return ResponseEntity.ok().body(workers);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker worker = workerRepository.findById(id).get();
        return ResponseEntity.ok().body(worker);
        

    }
}