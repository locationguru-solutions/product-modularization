package com.locationguru.service;

import javax.annotation.PostConstruct;

import com.locationguru.events.EmployeeEventHandler;
import com.locationguru.events.model.EventData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeEventService
{
	private static final Logger logger = LogManager.getLogger(EmployeeEventService.class);

	private final EmployeeEventHandler employeeEventHandler;

	@Autowired
	public EmployeeEventService(final EmployeeEventHandler employeeEventHandler)
	{
		this.employeeEventHandler = employeeEventHandler;
	}


	@PostConstruct
	protected void initialize()
	{
		employeeEventHandler.handleEvent("started", new EventData());
	}
}
