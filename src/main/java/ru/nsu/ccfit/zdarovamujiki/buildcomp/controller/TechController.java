package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Tech;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.TechRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("tech")
public class TechController {
    @Autowired
    TechRepository repository;

    @GetMapping("")
    public List<Tech> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tech> getById(@PathVariable String id) {
        return repository.findById(Long.valueOf(id));
    }

    @PostMapping("/new")
    public Tech create(@RequestBody Tech tech) {
        return repository.save(tech);
    }

    @PutMapping("")
    public Tech update(@RequestBody Tech tech) {
        return repository.save(tech);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(Long.valueOf(id));
    }
}
