package vn.edu.iuh.fit.respository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.edu.iuh.fit.connection.ConnectionDB;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.models.Experience;

public class ExperienceRespositori {
    private EntityManager manager;

    public ExperienceRespositori() {
        manager = ConnectionDB.getConnectionDB().getManagerFactory().createEntityManager();
    }

    public boolean addExperience(Experience experience){
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        try {
            manager.persist(experience);
            transaction.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }
    public Experience findOne(long id){
        return  manager.find(Experience.class, id);
    }
}
