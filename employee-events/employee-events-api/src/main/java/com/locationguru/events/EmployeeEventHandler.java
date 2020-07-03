package com.locationguru.events;

import com.locationguru.events.model.EventData;
import com.locationguru.events.model.Result;

public interface EmployeeEventHandler
{
	public Result handleEvent(String event, EventData data);

}
