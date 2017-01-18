package example.utils;

import java.io.File;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import example.exception.LambdaException;

public class ConfigurationReader {

  public Configuration getConfig(){
    Configurations configs = new Configurations();
    try{
      Configuration config = configs.properties(new File("aws.properties"));
      return config;
    } catch (ConfigurationException cex) {
      throw new LambdaException(cex.getMessage(), cex);
    }
  }

}
