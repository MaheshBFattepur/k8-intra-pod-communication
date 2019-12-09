package com.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.practice.utils.ReadEnvironmentVariable;

@RestController
@RequestMapping("/eserver")
public class TestRestController {

  @GetMapping("/is_ready")
  public ResponseEntity<String> isReady() {
    return new ResponseEntity<>("I'm ready!", HttpStatus.OK);
  }

  @GetMapping("/is_alive")
  public ResponseEntity<String> isAlive() {
    return new ResponseEntity<>("I'm alive!", HttpStatus.OK);
  }

  private static final String Reqtemplate = "[Server: End, Node: %s] Server acknowledge to hello!!!";

  @RequestMapping("/acknowledgehello")
  public String greeting() {
    return String.format(Reqtemplate, ReadEnvironmentVariable.getEnv("MY_NODE_NAME"));
  }

}
