package bank_kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountTest {

  private Account account;
  @Mock
  private OperationsStore operationsStore;
  @Mock
  private OperationsPrinter operationsPrinter;
  @Mock
  private Clock clock;
  private LocalDate date;

  @BeforeEach
  void setUp() {
    account = new Account(clock, operationsStore, operationsPrinter);
    date = LocalDate.of(1974, 1, 1);
  }

  @Test
  void deposit_money_stores_a_deposit_operation() {
    when(clock.today()).thenReturn(date);

    account.deposit(100);

    verify(operationsStore).addDeposit(new Operation(date, 100));
  }

  @Test
  void withdraw_money_stores_a_withdrawal_operation() {
    when(clock.today()).thenReturn("01/01/1987");

    account.withdraw(100);

    verify(operationsStore).addWithdrawal(new Operation("01/01/1987", -100));
  }

  @Test
  void checking_operations_print_all_operations() {
    account.deposit(1000);
    account.withdraw(500);

    account.checkOperations();

    verify(operationsPrinter).print(operationsStore.allOperations());
  }
}