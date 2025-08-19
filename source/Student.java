import java.util.HashSet;
import java.util.Set;

public final class Student extends User {
  private SubscriptionPlan subscriptionPlan;
  private EnrollmentConstraint constraint;
  private Set<Enrollment> enrollments = new HashSet<>();

  public SubscriptionPlan getSubscriptionPlan() {
    return subscriptionPlan;
  }

  public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
  }

  public Set<Enrollment> getEnrollments() {
    return enrollments;
  }

  public void enroll(Course course) throws MaxOngoingCoursesException {
    if (constraint.isEligible(this)) {
      enrollments.add(new Enrollment(this, course));
    }
  }
}
