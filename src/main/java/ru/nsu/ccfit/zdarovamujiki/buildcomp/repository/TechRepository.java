package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Tech;

import java.util.Date;
import java.util.List;

public interface TechRepository extends JpaRepository<Tech, Long> {
    List<Tech> findAllByManagement_Id(Long id);

    @Query(name = "getTechByObject", nativeQuery = true)
    List<Tech> getTechByObject(Long id, Date start, Date end);
}
