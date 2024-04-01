package DAOImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DAO.ActorDAO;
import entity.Actor;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class ActorDAOImpl implements ActorDAO{
    private EntityManager entityManager;

    @Autowired
    public ActorDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public void save(Actor actor) {
        entityManager.persist(actor);
    }

}
