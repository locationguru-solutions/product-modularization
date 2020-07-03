package com.locationguru.events.model;

import java.sql.Timestamp;

public class EventData
{
	private Timestamp timestamp;

	public Timestamp getTimestamp()
	{
		return timestamp;
	}

	@Override
	public String toString()
	{
		return "EventData{" +
					   "timestamp=" + timestamp +
					   '}';
	}
}
