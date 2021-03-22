package com.lprevidente.cve2docker.exception;

public class ConfigurationException extends GenerationException {

  public ConfigurationException(String message) {
    super("An error occurred during the setup: " + message);
  }
}
