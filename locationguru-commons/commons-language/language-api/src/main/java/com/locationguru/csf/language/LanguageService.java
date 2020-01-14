package com.locationguru.csf.language;

public interface LanguageService
		extends AutoCloseable
{
	public default void initialize()
	{

	}

	public void sayHello();

	@Override
	public default void close()
	{

	}

}
