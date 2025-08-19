import java.util.HashSet;
import java.util.Set;

public final class Course {
  private String title;
  private String description;
  private String instructorName;
  private double durationInHours;
  private DifficultyLevel difficultyLevel;
  private CourseStatus status;

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

  public String getInstructorName() {
    return instructorName;
  }

  public void setInstructorName(String instructorName) {
    this.instructorName = instructorName;
  }

  public double getDurationInHours() {
    return durationInHours;
  }

  public void setDurationInHours(double durationInHours) throws IllegalArgumentException {
    if (durationInHours <= 0) {
      throw new IllegalArgumentException("Carga horária inválida");
    }

    this.durationInHours = durationInHours;
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
}
