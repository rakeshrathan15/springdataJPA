package com.neoteric.JPASpringBootData.InheritanceinJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaDemo");

    public void saveStock(Stock stock) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(stock);
        em.getTransaction().commit();
        em.close();
    }

    public Stock getStock(Long id) {
        EntityManager em = emf.createEntityManager();
        Stock stock = em.find(Stock.class, id);
        em.close();
        return stock;
    }
}
