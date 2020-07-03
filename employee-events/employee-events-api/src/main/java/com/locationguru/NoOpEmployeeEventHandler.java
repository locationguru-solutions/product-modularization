package com.locationguru;

import com.locationguru.events.EmployeeEventHandler;
import com.locationguru.events.model.EventData;
import com.locationguru.events.model.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NoOpEmployeeEventHandler
		implements EmployeeEventHandler
{
	private static final Logger logger = LogManager.getLogger(NoOpEmployeeEventHandler.class);

	@Override
	public Result handleEvent(final String event, final EventData data)
	{
		logger.info("Received event '{}'. Ignoring.", event);

		return new Result();
	}
}
