import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

  @Test
  void itCanAddFundsToAnEmptyAccount() {
    Account account = Account.of(Money.eur(0));

    assertThat(account.addFunds(Money.eur(10))).isEqualTo(Account.of(Money.eur(10)));
  }

  @Test
  void itCanAddFundsToAnInCreditAccount() {
    Account account = Account.of(Money.eur(15));

    assertThat(account.addFunds(Money.eur(10))).isEqualTo(Account.of(Money.eur(25)));
  }

  @Test
  void itCanAddFundsToAnOverdrawnAccount() {
    Account account = Account.of(Money.eur(-15));

    assertThat(account.addFunds(Money.eur(10))).isEqualTo(Account.of(Money.eur(-5)));
  }
}