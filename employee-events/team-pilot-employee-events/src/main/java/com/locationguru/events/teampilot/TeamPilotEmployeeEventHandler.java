package com.locationguru.events.teampilot;

import com.locationguru.events.EmployeeEventHandler;
import com.locationguru.events.model.EventData;
import com.locationguru.events.model.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TeamPilotEmployeeEventHandler
		implements EmployeeEventHandler
{

	private static final Logger logger = LogManager.getLogger(TeamPilotEmployeeEventHandler.class);


	@Override
	public Result handleEvent(final String event, final EventData data)
	{
		switch (event)
		{
			case "Add":
			{
				logger.info("Employee added : {}", data);
				break;
			}
		}

		return new Result();
	}

	@Override
	public void close() throws Exception
	{
		logger.info("Close");
	}
}
