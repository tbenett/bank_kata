import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClientTest {

  @Test
  void AClientCanSaveMoney() {
    final Account account = Account.of(Money.eur(0));
    final Client client = Client.register(account);
    final Money depositAmount = Money.eur(10);

    client.makeADeposit(depositAmount);

    assertThat(client.getAccount().getFunds()).isEqualTo(depositAmount);
  }
}