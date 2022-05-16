package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.Constants;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Work;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.WorkWithObject;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.WorkRepository;

import java.text.ParseException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("work")
public class WorkController {
    @Autowired
    WorkRepository repository;

    @GetMapping("")
    public List<Work> getAll() {
        return repository.findAll();
    }

    @GetMapping("/overdue")
    public List<Work> getOverdue(@RequestParam Optional<Long> sector,
                                 @RequestParam Optional<Long> management) {
        List <Work> works = repository.getOverdueWork();
        return sector.map(id -> works.stream()
                .filter(work -> Objects.equals(work.getObject().getSector().getId(), id))
                .collect(Collectors.toList()))
                .orElseGet(() -> management.map(id -> works.stream()
                        .filter(work -> Objects.equals(work.getObject().getSector().getManagement().getId(), id))
                        .collect(Collectors.toList())).orElse(works));
    }

    @GetMapping("/by")
    public List<WorkWithObject> getByBrigade(@RequestParam Long brigade,
                                             @RequestParam String start,
                                             @RequestParam String end) throws ParseException {
        return repository.getWorkByBrigade(brigade,
                Constants.dateFormat.parse(start),
                Constants.dateFormat.parse(end));
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
