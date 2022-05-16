package ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types;

import java.util.Date;

public interface WorkWithObject {
    Long getObjectId();
    String getObjectName();
    Long getId();
    String getName();
    String getBrigadeId();
    Date getPlannedStart();
    Date getPlannedFinish();
    Date getRealStart();
    Date getRealFinish();
}
