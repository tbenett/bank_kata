class Client {
  private final Account account;

  private Client(Account account) {
    this.account = account;
  }

  static Client register(Account account) {
    return new Client(account);
  }

  void makeDeposit(Money money) {
    account.addFunds(money);
  }
}
