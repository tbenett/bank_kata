package io.benett;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class OperationsPrinter {
  public static final String HEADER = "date;amount;balance";
  private Console console;

  public OperationsPrinter(Console console) {
    this.console = console;
  }

  public void print(List<Operation> operations) {
    console.printLine(HEADER);

    int balance = 0;

    for (Operation operation : operations) {
      balance += operation.amount();

      console.printLine(
          operation.date()
              + ";"
              + String.valueOf(operation.amount())
              + ";"
              + String.valueOf(balance)
      );
    }
  }
}
