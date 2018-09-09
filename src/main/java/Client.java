class Client {
  private Account account;

  private Client(Account account) {
    this.account = account;
  }

  static Client register(Account account) {
    return new Client(account);
  }

  void makeADeposit(Money money) {
    account.addFunds(money);
  }

  Account getAccount() {
    return account;
  }
}
