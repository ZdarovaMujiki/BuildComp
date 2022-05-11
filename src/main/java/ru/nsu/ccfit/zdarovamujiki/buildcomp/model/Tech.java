package ru.nsu.ccfit.zdarovamujiki.buildcomp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
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
