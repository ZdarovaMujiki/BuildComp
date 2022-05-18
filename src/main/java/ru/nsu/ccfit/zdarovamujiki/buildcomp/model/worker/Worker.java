package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.worker;

import lombok.Data;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Brigade;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Sector;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    @ManyToOne
    @JoinColumn
    private Sector sector;
    @NotNull
    @ManyToOne
    @JoinColumn
    private Brigade brigade;
}
