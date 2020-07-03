package com.locationguru.events;

import com.locationguru.events.model.EventData;
import com.locationguru.events.model.Result;

public interface EmployeeEventHandler
		extends AutoCloseable
{
	public default void initialize()
	{

	}

	public Result handleEvent(String event, EventData data);


}