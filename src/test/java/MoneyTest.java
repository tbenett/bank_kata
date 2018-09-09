import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {
  @Test
  void addTest() {
    final Money one = Money.eur(1);

    assertThat(one.plus(Money.eur(1))).isEqualTo(Money.eur(2));
  }
}