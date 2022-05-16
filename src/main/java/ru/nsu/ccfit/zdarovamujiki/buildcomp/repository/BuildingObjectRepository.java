package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.buildingobject.BuildingObject;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.Estimate;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.ObjectWIthSchedule;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.Report;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.Schedule;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface BuildingObjectRepository extends JpaRepository<BuildingObject, Long> {
    @Query(name="getObjectsBySector", nativeQuery = true)
    public List<ObjectWIthSchedule> getObjectsBySector(Long sector);

    @Query(name="getObjectsByManagement", nativeQuery = true)
    public List<ObjectWIthSchedule> getObjectsByManagement(Long management);

    @Query(name="getSchedule", nativeQuery = true)
    List<Schedule> getSchedule(Long id);

    @Query(name="getEstimate", nativeQuery = true)
    List<Estimate> getEstimate(Long id);

    @Query(name="getReport", nativeQuery = true)
    List<Report> getReport(Long id);

    @Query(name="getObjectByWork", nativeQuery = true)
    List<BuildingObject> getObjectByWork(String type, Date start, Date end);
}
