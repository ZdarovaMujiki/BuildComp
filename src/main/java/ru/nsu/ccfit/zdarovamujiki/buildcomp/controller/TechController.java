package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Tech;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.TechRepository;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("tech")
public class TechController {
    @Autowired
    TechRepository repository;

    @GetMapping("")
    public List<Tech> getAll(@RequestParam Optional<Long> management) {
        return management.map(repository::findAllByManagement_Id)
                .orElse(repository.findAll());
    }

    @GetMapping("/work")
    public List<Tech> getTechByObject(@RequestParam Long object,
                                      @RequestParam Optional<Date> start,
                                      @RequestParam Optional<Date> end) {
        Date startDate = start.orElse(new Date(0));
        Date endDate = end.orElse(new Date(Long.MAX_VALUE / 50));
        return repository.getTechByObject(object, startDate, endDate);
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
