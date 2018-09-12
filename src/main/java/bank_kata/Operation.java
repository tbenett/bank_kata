package bank_kata;

import java.time.LocalDate;
import java.util.Objects;

class Operation {
  private final int amount;
  private LocalDate date;

  public Operation(LocalDate date, int amount) {
    this.date = date;
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Operation operation = (Operation) o;
    return amount == operation.amount
        && Objects.equals(date, operation.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }

  public int amount() {
    return amount;
  }

  public LocalDate date() {
    return date;
  }
}
