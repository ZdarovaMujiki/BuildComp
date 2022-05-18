package ru.nsu.ccfit.zdarovamujiki.buildcomp.model;

import lombok.Data;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.buildingobject.BuildingObject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    @ManyToOne
    @JoinColumn
    private BuildingObject object;
    @NotNull
    @ManyToOne
    @JoinColumn
    private Brigade brigade;
    @NotNull
    private Date plannedStart;
    @NotNull
    private Date plannedFinish;

    private Date realStart;
    private Date realFinish;
    //date valid check!!!
}
