package bank_kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class OperationsStoreTest {

  private OperationsStore operationRepository;
  private LocalDate date;

  @BeforeEach
  void setUp() {
    operationRepository = new OperationsStore();
    date = LocalDate.of(1974, 1, 1);
  }

  @Test
  void add_deposit_creates_and_stores_a_deposit_transaction() {
    operationRepository.addDeposit(new Operation(date, 100));

    assertThat(operationRepository.allOperations().size()).isEqualTo(1);
    assertThat(operationRepository.allOperations().get(0)).isEqualTo(new Operation(date, 100));
  }


  @Test
  void add_withdrawal_creates_and_stores_a_deposit_transaction() {
    operationRepository.addWithdrawal(new Operation(date, -100));

    assertThat(operationRepository.allOperations().size()).isEqualTo(1);
    assertThat(operationRepository.allOperations().get(0)).isEqualTo(new Operation(date, -100));
  }
}