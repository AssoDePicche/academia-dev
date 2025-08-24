import java.util.Optional;
import java.util.Set;

public interface CoursesRepository {
  Set<Course> query();

  Set<Course> query(DifficultyLevel difficultyLevel);

  Set<Course> query(Instructor instructor);

  Optional<Course> query(String title);

  void save(Course course);
}
