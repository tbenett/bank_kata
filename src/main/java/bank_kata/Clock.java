package bank_kata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Clock {
  public String today() {
    return LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
  }
}
