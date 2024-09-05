package com.gremlin.quotely.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder(toBuilder = true)
@Jacksonized
public class Quote {
  private String quoteText;
  private String quoteAuthor;
  private String senderName;
  private String senderLink;
  private String quoteLink;
}
