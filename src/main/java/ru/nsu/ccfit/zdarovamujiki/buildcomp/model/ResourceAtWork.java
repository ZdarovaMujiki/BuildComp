package ru.nsu.ccfit.zdarovamujiki.buildcomp.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@IdClass(Key.class)
public class ResourceAtWork {
    @Id
    @NotNull
    @ManyToOne
    @JoinColumn
    private Work workID;
    @Id
    @NotNull
    @ManyToOne
    @JoinColumn
    private Resource resourceID;
    @NotNull
    @Min(0)
    private double plannedAmount;
    @Min(0)
    private double usedAmount;
}

class Key implements Serializable {
    private Work workID;
    private Resource resourceID;
}
