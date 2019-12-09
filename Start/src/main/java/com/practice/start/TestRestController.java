package com.practice.start;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.practice.utils.ReadEnvironmentVariable;

@RestController
@RequestMapping("/sserver")
public class TestRestController {

  @GetMapping("/is_ready")
  public ResponseEntity<String> isReady() {
    return new ResponseEntity<>("I'm ready!", HttpStatus.OK);
  }

  @GetMapping("/is_alive")
  public ResponseEntity<String> isAlive() {
    return new ResponseEntity<>("I'm alive!", HttpStatus.OK);
  }

  private static final String Reqtemplate = "Connection established -> [Server: Start, Node: %s] Server says hello!!! -> ";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/printhello")
  public String greeting() {
    return String.format(Reqtemplate, ReadEnvironmentVariable.getEnv("MY_NODE_NAME"));
  }

}
