package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Work;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.WorkWithObject;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface WorkRepository extends JpaRepository<Work, Long> {
    @Query(name="getOverdueWork", nativeQuery = true)
    List<Work> getOverdueWork();

    @Query(name="getWorkByBrigade", nativeQuery = true)
    List<WorkWithObject> getWorkByBrigade(Long brigade, Date start, Date end);
}
