package Client;

import bank_kata.*;

class Client {
  public static void main(String[] args) {
    var operationsRepository = new OperationsStore();
    var operationsPrinter = new OperationsPrinter(new Console());
    var account = new Account(new Clock(), operationsRepository, operationsPrinter);

    account.deposit(100);
    account.withdraw(58);
    account.deposit(1295);

    account.checkOperations();
  }
}
