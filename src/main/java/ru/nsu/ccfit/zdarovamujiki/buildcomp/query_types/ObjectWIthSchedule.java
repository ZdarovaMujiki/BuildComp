package ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types;

import ru.nsu.ccfit.zdarovamujiki.buildcomp.model.buildingobject.BuildingObject;

import java.util.Date;

public interface ObjectWIthSchedule {
    Long getId();
    String getName();
    Long getWorkId();
    String getWorkName();
    Date getStartDate();
    Date getEndDate();
}
