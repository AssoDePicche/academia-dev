public final class Enrollment {
  private Student student;
  private Course course;
  private Progress progress = new Progress();

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

  public Progress getProgress() {
    return progress;
  }
}
