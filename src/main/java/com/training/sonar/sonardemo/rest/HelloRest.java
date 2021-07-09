package com.training.sonar.sonardemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloRest {

  @GetMapping(value = "/hello")
  public String sayHello() {
    return "Say Hello!";
  }

}
