package codinpad.exercise;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String workoutType;
    private Double duration;
    private LocalDate workoutDate;

    public Exercise() {
    }

    public Exercise(Long id, String workoutType, Double duration, LocalDate workoutDate) {
        this.id = id;
        this.workoutType = workoutType;
        this.duration = duration;
        this.workoutDate = workoutDate;
    }

   public Long getId() {
        return id;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public Double getDuration() {
        return duration;
    }

    public LocalDate getWorkoutDate() {
        return workoutDate;
    }

}
