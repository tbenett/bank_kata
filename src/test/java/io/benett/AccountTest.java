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

  @BeforeEach
  void setUp() {
    account = new Account(operationsRepository);
  }

  @Test
  void deposit_money_create_a_deposit_operation() {
    account.deposit(100);

    verify(operationsRepository).addDeposit(100);
  }
}