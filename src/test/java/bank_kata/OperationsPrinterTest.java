package bank_kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;

import static java.util.Collections.EMPTY_LIST;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class OperationsPrinterTest {

  @Mock
  private Console console;
  private OperationsPrinter operationsPrinter;

  @BeforeEach
  void setUp() {
    operationsPrinter = new OperationsPrinter(console);
  }

  @Test
  void invoking_print_always_prints_the_header() {
    operationsPrinter.print(EMPTY_LIST);

    verify(console).printLine(OperationsPrinter.HEADER);
  }

  @Test
  void invoking_print_prints_the_operations() {
    var operations = List.of(
        new Operation(LocalDate.of(1974, 1, 1), 100),
        new Operation(LocalDate.of(1987, 1, 1), -58)
    );

    operationsPrinter.print(operations);

    verify(console).printLine(OperationsPrinter.HEADER);
    verify(console).printLine("01/01/1974;100;100");
    verify(console).printLine("01/01/1987;-58;42");
  }
}