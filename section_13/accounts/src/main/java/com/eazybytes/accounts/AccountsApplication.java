package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
// If you want to scan packages outside that of this mail application class, you can use the below:
/* @ComponentScans({@ComponentScan("com.eazybytes.someplace.controller"), @ComponentScan("com.eazybytes.someplace.service")})
@EnableJpaRepositories("com.eazybytes.someplace.repository")
@EntityScan("com.eazybytes.someplace.model") */
//----------------------------------------------------------------------------------------------------------------------------
// For Enabling Auditing in this Spring Boot Application. This auditorAwareRef will search for class AuditAwareRef
// where the audit details are mentioned. This auditing is used in BaseEntity class on its feilds.
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
//----------------------------------------------------------------------------------------------------------------------------
// For enabling @ConfigurationProperties annotation (which maps/reads the configuration properties in a file
// from application.yml)
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
// This annotation is for showing our API defination in swagger-ui
@OpenAPIDefinition(
	info = @Info(
			title = "Accounts microservice REST API documentation",
			description = "EazyBank Accounts microservice REST API documentation",
			version = "v1",
			contact = @Contact(
				name = "Madan Reddy",
				email = "tutor@eazybytes.com",
				url = "https://eazybytes.com"
			),
			license = @License(
				name = "Apache 2.0",
				url = "https://eazybytes.com"
			)
	),
	externalDocs = @ExternalDocumentation(
			description = "EazyBank Accounts microservice REST API documentation",
			url = "https://eazybytes.com/swagger-ui.html"
	)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
