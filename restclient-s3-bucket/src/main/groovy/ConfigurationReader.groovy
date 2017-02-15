package example

import java.io.File

import org.apache.commons.configuration2.Configuration
import org.apache.commons.configuration2.builder.fluent.Configurations
import org.apache.commons.configuration2.ex.ConfigurationException

class ConfigurationReader {

  Configuration getConfig() {
    Configurations configs = new Configurations()
    try {
      ClassLoader classLoader = getClass().getClassLoader()
      File properties = new File(classLoader.getResource("rest.properties").getFile())
      Configuration config = configs.properties(properties)
      return config
    } catch (ConfigurationException cex) {
      throw new RestException(cex.getMessage(), cex)
    }
  }

}