package org.study.jsf.basic;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContainerInitializer;

import org.springframework.beans.BeanUtils;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class JsfServletRegistrationBean<T extends ServletContainerInitializer>
		implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

	private final Class<T> servletContainerInitializerClass;

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {

		Set<Class<?>> clazz = new HashSet<Class<?>>();
		factory.addInitializers(servletContext -> {
			T servletContextInitializer = BeanUtils.instantiateClass(getServletContainerInitializerClass());
			servletContextInitializer.onStartup(clazz, servletContext);
		});
		
	}

}
