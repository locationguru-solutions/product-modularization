package com.locationguru.csf.language.english;

import com.locationguru.csf.language.LanguageService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnglishLanguageService
		implements LanguageService
{
	private static final Logger logger = LogManager.getLogger(EnglishLanguageService.class);

	@Override
	public void sayHello()
	{
		logger.info("Hello, world !!!");
	}
}
