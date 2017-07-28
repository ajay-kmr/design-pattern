package com.ttn.designpatterns.structural.bridge;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CachePersistenceImplementor implements PersistenceImplementor {

    private static final ConcurrentMap<Integer, Project> PROJECTS = new ConcurrentHashMap<Integer, Project>();
    private static volatile Integer COUNTER = 0;

    public void persist(Project project) {
        project.setProjectId(++COUNTER);
        PROJECTS.put(project.getProjectId(), project);
    }

    public Object find(Integer projectId) {
        return (PROJECTS.get(projectId));
    }
}
