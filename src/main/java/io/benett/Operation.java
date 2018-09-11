package io.benett;

import java.util.Objects;

class Operation {
  private final int amount;
  private String date;

  public Operation(String date, int amount) {
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

  public String date() {
    return date;
  }
}
