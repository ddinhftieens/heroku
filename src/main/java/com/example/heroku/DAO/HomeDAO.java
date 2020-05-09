package com.example.heroku.DAO;

import com.example.heroku.Entity.HomeEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class HomeDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public List<HomeEntity> getHome() {
        String hql = "select i from HomeEntity i";
        Query query = entityManager.createQuery(hql,HomeEntity.class);
        entityManager.close();
        return query.getResultList();
    }
}
