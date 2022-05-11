package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Brigade;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.BrigadeRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("brigade")
public class BrigadeController {
    @Autowired
    BrigadeRepository repository;

    @GetMapping("")
    public List<Brigade> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Brigade> getById(@PathVariable String id) {
        return repository.findById(Long.valueOf(id));
    }

    @PostMapping("/new")
    public Brigade create(@RequestBody Brigade brigade) {
        return repository.save(brigade);
    }

    @PutMapping("")
    public Brigade update(@RequestBody Brigade brigade) {
        return repository.save(brigade);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(Long.valueOf(id));
    }
}
