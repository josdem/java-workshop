package example.utils;

import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.event.S3EventNotification.S3Entity;

public class MetadataFileHelper {

  private S3Event event;

  public MetadataFileHelper(S3Event event){
    this.event = event;
  }

  private S3Entity getBucketEntity(){
    return this.event.getRecords().get(0).getS3();
  }

  public String getSourceBucketName() {
    return getBucketEntity().getBucket().getName();
  }

  public String getSourceBucketKey() {
    return getBucketEntity().getObject().getKey();
  }

  public String getDestinationBucketName() {
    return "josdem-s3-destination";
  }

  public String getDestinationBucketKey() {
    return "copied-" + getBucketEntity().getObject().getKey();
  }

}
