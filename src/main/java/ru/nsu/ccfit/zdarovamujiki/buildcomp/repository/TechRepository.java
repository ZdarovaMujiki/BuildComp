package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Tech;

public interface TechRepository extends JpaRepository<Tech, Long> {
}
