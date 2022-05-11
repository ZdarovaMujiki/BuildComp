package ru.nsu.ccfit.zdarovamujiki.buildcomp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@IdClass(TechAtWork.Key.class)
public class TechAtWork {
    @Id
    @NotNull
    @ManyToOne
    @JoinColumn
    private Work workID;
    @Id
    @NotNull
    @ManyToOne
    @JoinColumn
    private Tech techID;

    static class Key implements Serializable {
        private Work workID;
        private Tech techID;
    }
}
