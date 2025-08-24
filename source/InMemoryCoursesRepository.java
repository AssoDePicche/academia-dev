import java.util.HashSet;
import java.util.Optional;
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
  public Set<Course> query(Instructor instructor) {
    return query()
        .stream()
        .filter(course -> course.getInstructor().getName().equals(instructor.getName()))
        .collect(Collectors.toSet());
  }

  @Override
  public Optional<Course> query(String title) {
    for (var course : buffer) {
      if (course.getTitle().equals(title)) {
        return Optional.of(course);
      }
    }

    return Optional.empty();
  }

  @Override
  public void save(Course course) {
    buffer.add(course);
  }
}
