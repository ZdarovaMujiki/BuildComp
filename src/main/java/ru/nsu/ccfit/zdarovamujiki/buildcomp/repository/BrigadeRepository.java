package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Brigade;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.BrigadeObject;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types.BrigadeTeam;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface BrigadeRepository extends JpaRepository<Brigade, Long> {
    @Query(name = "getBrigadeTeamByObject", nativeQuery = true)
    List<BrigadeTeam> getBrigadeTeamByObject(Long object);

    @Query(name="getBrigadeByWork", nativeQuery = true)
    List<BrigadeObject> getBrigadeByWork(String type, Date start, Date end);
}
