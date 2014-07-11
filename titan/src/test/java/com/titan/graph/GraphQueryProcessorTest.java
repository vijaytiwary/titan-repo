package com.titan.graph;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GraphQueryProcessorTest {
	
private static final Logger LOG = LoggerFactory.getLogger(GraphQueryProcessorTest.class);
	
	private GraphQueryProcessor graphQueryProcessor = null;
	
	@Before
	 public void setUp() {
		
		graphQueryProcessor = new GraphQueryProcessor();
			
		}
	
	@Test
	public void  getNetworkForTweetTest(){
		
		
			Long timeTaken = graphQueryProcessor.getNetworkForTweet();
			
			LOG.info("Time taken for itearting the retweets is :"+timeTaken);
		
		
	}

}
