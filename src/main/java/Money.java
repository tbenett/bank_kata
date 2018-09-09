import java.util.Objects;

class Money {
  private final int sum;

  private Money(int sum) {
    this.sum = sum;
  }

  static Money eur(int sum) {
    return new Money(sum);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Money money = (Money) o;
    return sum == money.sum;
  }

  @Override
  public int hashCode() {
    return Objects.hash(sum);
  }
}
