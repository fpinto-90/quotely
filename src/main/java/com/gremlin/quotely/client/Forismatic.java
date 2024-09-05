package com.gremlin.quotely.client;

import com.gremlin.quotely.model.Quote;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("forismatic")
public interface Forismatic {

  @GetMapping("/api/1.0/?method=getQuote&format=json")
  public Quote getQuote(@RequestParam("lang") String language);
}
