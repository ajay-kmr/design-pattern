package com.ttn.designpatterns.structural.bridge;

public class PersistenceImpl implements Persistence {
	
	private PersistenceImplementor implementor;
	
	public PersistenceImpl(PersistenceImplementor implementor) {
		this.implementor = implementor;
	}

	@Override
	public void persistProject(Project project) {
		implementor.persist(project);
	}

	@Override
	public Project findProject(Integer projectId) {
		return (Project) (implementor.find(projectId));
	}

}
