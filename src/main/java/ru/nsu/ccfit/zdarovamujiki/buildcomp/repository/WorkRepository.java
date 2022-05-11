package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Work;

public interface WorkRepository extends JpaRepository<Work, Long> {
}
