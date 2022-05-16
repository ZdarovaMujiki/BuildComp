package ru.nsu.ccfit.zdarovamujiki.buildcomp.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Management {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
}
