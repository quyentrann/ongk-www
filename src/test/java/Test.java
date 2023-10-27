import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import vn.edu.iuh.fit.connection.ConnectionDB;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.models.Experience;
import vn.edu.iuh.fit.respository.CandidateRespository;
import vn.edu.iuh.fit.respository.ExperienceRespositori;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        CandidateRespository respository = new CandidateRespository();
        Candidate candidate = new Candidate("1245677", "tran@gmail","Quyen Tran" );
        Candidate candidate1 = new Candidate("643567", "quyentran@gmail","Quyen Tran" );
        Candidate candidate2 = new Candidate("76543245", "tran123@gmail","Quyen Tran" );

        respository.addCandidate(candidate);
        respository.addCandidate(candidate1);
        respository.addCandidate(candidate2);

        ExperienceRespositori experienceRespositori = new ExperienceRespositori();
        Experience experience = new Experience("hggcyukk", LocalDate.of(2023, 10, 24), LocalDate.now(),respository.findOne(1) );
        Experience experience1 = new Experience("treww", LocalDate.of(2002, 1, 31), LocalDate.now(),respository.findOne(2) );
        Experience experience2 = new Experience("njSKWDJ", LocalDate.of(2022, 10, 25), LocalDate.now(),respository.findOne(3) );

        experienceRespositori.addExperience(experience);
        experienceRespositori.addExperience(experience1);
        experienceRespositori.addExperience(experience2);

    }
}
