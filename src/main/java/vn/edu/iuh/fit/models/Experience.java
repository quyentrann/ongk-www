package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private  long id;
    @Column(name = "work_desc",length = 400)
    private  String workDescription;
    @Column(name = "from_date",columnDefinition = "date")
    private LocalDate fromDate;
    @Column(name = "toDate", columnDefinition = "date")
    private LocalDate toDate;
    @ManyToOne
    private Candidate candidate;

    public Experience() {
    }

    public Experience(String workDescription, LocalDate fromDate, LocalDate toDate, Candidate candidate) {
        this.workDescription = workDescription;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.candidate = candidate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", workDescription='" + workDescription + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", candidate=" + candidate +
                '}';
    }
}
