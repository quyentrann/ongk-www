package vn.edu.iuh.fit.respository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.edu.iuh.fit.connection.ConnectionDB;
import vn.edu.iuh.fit.models.Candidate;

import java.util.List;

public class CandidateRespository {
    private EntityManager manager;

    public CandidateRespository() {
        manager = ConnectionDB.getConnectionDB().getManagerFactory().createEntityManager();
    }

    public boolean addCandidate(Candidate candidate){
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        try {
            manager.persist(candidate);
            transaction.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }
    public List<Candidate> getAll(){
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        try {
            List<Candidate> candidates= manager.createQuery("select cd from Candidate cd", Candidate.class).getResultList();
            transaction.commit();
            return candidates;
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }return null;
    }
    public Candidate findOne(long id){
        return  manager.find(Candidate.class, id);
    }
}
