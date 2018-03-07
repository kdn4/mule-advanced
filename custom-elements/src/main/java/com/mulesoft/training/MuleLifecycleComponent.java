package com.mulesoft.training;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleException;
import org.mule.api.lifecycle.Callable;
import org.mule.api.lifecycle.Startable;

public class MuleLifecycleComponent implements Startable, Callable {
	private static final Logger LOG = LogManager.getLogger("com.mulesoft.training.Logger");

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		LOG.info(" ********* {} EXECUTED ********* ", this.getClass().getSimpleName());
		return eventContext.getMessage();
	}

	@Override
	public void start() throws MuleException {
		LOG.info(" ********* {} INITIATED ********* ", this.getClass().getSimpleName());

	}

}
