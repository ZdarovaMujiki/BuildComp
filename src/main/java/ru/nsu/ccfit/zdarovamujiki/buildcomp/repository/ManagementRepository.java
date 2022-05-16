package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Management;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.ManagementWithManager;

import java.util.List;

public interface ManagementRepository extends JpaRepository<Management, Long> {
    @Query(name="getManagementsWithManagers", nativeQuery = true)
    List<ManagementWithManager> getManagementsWithManagers();
}
