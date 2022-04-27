package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.buildingobject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class House {
    @Id
    @ManyToOne
    @JoinColumn
    private BuildingObject objectID;
    @NotNull
    @Min(1)
    private Long floors;
}