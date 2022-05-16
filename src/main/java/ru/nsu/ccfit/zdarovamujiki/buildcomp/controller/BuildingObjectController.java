package ru.nsu.ccfit.zdarovamujiki.buildcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.Constants;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.buildingobject.BuildingObject;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.Estimate;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.ObjectWIthSchedule;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.Report;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.Schedule;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.repository.BuildingObjectRepository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("buildingObject")
public class BuildingObjectController {
    @Autowired
    BuildingObjectRepository repository;

    @GetMapping("")
    public List<BuildingObject> getAll() {
        return repository.findAll();
    }

    @GetMapping("/schedule")
    public List<ObjectWIthSchedule> getAllWithSchedule(
            @RequestParam Optional<Long> sector,
            @RequestParam Optional<Long> management) {
        if (sector.isPresent()) {
            return repository.getObjectsBySector(sector.get());
        }
        if (management.isPresent()) {
            return repository.getObjectsByManagement(management.get());
        }
        return Collections.emptyList();
    }

    @GetMapping("/{id}")
    public Optional<BuildingObject> getById(@PathVariable String id) {
        return repository.findById(Long.valueOf(id));
    }

    @GetMapping("/{id}/schedule")
    public List<Schedule> getSchedule(@PathVariable Long id) {
        return repository.getSchedule(id);
    }

    @GetMapping("/{id}/estimate")
    public List<Estimate> getEstimate(@PathVariable Long id) {
        return repository.getEstimate(id);
    }

    @GetMapping("/{id}/report")
    public List<Report> getReport(@PathVariable Long id) {
        return repository.getReport(id);
    }

    @GetMapping("/work")
    public List<BuildingObject> getObjectByWork(@RequestParam Optional<Long> management,
                                                @RequestParam String type,
                                                @RequestParam String start,
                                                @RequestParam String end) throws ParseException {
        List<BuildingObject> objects = repository.getObjectByWork(
                type,
                Constants.dateFormat.parse(start),
                Constants.dateFormat.parse(end));

        return management.map(id ->
                objects.stream()
                .filter(object -> Objects.equals(object.getSector().getManagement().getId(), id))
                .collect(Collectors.toList()))
                .orElse(objects);
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
