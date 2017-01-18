package example;

import java.io.File;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ConfigurationLauncher {

  private Configuration getConfig(){
    Configurations configs = new Configurations();
    try{
      Configuration config = configs.properties(new File("aws.properties"));
      return config;
    }
    catch (ConfigurationException cex) {
      System.out.println("Error: " + cex.getMessage());
    }
  }

}
