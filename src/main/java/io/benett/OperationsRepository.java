package io.benett;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.List.*;

public class OperationsRepository {
  private List<Operation> operations = new ArrayList<>();

  public void addDeposit(int amount) {
    operations.add(new Operation(amount));
  }

  public void addWithdrawal(int amount) {
    throw new UnsupportedOperationException();
  }

  public List<Operation> allOperations() {
    return operations;
  }
}
