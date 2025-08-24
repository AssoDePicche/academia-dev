public final class Progress {
  private double percentage = 0.0;

  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) throws IllegalArgumentException {
    if (percentage < 0 || percentage > 100) {
      throw new IllegalArgumentException("O progresso do curso deve estar entre 0% e 100%");
    }

    this.percentage = percentage;
  }
}
