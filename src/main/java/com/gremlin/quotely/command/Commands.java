package com.gremlin.quotely.command;

import com.gremlin.quotely.client.Forismatic;
import com.gremlin.quotely.model.Quote;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.Map;

@ShellComponent
public class Commands {

  private final Map<String, String> LANGUAGES = Map
      .of("english", "en", "russian", "ru");

  private final Forismatic forismatic;

  public Commands(Forismatic forismatic) {
    this.forismatic = forismatic;
  }

  ;

  @ShellMethod(key = "quote", value = "request a random quote")
  public String quote(
      @ShellOption(
          value = {"-l", "--language"},
          defaultValue = "English",
          help = "select language (English, Russian)"
      )
      String language
  ) {
    if (!LANGUAGES.containsKey(language.toLowerCase())) {
      throw new RuntimeException(
          "incorrect language selected. please select either English or Russian"
      );
    }
    Quote quote = forismatic.getQuote(LANGUAGES.get(language.toLowerCase()));
    return quote.getQuoteText() + " -- " + quote.getQuoteAuthor();
  }
}
