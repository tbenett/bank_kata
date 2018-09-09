import java.util.Objects;

class Account {
  private final Money funds;

  private Account(Money eur) {
    funds = eur;
  }

  static Account of(Money eur) {
    return new Account(eur);
  }

  Money getFunds() {
    return funds;
  }

  public Account addFunds(Money eur) {
    return Account.of(eur);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Account account = (Account) o;
    return Objects.equals(funds, account.funds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(funds);
  }

  @Override
  public String toString() {
    return "Account{" +
        "funds=" + funds +
        '}';
  }
}