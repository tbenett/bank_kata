package bank_kata;

public class Account {
  private final OperationsStore operationsStore;
  private final OperationsPrinter operationsPrinter;
  private Clock clock;

  public Account(Clock clock,
                 OperationsStore operationsStore,
                 OperationsPrinter operationsPrinter) {
    this.clock = clock;
    this.operationsStore = operationsStore;
    this.operationsPrinter = operationsPrinter;
  }

  public void deposit(int amount) {
    operationsStore.addDeposit(new Operation(clock.today(), amount));
  }

  public void withdraw(int amount) {
    operationsStore.addWithdrawal(new Operation(clock.today(), -amount));
  }

  public void checkOperations() {
    operationsPrinter.print(operationsStore.allOperations());
  }
}
