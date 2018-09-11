package io.benett;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
        new Operation(100),
        new Operation(-58)
    );

    operationsPrinter.print(operations);

    verify(console).printLine(OperationsPrinter.HEADER);
    verify(console).printLine("100;100");
    verify(console).printLine("-58;42");
  }
}