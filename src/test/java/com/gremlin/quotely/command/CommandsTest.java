package com.gremlin.quotely.command;

import com.gremlin.quotely.model.Quote;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CommandsTest {

  private final String QUOTE_EXPECTED = "two is always more than one -- frank pinto";

  private Commands commands;

  @BeforeEach
  public void setup() {
    commands = new Commands(language -> Quote.builder()
        .quoteAuthor("frank pinto")
        .quoteText("two is always more than one")
        .build());
  }

  @Test
  public void quoteEnglishOptionTest() {
    String quote = commands.quote("english");
    Assertions.assertEquals(QUOTE_EXPECTED, quote);
  }

  @Test
  public void quoteRussianOptionTest() {
    String quote = commands.quote("russian");
    Assertions.assertEquals(QUOTE_EXPECTED, quote);
  }

  @Test
  public void quoteLanguageNotFoundTest() {

    Assertions.assertThrowsExactly(
        RuntimeException.class,
        () -> commands.quote("spanish")
    );
  }
}
