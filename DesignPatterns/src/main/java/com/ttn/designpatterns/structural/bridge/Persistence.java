package com.ttn.designpatterns.structural.bridge;

public interface Persistence {
	
	public void persistProject(Project project);
	public Project findProject(Integer projectId);
}
