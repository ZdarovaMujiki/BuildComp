package ru.nsu.ccfit.zdarovamujiki.buildcomp.query_types;

public interface ResourceWithObjectId {
    Long getId();
    String getName();
    String getMeasure();
    Long getObjectId();
}
