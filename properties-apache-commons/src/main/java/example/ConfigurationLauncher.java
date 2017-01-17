package example;

import java.io.File;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ConfigurationLauncher {

  private void readProperties(){
    Configurations configs = new Configurations();
    try{ 
      Configuration config = configs.properties(new File("configuration.properties"));
      String username = config.getString("username");
      String password = config.getString("password");
      System.out.println("{username:" + username + ",password:"+ password + "}");
    }
    catch (ConfigurationException cex) {
      System.out.println("Error: " + cex.getMessage());
    }
  }

  public static void main(String[] args){
    new ConfigurationLauncher().readProperties();
  }

}