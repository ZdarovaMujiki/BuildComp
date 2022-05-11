package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Management;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.ManagementRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("management")
public class ManagementController {
    @Autowired
    ManagementRepository repository;

    @GetMapping("")
    public List<Management> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Management> getById(@PathVariable String id) {
        return repository.findById(Long.valueOf(id));
    }

    @PostMapping("/new")
    public Management create(@RequestBody Management management) {
        return repository.save(management);
    }

    @PutMapping("")
    public Management update(@RequestBody Management management) {
        return repository.save(management);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(Long.valueOf(id));
    }
}
