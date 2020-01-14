package com.locationguru.service;

import javax.annotation.PostConstruct;

import com.locationguru.csf.language.LanguageService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService
{
	private static final Logger logger = LogManager.getLogger(HelloWorldService.class);

	private final LanguageService languageService;

	@Autowired
	public HelloWorldService(final LanguageService languageService)
	{
		this.languageService = languageService;
	}

	@PostConstruct
	protected void initialize()
	{
		languageService.sayHello();
	}
}
