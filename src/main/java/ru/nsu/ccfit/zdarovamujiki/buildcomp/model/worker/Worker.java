package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.worker;

import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Brigade;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Sector;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Worker {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    @NotNull
    @ManyToOne
    @JoinColumn
    private Sector sectorID;
    @NotNull
    @ManyToOne
    @JoinColumn
    private Brigade brigadeID;
}
