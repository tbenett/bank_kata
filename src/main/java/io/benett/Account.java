package io.benett;

public class Account {
  private final OperationsRepository operationsRepository;
  private final OperationsPrinter operationsPrinter;
  private Clock clock;

  public Account(Clock clock, OperationsRepository operationsRepository,
                 OperationsPrinter operationsPrinter) {
    this.clock = clock;
    this.operationsRepository = operationsRepository;
    this.operationsPrinter = operationsPrinter;
  }

  public void deposit(int amount) {
    operationsRepository.addDeposit(new Operation(clock.today(), amount));
  }

  public void withdraw(int amount) {
    operationsRepository.addWithdrawal(new Operation(clock.today(), -amount));
  }

  public void checkOperations() {
    operationsPrinter.print(operationsRepository.allOperations());
  }
}
