s3 AWS Lambda
------------------------------------

## To invoke use this command

```bash
aws lambda invoke \
--invocation-type Event \
--function-name s3-aws-lambda \
--region us-west-1 \
--payload file://inputfile.txt \
outputfile.txt
```

