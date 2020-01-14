package config;

import com.locationguru.csf.language.LanguageService;
import com.locationguru.csf.language.english.EnglishLanguageService;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnClass({ EnglishLanguageService.class })
@ConditionalOnMissingBean(LanguageService.class)
@EnableConfigurationProperties({ LanguageServiceProperties.class })
public class EnglishLanguageServiceAutoConfiguration
{
	@Bean(initMethod = "initialize", destroyMethod = "close")
	@ConditionalOnProperty(prefix = "application.language-service", name = "provider", havingValue = "english", matchIfMissing = true)
	public EnglishLanguageService englishLanguageService()
	{
		return new EnglishLanguageService();
	}
}
