package com.titan.graph;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thinkaurelius.titan.core.TitanGraph;
import com.tinkerpop.blueprints.Vertex;
import com.titan.constants.CommonConstants;

public class GraphQueryProcessor {

	
	private static final Logger LOG = LoggerFactory.getLogger(GraphQueryProcessor.class);
	
	public long getNetworkForTweet() {

		TitanGraph titanGraph = null;
		Iterable<Vertex> graphTweetList = null;
		Long totalTime = 0l;
		try {
			
			titanGraph = GraphFactory.getTitanGraph();
			graphTweetList = titanGraph.query().has(CommonConstants.TYPE, CommonConstants.TYPE_TWEET).vertices();
			
			LOG.info("Data fetched ...");

			// Iterating the tweets
			int i=0;
			long startTime = System.currentTimeMillis();
			long start = System.nanoTime();
			
			
			for (Vertex graphVerRetweet : graphTweetList) {
				i++;
				long end = System.nanoTime();
				
			
				LOG.info("Time for iterating the tweet network for "+i+" th element is :" +(end - start)+" ns");
				start = end;
			}
			
			long endTime = System.currentTimeMillis();
			totalTime = endTime - startTime;
	    	LOG.info("Total Time for iterating the tweet network  is :" +totalTime+" ms");

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}

		return totalTime;
	}

}
