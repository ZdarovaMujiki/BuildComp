package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.buildingobject.BuildingObject;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.BuildingObjectRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("buildingObject")
public class BuildingObjectController {
    @Autowired
    BuildingObjectRepository repository;

    @GetMapping("")
    public List<BuildingObject> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<BuildingObject> getById(@PathVariable String id) {
        return repository.findById(Long.valueOf(id));
    }

    @PostMapping("/new")
    public BuildingObject create(@RequestBody BuildingObject buildingObject) {
        return repository.save(buildingObject);
    }

    @PutMapping("")
    public BuildingObject update(@RequestBody BuildingObject buildingObject) {
        return repository.save(buildingObject);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(Long.valueOf(id));
    }
}
