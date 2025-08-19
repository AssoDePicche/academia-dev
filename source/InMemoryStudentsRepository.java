import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class InMemoryStudentsRepository implements StudentsRepository {
  private Set<Student> buffer = new HashSet<>();

  @Override
  public Set<Student> query() {
    return buffer;
  }

  @Override
  public Set<Student> query(SubscriptionPlan subscriptionPlan) {
    return query()
        .stream()
        .filter(student -> student.getSubscriptionPlan() == subscriptionPlan)
        .collect(Collectors.toSet());
  }

  @Override
  public void save(Student student) {
    buffer.add(student);
  }
}
