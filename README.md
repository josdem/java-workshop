CSV Transformer
----------------------------

How to read and write a CSV file using Apache Commons CSV

#### Read this as reference

* http://josdem.io/techtalk/java/csv_apache_commons/

#### To run the project

```bash
gradle test
```

Date And Time
-----------------------------

A quick review to the `java.util.Date` API in Java 8


#### Read this as reference

* http://josdem.io/techtalk/java/java_time_api/

#### To run the project

```bash
javac BetweenDays.java
java BetweenDays

javac DateOperations.java
java DateOperations
```

Excel Reader
-----------------------------------------------

How to read an Excel file using Apache POI

#### Read this as reference

* http://josdem.io/techtalk/java/apache_poi_excel/

#### To run the project

```bash
gradle test
```

Hello AWS Lambda
--------------------------------------------

Hello World using AWS Lambda

#### Read this as reference

* http://josdem.io/techtalk/java/hello_aws_lambda/

#### To build the project

```bash
gradle buildJar
```

Java NIO Copy
--------------------------------------------

Since Java 7 we can copy files in a easy way

#### Read this as reference

* http://josdem.io/techtalk/java/java_nio_copy/

#### To build the project

```bash
javac FileCopier.java
java FileCopier
```

Lambda Expressions
--------------------------------------------

Since Java 8 we have Lambda Expressions which are some kind of anonymous functions where we can use delegate in a easy way.

#### Read this as reference

* http://josdem.io/techtalk/java/lambda_expressions/

#### To build the project

```bash
javac MainAnalyzer.java
java MainAnalyzer
```

Properties Apache Commons
--------------------------------------------

Generic configuration interface which enables a Java application to read configuration data

#### Read this as reference

* http://josdem.io/techtalk/java/configuration_apache_commons/

#### To build the project

```bash
gradle buildJar
```

#### To run the project

```bash
java -jar properties-apache-commons-all-0.0.1.jar
```

S3 AWS Lambda
--------------------------------------------

Read and copy files using AWS Lambda

#### Read this as reference

* http://josdem.io/techtalk/java/s3_aws_lambda/

#### To build the project

```bash
gradle buildZip
```

#### To invoke the project

```bash
aws lambda invoke \
--invocation-type Event \
--function-name s3-aws-lambda \
--region us-west-1 \
--payload file://inputfile.txt \
outputfile.txt
```

GMail Mailbox Reader
------------------------------------

#### Configuration

In your computer's home directory: `${home}`, create a directory called: `.mailbox-reader` then inside create a file called `application.properties` with this content

```properties
username=user@gmail.com
password=secret
pop3.server=pop.gmail.com
pop3.port=995
imap.server=imap.gmail.com
imap.port=993
ews.username=user@outlook.com
ews.password=secret
ews.server=https://exchange/EWS/Exchange.asmx
ews.protocol=https://
```

#### Build

```bash
gradle build
```

#### Run

```bash
 java -jar mailbox-reader-0.0.1-SNAPSHOT.jar
```

#### Features

* This approach is using Gmail account with IMAP enabled (Settings > Forwarding and POP/IMAP)
* Using Exchange Web Services [EWS Java API](https://github.com/OfficeDev/ews-java-api)
* Read body email usgin text/plain as ContentType
* Read body email using  multipart/mixed as ContenType

#### Read this as reference

* http://josdem.io/techtalk/camel/mailbox_reader/
* http://josdem.io/techtalk/java/mailbox_reader_pop3/
* http://josdem.io/techtalk/java/mailbox_reader_imap/
* http://josdem.io/techtalk/java/mailbox_reader_exchange/
* http://josdem.io/techtalk/spring/spring_unit_testing_spock/
* http://josdem.io/techtalk/spring/spring_boot/
* http://josdem.io/techtalk/spring/spring_gradle/
