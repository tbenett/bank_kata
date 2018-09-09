import java.util.Objects;

class Money {
  private final int value;

  private Money(int sum) {
    this.value = sum;
  }

  static Money eur(int sum) {
    return new Money(sum);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Money money = (Money) o;
    return value == money.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return "Money{" +
        "value=" + value +
        '}';
  }

  public Money plus(Money money) {
    return new Money(value + money.value);
  }
}
