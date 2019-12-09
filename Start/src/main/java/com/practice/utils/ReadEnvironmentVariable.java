package com.practice.utils;

import java.util.Map;

public class ReadEnvironmentVariable {

  public static String getEnv(String key) {
    return System.getenv(key);
  }

  public static void printall(String[] args) {
    System.out.println("Read All Env Variables:");
    Map<String, String> map = System.getenv();
    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }
  }

}
