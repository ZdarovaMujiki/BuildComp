package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.worker;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Brigadier {
    @Id
    @ManyToOne
    @JoinColumn
    private Worker id;
}
