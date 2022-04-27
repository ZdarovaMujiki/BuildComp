package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.personnel;

import javax.persistence.*;

@Entity
public class SectorManager {
    @Id
    @ManyToOne
    @JoinColumn
    private Personnel id;
}
