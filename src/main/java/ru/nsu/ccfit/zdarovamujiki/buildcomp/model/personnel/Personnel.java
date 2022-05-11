package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.personnel;

import lombok.Data;
import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.Sector;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Personnel {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String duty;
    @NotNull
    @ManyToOne
    @JoinColumn
    private Sector sectorID;
}
