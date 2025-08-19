import java.util.regex.Pattern;

public final class Email {
  public static final String PATTERN = "^(.+)@(\\S+){3,320}$";

  private String address;

  public Email(String address) {
    if (!Pattern.compile(PATTERN).matcher(address).matches()) {
      throw new IllegalArgumentException("E-mail inválido");
    }
  }

  @Override
  public String toString() {
    return address;
  }
}
