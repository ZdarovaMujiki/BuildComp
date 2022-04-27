package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.buildingobject;

import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Sector;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class BuildingObject {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String client;
    @NotNull
    @ManyToOne
    @JoinColumn
    private Sector sectorID;
}
