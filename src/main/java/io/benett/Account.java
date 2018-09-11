package io.benett;

public class Account {
  private final OperationsRepository operationsRepository;
  private final OperationsPrinter operationsPrinter;

  public Account(OperationsRepository operationsRepository,
                 OperationsPrinter operationsPrinter) {
    this.operationsRepository = operationsRepository;
    this.operationsPrinter = operationsPrinter;
  }

  public void deposit(int amount) {
    operationsRepository.addDeposit(amount);
  }

  public void withdraw(int amount) {
    operationsRepository.addWithdrawal(amount);
  }

  public void checkOperations() {
    operationsPrinter.print(operationsRepository.allOperations());
  }
}
