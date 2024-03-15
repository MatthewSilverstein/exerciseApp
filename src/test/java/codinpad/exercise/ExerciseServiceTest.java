package codinpad.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.time.LocalDate;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ExerciseServiceTest {

    @Mock
    private ExerciseRepository exerciseRepository;

    @InjectMocks
    private ExerciseService exerciseService;

    private Exercise exercise;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        exercise = new Exercise(1L, "Running", 30.0, LocalDate.now());
    }

    @Test
    void createExerciseTest() {
        when(exerciseRepository.save(any(Exercise.class))).thenReturn(exercise);
        Exercise created = exerciseService.createExercise(exercise);
        assertEquals(exercise.getId(), created.getId());
        verify(exerciseRepository).save(any(Exercise.class));
    }

}
