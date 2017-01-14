package example;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.event.S3EventNotification.S3EventNotificationRecord;

public class BucketFileTransfer implements RequestHandler<S3Event, String> {

  @Override
  public String handleRequest(S3Event event, Context context) {
    try{
      LambdaLogger logger = context.getLogger();
      S3EventNotificationRecord record = event.getRecords().get(0);
      String sourceBucket = record.getS3().getBucket().getName();
      String sourceKey = record.getS3().getObject().getKey().replace('+', ' ');
      String destinationKey = "copied-" + sourceKey;
      String destinationBucket = "josdem-s3-destination";
      sourceKey = URLDecoder.decode(sourceKey, "UTF-8");
      logger.log("source: " + sourceBucket);

      AmazonS3 s3Client = new AmazonS3Client();
      S3Object s3Object = s3Client.getObject(new GetObjectRequest(sourceBucket, sourceKey));
      InputStream objectData = s3Object.getObjectContent();
      ObjectMetadata meta = new ObjectMetadata();
      meta.setContentLength(1024L);
      s3Client.putObject(destinationBucket, destinationKey, objectData, meta);
      return sourceBucket;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
