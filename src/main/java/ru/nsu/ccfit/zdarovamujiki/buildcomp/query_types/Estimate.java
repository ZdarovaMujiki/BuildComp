package ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types;

public interface Estimate {
    Long getId();
    String getName();
    String getMeasure();
    Long getPlanned();
    Long getUsed();
}
