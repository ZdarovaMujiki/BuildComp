package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.buildingobject;

import lombok.Data;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Sector;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class BuildingObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String client;
    @NotNull
    @ManyToOne
    @JoinColumn
    private Sector sector;
}
