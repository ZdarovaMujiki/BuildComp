package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.personnel.Personnel;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.PersonnelRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("personnel")
public class PersonnelController {
    @Autowired
    PersonnelRepository repository;

    @GetMapping("")
    public List<Personnel> getAll(@RequestParam Optional<Long> sector,
                                  @RequestParam Optional<Long> management) {
        if (sector.isPresent()) {
            return repository.findAllBySector_Id(sector.get());
        }
        if (management.isPresent()) {
            return repository.getPersonnelByManagement(management.get());
        }
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Personnel> getById(@PathVariable String id) {
        return repository.findById(Long.valueOf(id));
    }

    @PostMapping("/new")
    public Personnel create(@RequestBody Personnel personnel) {
        return repository.save(personnel);
    }

    @PutMapping("")
    public Personnel update(@RequestBody Personnel personnel) {
        return repository.save(personnel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(Long.valueOf(id));
    }
}
