package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.worker.Worker;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.WorkerRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("worker")
public class WorkerController {
    @Autowired
    WorkerRepository repository;

    @GetMapping("")
    public List<Worker> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Worker> getById(@PathVariable String id) {
        return repository.findById(Long.valueOf(id));
    }

    @PostMapping("/new")
    public Worker create(@RequestBody Worker worker) {
        return repository.save(worker);
    }

    @PutMapping("")
    public Worker update(@RequestBody Worker worker) {
        return repository.save(worker);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(Long.valueOf(id));
    }
}
