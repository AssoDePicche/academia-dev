import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public interface StudentsRepository {
  Set<Student> query();
}
