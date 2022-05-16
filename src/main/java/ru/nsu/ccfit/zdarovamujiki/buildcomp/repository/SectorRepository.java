package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Sector;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.SectorWithManager;

import java.util.List;

public interface SectorRepository extends JpaRepository<Sector, Long> {
    @Query(name="getSectorsWithManagers", nativeQuery = true)
    public List<SectorWithManager> getSectorsWithManagers();
}
