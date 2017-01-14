package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.s3.event.S3EventNotification.S3EventNotificationRecord;

public class BucketFileTransfer implements RequestHandler<S3Event, String> {

	@Override
	public String handleRequest(S3Event event, Context context) {
    LambdaLogger logger = context.getLogger();
		S3EventNotificationRecord record = event.getRecords().get(0);
		String sourceBucket = record.getS3().getBucket().getName();
    logger.log("source: " + sourceBucket);
		return sourceBucket;
	}

}
