import java.util.Objects;

class Account {
  private Money funds;

  private Account(Money eur) {
    funds = eur;
  }

  static Account of(Money eur) {
    return new Account(eur);
  }

  Money getFunds() {
    return funds;
  }

  void addFunds(Money money) {
    funds = funds.plus(money);
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