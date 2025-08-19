public abstract class TestCase {
  public final void assertEquals(Object left, Object right) {
    assert (left.equals(right));
  }
}
