package io.benett;

import java.util.Objects;

class Operation {
  private final int amount;

  public Operation(int amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Operation operation = (Operation) o;
    return amount == operation.amount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }
}
