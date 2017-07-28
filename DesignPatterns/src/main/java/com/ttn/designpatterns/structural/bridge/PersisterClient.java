package com.ttn.designpatterns.structural.bridge;

public class PersisterClient {

	public static void main(String[] args) {
		
		System.out.println("\nUsing database....");
		testing(new DatabasePersistenceImplementor());
		
		System.out.println("\nUsing cache....");
		testing(new CachePersistenceImplementor());
	}
	
	private static void testing(PersistenceImplementor implementor) {
		
		Project project1 = createProject("IIP");
		Project project2 = createProject("C-Sigma");
		
		Persistence persistence = new PersistenceImpl(implementor);
		persistence.persistProject(project1);
		persistence.persistProject(project2);
		
		Project project = persistence.findProject(project2.getProjectId());
		System.out.println("Project Id : " + project.getProjectId());
		System.out.println("Project Name : " + project.getProjectName());
	}
	
	private static Project createProject(String projectName) {
		
		Project project = new Project();
		project.setProjectName(projectName);
		
		return project;
	}
}
