package com.ttn.designpatterns.structural.bridge;

import com.ttn.designpatterns.util.HibernateUtil;
import org.hibernate.Session;

public class DatabasePersistenceImplementor implements PersistenceImplementor {

    public void persist(Project project) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.save(project);
        session.getTransaction().commit();
    }

    public Object find(Integer projectId) {

        Project project = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        project = (Project) session.get(Project.class, projectId);

        return project;
    }
}
