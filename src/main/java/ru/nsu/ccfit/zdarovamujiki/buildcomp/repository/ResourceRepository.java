package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
