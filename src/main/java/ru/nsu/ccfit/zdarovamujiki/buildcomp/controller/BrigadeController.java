package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.Constants;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Brigade;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.buildingobject.BuildingObject;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.BrigadeObject;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.BrigadeTeam;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.BrigadeRepository;

import java.text.ParseException;
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

    @GetMapping("/team")
    public List<BrigadeTeam> getBrigadeTeamByObject(@RequestParam Optional<Long> object) {
        return object.map(repository::getBrigadeTeamByObject).orElse(null);
    }

    @GetMapping("/work")
    public List<BrigadeObject> getBrigadeByWork(@RequestParam String type,
                                                @RequestParam String start,
                                                @RequestParam String end) throws ParseException {
        return repository.getBrigadeByWork(
                type,
                Constants.dateFormat.parse(start),
                Constants.dateFormat.parse(end));
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
