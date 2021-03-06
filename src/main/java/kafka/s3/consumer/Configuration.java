package kafka.s3.consumer;

import java.util.Map;


interface Configuration {

	// conf property names
	public static final String ZK_CONNECT_STRING = "zk.connect";
	public static final String ZK_SESSION_TIMEOUT = "zk.sessiontimeout.ms";
	public static final String CONSUMER_GROUP_ID = "KafkaConsumer.groupId";
	public static final String CONSUMER_TIMEOUT_MS = "KafkaConsumer.consumerTimeoutMs";

	public static final String DEFAULT_FETCH_SIZE = "fetch.size";
	public static final String SOCKET_BUFFER_SIZE = "socket.buffersize";

	public static final int DEFAULT_S3_SIZE = 1024;
	public static final int DEFAULT_MSG_SIZE = 512;

	public static final String PROP_S3_ACCESS_KEY = "s3.accesskey";
	public static final String PROP_S3_SECRET_KEY = "s3.secretkey";
	public static final String PROP_S3_BUCKET = "s3.bucket";
	public static final String PROP_S3_PREFIX = "s3.prefix";

	public static final String PROP_S3_MAX_OBJECT_SIZE = "s3.maxobjectsize";
	public static final String PROP_S3_TOPIC_SIZES = "s3.objectsizes";

	public static final String PROP_KAFKA_MAX_MESSAGE_SIZE = "kafka.maxmessagesize";
	public static final String PROP_KAFKA_TOPICS = "kafka.topics";

  public static final String PROP_S3_TIME_PARTITION_FORMAT = "s3.time_partition_format";
  public static final String DEFAULT_S3_TIME_PARTITION_FORMAT = "'dt='yyyy-MM-dd-HH";

  public static final String PROP_KAFKA_TOPIC_PREFIX = "kafka.topic.prefix";

	public static final String STATSD_PREFIX = "statsd.prefix";
	public static final String STATSD_HOST = "statsd.host";
	public static final String STATSD_PORT = "statsd.port";

  public int getS3MaxObjectSize();
  public int getKafkaMaxMessageSize();

}

// vim: noet:ts=2:sw=2
