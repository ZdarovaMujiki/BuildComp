package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.worker;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Brigadier implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn
    private Worker id;
}
