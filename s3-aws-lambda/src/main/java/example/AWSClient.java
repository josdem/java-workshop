package example;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.GetObjectRequest;

public class AWSClient {
  
  String sourceBucket; 
  String sourceKey;
  AmazonS3 s3Client;

  public AWSClient(String sourceBucket, String sourceKey){
    this.sourceBucket = sourceBucket;
    this.sourceKey = sourceKey;
    AWSCredentials credentials = new BasicAWSCredentials("AKIAI7RHCUERITC7CAUQ", "RaXbYahTRjSI/bA31r5tJ/7s48Fw/E+zZQCodGam");
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
