package example;

import java.io.InputStream;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.model.ObjectMetadata;

public class BucketFileTransfer implements RequestHandler<S3Event, Integer> {

  @Override
  public Integer handleRequest(S3Event event, Context context) {
    LambdaLogger logger = context.getLogger();
    logger.log("STARTING to copy file");

    MetadataFileHelper metadataFileHelper = new MetadataFileHelper(event);
    String sourceBucket = metadataFileHelper.getSourceBucketName();
    String sourceKey = metadataFileHelper.getSourceBucketKey();
    String destinationBucket = metadataFileHelper.getDestinationBucketName();;
    String destinationKey = metadataFileHelper.getDestinationBucketKey();

    AWSClient awsClient = new AWSClient(sourceBucket, sourceKey);
    InputStream objectData = awsClient.getS3Object().getObjectContent();
    ObjectMetadata meta = awsClient.getS3Object().getObjectMetadata();
    awsClient.getS3Client().putObject(destinationBucket, destinationKey, objectData, meta);
    return ResultCode.OK;
  }

}
