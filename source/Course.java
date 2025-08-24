import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public final class Course {
  private String title;
  private String description;
  private Instructor instructor;
  private Duration duration;
  private DifficultyLevel difficultyLevel;
  private CourseStatus status;
  private Set<Enrollment> enrollments = new HashSet<>();

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Instructor getInstructor() {
    return instructor;
  }

  public void setInstructor(Instructor instructor) {
    this.instructor = instructor;
  }

  public Duration getDuration() {
    return duration;
  }

  public void setDuration(long hours) throws IllegalArgumentException {
    if (hours <= 0) {
      throw new IllegalArgumentException("Carga horária inválida");
    }

    duration = Duration.ofHours(hours);
  }

  public DifficultyLevel getDifficultyLevel() {
    return difficultyLevel;
  }

  public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
  }

  public CourseStatus getStatus() {
    return status;
  }

  public void setStatus(CourseStatus status) {
    this.status = status;
  }

  public Set<Enrollment> getEnrollments() {
    return enrollments;
  }

  public void enroll(Student student)
      throws InactiveCourseEnrollmentException, MaxOngoingCoursesException {
    enrollments.add(new Enrollment(student, this));

    student.enroll(this);
  }
}
