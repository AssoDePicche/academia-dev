import java.util.Set;

public interface CoursesRepository {
  Set<Course> query();

  Set<Course> query(DifficultyLevel difficultyLevel);

  void save(Course course);
}
