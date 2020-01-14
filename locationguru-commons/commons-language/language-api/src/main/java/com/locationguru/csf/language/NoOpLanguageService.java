package com.locationguru.csf.language;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This implementation does nothing.
 */
public class NoOpLanguageService
		implements LanguageService
{
	private static final Logger logger = LogManager.getLogger(NoOpLanguageService.class);

	@Override
	public void sayHello()
	{
		// No-operation implementation
	}
}
