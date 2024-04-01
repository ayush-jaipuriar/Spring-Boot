package DAOImpl;

import org.springframework.stereotype.Repository;

import DAO.ActorDAO;
import entity.Actor;
import jakarta.persistence.EntityManager;

@Repository
public class ActorDAOImpl implements ActorDAO{
    private EntityManager entityManager;


    @Override
    public void save(Actor actor) {
        entityManager.persist(actor);
    }

}
