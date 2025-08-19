import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public interface StudentsRepository {
  Set<Student> query();

  Set<Student> query(SubscriptionPlan subscriptionPlan);

  void save(Student student);
}
