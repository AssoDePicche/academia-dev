import java.util.function.Predicate;

public final class OngoingCoursesConstraint implements EnrollmentConstraint {
  public static final int MAX_ONGOING_COURSES = 3;

  @Override
  public boolean isEligible(Student student) {
    Predicate<Enrollment> isActive = (enrollment) -> {
      return enrollment.getCourse().getStatus() == CourseStatus.ACTIVE;
    };

    var ongoingCourses = student.getEnrollments().stream().filter(isActive).toList().size();

    if (ongoingCourses < MAX_ONGOING_COURSES) {
      return true;
    }

    throw new MaxOngoingCoursesException("Limite de matrículas de cursos em andamento atingido");
  }
}
