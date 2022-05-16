package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Resource;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.ResourceWithObjectId;

import java.time.format.ResolverStyle;
import java.util.List;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    @Query(name="getOverEstimate", nativeQuery = true)
    List<ResourceWithObjectId> getOverEstimate();

    @Query(name="getOverEstimateBySector", nativeQuery = true)
    List<ResourceWithObjectId> getOverEstimateBySector(Long id);

    @Query(name="getOverEstimateByManagement", nativeQuery = true)
    List<ResourceWithObjectId> getOverEstimateByManagement(Long id);
}
