package ru.nsu.ccfit.zdarovamujiki.buildcomp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@IdClass(Key.class)
public class ResourceAtWork {
    @Id
    @NotNull
    @ManyToOne
    @JoinColumn
    private Work work;
    @Id
    @NotNull
    @ManyToOne
    @JoinColumn
    private Resource resource;
    @NotNull
    @Min(0)
    private double plannedAmount;
    @Min(0)
    private double usedAmount;
}

class Key implements Serializable {
    private Work work;
    private Resource resource;
}
