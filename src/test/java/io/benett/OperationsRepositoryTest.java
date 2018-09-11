package io.benett;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class OperationsRepositoryTest {

  private OperationsRepository operationRepository;

  @BeforeEach
  void setUp() {
    operationRepository = new OperationsRepository();
  }

  @Test
  void add_deposit_creates_and_stores_a_deposit_transaction() {
    operationRepository.addDeposit(new Operation("01/01/1974", 100));

    assertThat(operationRepository.allOperations().size()).isEqualTo(1);
    assertThat(operationRepository.allOperations().get(0)).isEqualTo(new Operation("01/01/1974", 100));
  }


  @Test
  void add_withdrawal_creates_and_stores_a_deposit_transaction() {
    operationRepository.addWithdrawal(new Operation("01/01/1987", -100));

    assertThat(operationRepository.allOperations().size()).isEqualTo(1);
    assertThat(operationRepository.allOperations().get(0)).isEqualTo(new Operation("01/01/1987", -100));
  }
}