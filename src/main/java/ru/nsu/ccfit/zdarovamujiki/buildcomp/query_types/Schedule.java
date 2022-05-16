package ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types;

import java.util.Date;

public interface Schedule {
    Long getId();
    String getName();
    Long getWorkId();
    String getWorkName();
    Date getStartDate();
    Date getEndDate();
}
