package com.mehdi.gathergrid.repository;

import com.mehdi.gathergrid.domain.models.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CategoryRepository {

    private final EntityManagerFactory entityManagerFactory;

    public CategoryRepository() {
        entityManagerFactory= Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    public void save(Category category){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(category);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
