package io.benett;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

class ClockTest {
  @Mock
  private LocalDate localDate;

  @Test
  void today_string_is_formatted_dd_mm_yyyy() {
    assertThat(new TestableClock().today()).isEqualTo("01/01/1974");
  }

  private class TestableClock {

    String today() {
      return LocalDate.of(1974, 1, 1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
  }
}