package config;

import com.locationguru.events.EmployeeEventHandler;
import com.locationguru.events.teampilot.TeamPilotEmployeeEventHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(TeamPilotEmployeeEventHandler.class)
public class TeamPilotEmployeeEventsAutoConfiguration
{
	private static final Logger logger = LogManager.getLogger(TeamPilotEmployeeEventsAutoConfiguration.class);

	@Bean
	@ConditionalOnMissingBean(value = EmployeeEventHandler.class)
	@ConditionalOnProperty(prefix = "application.employee-event", name = "handler", havingValue = "team-pilot")
	public EmployeeEventHandler employeeEventHandler()
	{
		return new TeamPilotEmployeeEventHandler();
	}
}
