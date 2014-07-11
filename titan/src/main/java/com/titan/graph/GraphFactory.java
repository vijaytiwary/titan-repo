/**
 *
 */
package com.titan.graph;

import org.apache.commons.configuration.BaseConfiguration;
import org.apache.commons.configuration.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thinkaurelius.titan.core.TitanFactory;
import com.thinkaurelius.titan.core.TitanGraph;
import com.titan.constants.CommonConstants;
import com.titan.util.PropertyLoader;

public final class GraphFactory {

	private GraphFactory(){
		
	}

	private static final Logger LOG = LoggerFactory.getLogger(GraphFactory.class);
	private static TitanGraph graph;


	/**This method will return an instance to the titan graph database
	 * @return TitanGraph
	 */
	public synchronized static TitanGraph getTitanGraph() {
		
		if(graph == null ||  !graph.isOpen()){

			LOG.info("Instance of titan graph does not exits");
			LOG.info("Value for : storage.backend :"+PropertyLoader.getInstance().getProperty(CommonConstants.STORAGE_BACKEND_KEY));
			Configuration config = new BaseConfiguration();
			config.setProperty(CommonConstants.STORAGE_BACKEND_KEY, PropertyLoader.getInstance().getProperty(CommonConstants.STORAGE_BACKEND_KEY));
			config.setProperty(CommonConstants.STORAGE_HOSTNAME_KEY, PropertyLoader.getInstance().getProperty(CommonConstants.STORAGE_HOSTNAME_KEY));
			config.setProperty(CommonConstants.CACHE_DB_KEY, PropertyLoader.getInstance().getProperty(CommonConstants.CACHE_DB_KEY));
			config.setProperty(CommonConstants.CACHE_DB_CLEAN_KEY, PropertyLoader.getInstance().getProperty(CommonConstants.CACHE_DB_CLEAN_KEY));
			config.setProperty(CommonConstants.CACHE_DB_TIME, PropertyLoader.getInstance().getProperty(CommonConstants.CACHE_DB_TIME));
			config.setProperty(CommonConstants.CACHE_DB_SIZE, PropertyLoader.getInstance().getProperty(CommonConstants.CACHE_DB_SIZE));

			graph = TitanFactory.open(config);

			LOG.info("Graph instance created "+graph);
		}

		return graph;
	}


}
