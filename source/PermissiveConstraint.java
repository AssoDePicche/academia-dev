public final class PermissiveConstraint implements EnrollmentConstraint {
  @Override
  public boolean isEligible(Student student) {
    return true;
  }
}
