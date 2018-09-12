package bank_kata;

import java.time.format.DateTimeFormatter;
import java.util.List;

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
          operation.date().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
              + ";"
              + String.valueOf(operation.amount())
              + ";"
              + String.valueOf(balance)
      );
    }
  }
}
