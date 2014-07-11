package com.titan.constants;

public final class CommonConstants {

	private CommonConstants(){
		
	}
	//Rexster server ip, port key details
	public static final String REXTER_SERVER_IP_KEY = "rexter.server.ip";
	
	public static final String REXTER_SERVER_PORT_KEY = "rexter.server.port";
	
	public static final String TITAN_GRAPH_NAME = "titangraph";
	
	public static final String TITAN_CONFIG_FILE_LOCATION_KEY = "titangraph.config.file.location";
	
	//Different type of vertex present in the graph db
	public static final String TYPE_USER= "user";
	
	public static final String TYPE_TWEET = "tweet";
	
	public static final String TYPE_RETWEET = "retweet";
		
	public static final String TYPE_KEYWORD = "keyword";
	
	public static final String TYPE_SCORE = "score";
	
	
	public static final String CONTEXT = "context_id";
	
	public static final String TYPE = "type";
	
	public static final String LABEL_HAS_TWEETED = "has_tweeted";
	
	public static final String LABEL_HAS_RETWEETED = "has_retweeted";
	
	public static final String LABEL_TWEETED_BY = "tweeted_by";
	
	public static final String LABEL_RETWEETED_BY = "retweeted_by";
	
	public static final String LABEL_HAS_KEYWORD = "has_keyword";
	
	public static final String LABEL_RETWEETED_AS = "retweeted_as";
	
	public static final String LABEL_RETWEET_OF = "retweet_of";
	
	public static final String LABEL_HAS_SCORE = "has_score";
	
	public static final String PROP_UNIQUE_ID = "unique_id";
	
	public static final String PROP_WEIGHT = "weight";
	
	public static final String PROP_USER_ID = "user_id";
	
	public static final String PROP_TWEET_ID = "tweet_id";
	
	public static final String PROP_STR_TWEET_ID = "str_tweet_id";
	
	public static final String PROP_WORD = "word";
	
	public static final String PROP_VIRALITY_SCORE = "virality_score";
	
	public static final String PROP_VELOCITY_SCORE = "velocity_score";
	
	public static final String PROP_CREATED_AT = "created_at";
	
	public static final String PROP_INFLUENCE_SCORE = "influence_score";
	
	public static final String PROP_FRIENDS_COUNT = "friends_count";
	
	public static final String PROP_FOLLOWERS_COUNT = "followers_count";
	
	public static final String PROP_STATUSES_COUNT = "statuses_count";
	
	public static final String PROP_LISTED_COUNT = "listed_count";
	
	public static final String PROP_FAV_COUNT= "fav_count";
	
	public static final String PROP_VERIFIED= "verified";
	
	public static final String PROP_CONTENT = "content";
	
	public static final String PROP_USER_NAME = "name";
	
	public static final String PROP_USER_SCREEN_NAME = "screen_name";
	
	public static final String PROP_USER_PROFILE_IMAGE = "profile_image";
	
	public static final String PROP_DOC_SENTIMENT = "doc_sentiment_value";
	
	//public static final String PROP_REPUTATION_SCORE = "reputation_score";
	
	//Cassandra configuration
	public static final String STORAGE_BACKEND_KEY = "storage.backend";
	
	public static final String STORAGE_HOSTNAME_KEY = "storage.hostname";
	
	public static final String CACHE_DB_KEY = "cache.db-cache";
	
	public static final String CACHE_DB_CLEAN_KEY = "cache.db-cache-clean-wait";
	
	public static final String CACHE_DB_TIME = "cache.db-cache-time";
	
	public static final String CACHE_DB_SIZE = "cache.db-cache-size";
	
	//Datasource
	public static final String DATASOURCE_TWITTER = "twitter";
	
	
	
	
	
	
	
	
}
