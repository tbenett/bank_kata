package bank_kata;

import java.util.ArrayList;
import java.util.List;

public class OperationsStore {
  private List<Operation> operations = new ArrayList<>();

  public void addDeposit(Operation deposit) {
    operations.add(deposit);
  }

  public void addWithdrawal(Operation withdrawal) {
    operations.add(withdrawal);
  }

  public List<Operation> allOperations() {
    return operations;
  }
}
