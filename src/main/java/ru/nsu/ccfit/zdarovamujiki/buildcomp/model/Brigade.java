package ru.nsu.ccfit.zdarovamujiki.buildcomp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Brigade {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
}
