import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

  @Test
  void itCanAddFundsToAnEmptyAccount() {
    Account account = Account.of(Money.eur(0));

    account.addFunds(Money.eur(10));

    assertThat(account.getFunds()).isEqualTo(Money.eur(10));
  }

  @Test
  void itCanAddFundsToAnInCreditAccount() {
    Account account = Account.of(Money.eur(1));

    account.addFunds(Money.eur(10));

    assertThat(account.getFunds()).isEqualTo(Money.eur(11));
  }

  @Test
  void itCanAddFundsToAnOverdrawnAccount() {
    Account account = Account.of(Money.eur(-1));

    account.addFunds(Money.eur(10));

    assertThat(account.getFunds()).isEqualTo(Money.eur(9));
  }
}