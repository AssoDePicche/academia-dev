import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class InMemoryCoursesRepository implements CoursesRepository {
  private Set<Course> buffer = new HashSet<>();

  @Override
  public Set<Course> query() {
    return buffer;
  }

  @Override
  public Set<Course> query(DifficultyLevel difficultyLevel) {
    return query()
        .stream()
        .filter(course -> course.getDifficultyLevel() == difficultyLevel)
        .collect(Collectors.toSet());
  }

  @Override
  public void save(Course course) {
    buffer.add(course);
  }
}
