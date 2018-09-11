package io.benett;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AccountTest {

  private Account account;
  @Mock
  private OperationsRepository operationsRepository;
  @Mock
  private OperationsPrinter operationsPrinter;

  @BeforeEach
  void setUp() {
    account = new Account(operationsRepository, operationsPrinter);
  }

  @Test
  void deposit_money_stores_a_deposit_operation() {
    account.deposit(100);

    verify(operationsRepository).addDeposit(100);
  }

  @Test
  void withdraw_money_stores_a_withdrawal_operation() {
    account.withdraw(100);

    verify(operationsRepository).addWithdrawal(100);
  }

  @Test
  void checking_operations_print_all_operations() {
    account.deposit(1000);
    account.withdraw(500);

    account.checkOperations();

    verify(operationsPrinter).print(operationsRepository.allOperations());
  }
}