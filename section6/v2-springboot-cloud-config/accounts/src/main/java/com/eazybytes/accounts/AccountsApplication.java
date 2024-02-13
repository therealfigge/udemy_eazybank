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
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication() //(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@ComponentScan("com.eazybytes.accounts.controller")
//@EntityScan("com.eazybytes.accounts.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice REST API documentation",
				description = "Eazybank Accounts microservice REST API documentation",
				version = "v1",
				contact = @Contact(
						name = "Fredrik Strandberg",
						email = "fredrik.strandberg@outlook.com",
						url = "https://www.eazybytes.com"
				),
				license = @License(
						name = "Apache 2.0"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Udemy Eazybank Accounts REST API project",
				url = "http://localhost:8080/swagger-ui/index.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
