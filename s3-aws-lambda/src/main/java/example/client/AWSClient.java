package example.client;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.GetObjectRequest;

import org.apache.commons.configuration2.Configuration;

import example.utils.ConfigurationReader;
import example.exception.LambdaException;

public class AWSClient {

  String sourceBucket;
  String sourceKey;
  AmazonS3 s3Client;

  private Configuration getConfig() throws LambdaException {
    ConfigurationReader configurationReader = new ConfigurationReader();
    return configurationReader.getConfig();
  }

  public AWSClient(String sourceBucket, String sourceKey) throws LambdaException{
    this.sourceBucket = sourceBucket;
    this.sourceKey = sourceKey;
    Configuration configuration = getConfig();
    AWSCredentials credentials = new BasicAWSCredentials(configuration.getString("key.id"), configuration.getString("key.secret"));
    ClientConfiguration clientConfig = new ClientConfiguration();
    this.s3Client = new AmazonS3Client(credentials, clientConfig);
  }

  public S3Object getS3Object() {
    return getS3Client().getObject(new GetObjectRequest(sourceBucket, sourceKey));
  }

  public AmazonS3 getS3Client(){
    return this.s3Client;
  }

}
