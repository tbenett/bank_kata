package io.benett;

class Account {
  private final OperationsRepository operationsRepository;

  public Account(OperationsRepository operationsRepository) {
    this.operationsRepository = operationsRepository;
  }

  public void deposit(int amount) {
    operationsRepository.addDeposit(amount);
  }
}
