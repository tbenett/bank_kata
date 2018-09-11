package Client;

import io.benett.*;

class Client {
  public static void main(String[] args) {
    var operationsRepository = new OperationsRepository();
    var operationsPrinter = new OperationsPrinter(new Console());
    var account = new Account(new Clock(), operationsRepository, operationsPrinter);

    account.deposit(100);
    account.withdraw(58);
    account.deposit(1295);

    account.checkOperations();
  }
}
