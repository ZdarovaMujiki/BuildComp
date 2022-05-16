package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Resource;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.ResourceWithObjectId;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.ResourceRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("resource")
public class ResourceController {
    @Autowired
    ResourceRepository repository;

    @GetMapping("")
    public List<Resource> getAll() {
        return repository.findAll();
    }

    @GetMapping("/over")
    public List<ResourceWithObjectId> getOver(@RequestParam Optional<Long> sector,
                                              @RequestParam Optional<Long> management) {
        if (sector.isPresent()) {
            return repository.getOverEstimateBySector(sector.get());
        }
        if (management.isPresent()) {
            return repository.getOverEstimateByManagement(management.get());
        }
        return repository.getOverEstimate();
    }

    @GetMapping("/{id}")
    public Optional<Resource> getById(@PathVariable String id) {
        return repository.findById(Long.valueOf(id));
    }

    @PostMapping("/new")
    public Resource create(@RequestBody Resource resource) {
        return repository.save(resource);
    }

    @PutMapping("")
    public Resource update(@RequestBody Resource resource) {
        return repository.save(resource);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(Long.valueOf(id));
    }
}
