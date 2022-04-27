package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.personnel;

import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Sector;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Personnel {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String duty;
    @NotNull
    @ManyToOne
    @JoinColumn
    private Sector sectorID;
}
