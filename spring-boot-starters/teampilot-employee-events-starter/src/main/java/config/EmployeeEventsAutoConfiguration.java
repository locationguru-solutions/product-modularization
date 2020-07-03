package config;

import com.locationguru.NoOpEmployeeEventHandler;
import com.locationguru.events.EmployeeEventHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(EmployeeEventHandler.class)
public class EmployeeEventsAutoConfiguration
{
	private static final Logger logger = LogManager.getLogger(EmployeeEventsAutoConfiguration.class);

	@Bean(initMethod = "initialize", destroyMethod = "close")
	@ConditionalOnMissingBean(value = EmployeeEventHandler.class)
	@ConditionalOnProperty(prefix = "application.employee-event", name = "handler", havingValue = "no-op", matchIfMissing = true)
	public EmployeeEventHandler employeeEventHandler()
	{
		return new NoOpEmployeeEventHandler();
	}
}
