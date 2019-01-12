package org.study.jsf.basic;

import org.apache.myfaces.ee.MyFacesContainerInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

	@Bean
	public JsfServletRegistrationBean<MyFacesContainerInitializer> jsfServletRegistrationBean() {
		return new JsfServletRegistrationBean<MyFacesContainerInitializer>(MyFacesContainerInitializer.class);
	}

	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> myFacesStartupServletContextListener() {

		return factory -> factory.addInitializers(servletContext -> servletContext
				.addListener("org.apache.myfaces.webapp.StartupServletContextListener"));

	}

	@Bean
	public ServletContextInitializer primeFacesServletContextParamInit() {
		return servletContext -> {
			servletContext.setInitParameter("primefaces.FONT_AWESOME", "true");
		};
	}
}
