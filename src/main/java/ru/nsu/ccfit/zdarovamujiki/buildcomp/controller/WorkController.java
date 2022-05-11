package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Work;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.WorkRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("work")
public class WorkController {
    @Autowired
    WorkRepository repository;

    @GetMapping("")
    public List<Work> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Work> getById(@PathVariable String id) {
        return repository.findById(Long.valueOf(id));
    }

    @PostMapping("/new")
    public Work create(@RequestBody Work work) {
        return repository.save(work);
    }

    @PutMapping("")
    public Work update(@RequestBody Work work) {
        return repository.save(work);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(Long.valueOf(id));
    }
}
