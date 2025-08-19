public final class TestRunner {
  public void execute(Object object) {
    for (var method : object.getClass().getDeclaredMethods()) {
      if (!method.isAnnotationPresent(Test.class)) {
        continue;
      }

      try {
        method.invoke(object);
      } catch (Exception exception) {
        exception.printStackTrace();
      }
    }
  }
}
