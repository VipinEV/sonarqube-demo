package com.training.sonar.sonardemo.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloRest {

  @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
  public String sayHello() {
    return "Say Hello";
  }

}
