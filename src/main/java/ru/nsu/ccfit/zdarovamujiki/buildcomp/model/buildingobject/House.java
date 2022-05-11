package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.buildingobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
public class House implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn
    private BuildingObject objectID;
    @NotNull
    @Min(1)
    private Long floors;
}
