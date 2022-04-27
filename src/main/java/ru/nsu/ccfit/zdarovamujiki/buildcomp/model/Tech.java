package ru.nsu.ccfit.zdarovamujiki.buildcomp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Tech {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    @NotNull
    @ManyToOne
    @JoinColumn
    private Management managementID;
}
