package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Sector;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.SectorRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("sector")
public class SectorController {
    @Autowired
    SectorRepository repository;

    @GetMapping("")
    public List<Sector> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Sector> getById(@PathVariable String id) {
        return repository.findById(Long.valueOf(id));
    }

    @PostMapping("/new")
    public Sector create(@RequestBody Sector sector) {
        return repository.save(sector);
    }

    @PutMapping("")
    public Sector update(@RequestBody Sector sector) {
        return repository.save(sector);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(Long.valueOf(id));
    }
}
