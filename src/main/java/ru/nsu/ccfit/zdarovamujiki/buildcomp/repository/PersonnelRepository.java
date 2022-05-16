package ru.nsu.ccfit.zdarovamujiki.buildcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.personnel.Personnel;

import java.util.List;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
    List<Personnel> findAllBySector_Id(Long id);

    @Query(name="getPersonnelByManagement", nativeQuery = true)
    List<Personnel> getPersonnelByManagement(Long id);
}
