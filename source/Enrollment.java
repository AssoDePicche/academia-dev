public final class Enrollment {
  private Student student;
  private Course course;
  private double progress = 0.0f;

  public Enrollment(Student student, Course course) {
    this.student = student;

    this.course = course;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public double getProgress() {
    return progress;
  }

  public void setProgress(double progress) {
    if (progress < 0 || progress > 100) {
      throw new IllegalArgumentException("O progresso do curso deve estar entre 0% e 100%");
    }

    this.progress = progress;
  }
}
