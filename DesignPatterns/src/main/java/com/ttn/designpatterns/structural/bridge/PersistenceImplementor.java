package com.ttn.designpatterns.structural.bridge;

public interface PersistenceImplementor {

	public void persist(Project project);
	public Object find(Integer projectId);
}
