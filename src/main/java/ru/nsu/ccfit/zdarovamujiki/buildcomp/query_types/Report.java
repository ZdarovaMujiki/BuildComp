package ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types;

import java.util.Date;

public interface Report {
    Long getWorkId();
    Date getStart();
    Date getEnd();
    Long getResourceId();
    Long getPlanned();
    Long getUsed();
    String getMeasure();
    String getName();
}
