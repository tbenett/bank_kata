package io.benett;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OperationsRepositoryTest {

  private OperationsRepository operationRepository;

  @BeforeEach
  void setUp() {
    operationRepository = new OperationsRepository();
  }

  @Test
  void add_deposit_creates_and_stores_a_deposit_transaction() {
    operationRepository.addDeposit(100);

    assertThat(operationRepository.allOperations().size()).isEqualTo(1);
    assertThat(operationRepository.allOperations().get(0)).isEqualTo(new Operation(100));
  }


  @Test
  void add_withdrawal_creates_and_stores_a_deposit_transaction() {
    operationRepository.addWithdrawal(100);

    assertThat(operationRepository.allOperations().size()).isEqualTo(1);
    assertThat(operationRepository.allOperations().get(0)).isEqualTo(new Operation(-100));
  }
}