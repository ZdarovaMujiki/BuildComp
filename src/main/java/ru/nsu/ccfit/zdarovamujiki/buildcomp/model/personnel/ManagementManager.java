package ru.nsu.ccfit.zdarovamujiki.buildcomp.model.personnel;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class ManagementManager implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn
    private Personnel id;
}
