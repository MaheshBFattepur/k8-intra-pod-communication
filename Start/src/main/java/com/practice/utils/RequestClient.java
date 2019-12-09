package com.practice.utils;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class RequestClient {
  private static ClientConfig config = new ClientConfig();

  public static Client getClient() {
    return ClientBuilder.newClient(config);
  }
}
