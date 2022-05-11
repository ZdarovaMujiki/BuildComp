package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.personnel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class SectorManager implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn
    private Personnel id;
}
