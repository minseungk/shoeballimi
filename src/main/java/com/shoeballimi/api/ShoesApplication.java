package com.shoeballimi.api;

import org.apache.coyote.http2.Http2Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShoesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ShoesApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ShoesApplication.class);
	}

	@Bean
	public ConfigurableServletWebServerFactory tomcatCustomizer() {
		TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
		factory.addConnectorCustomizers(connector -> {
			connector.addUpgradeProtocol(new Http2Protocol());
		});
		return factory;
	}
}
