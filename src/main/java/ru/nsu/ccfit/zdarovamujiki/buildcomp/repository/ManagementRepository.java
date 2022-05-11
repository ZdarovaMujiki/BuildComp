package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Management;

public interface ManagementRepository extends JpaRepository<Management, Long> {
}
