package org.SpringBootCrud.BootCrud;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot Rest API Documentation",
			description = "Spring Boot Rest API Documentation",
			version = "v1.0",
			contact = @Contact(
					name = "Moriah",
					email = "moriahsahkhar@gmail.com",
					url = "www.google.com"
			),
			license = @License(
					name = "Apache 2.0",
					url = "www.google.com"
			)),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot User Management Documentation",
				url = "www.google.com"
		)
)
public class BootCrudApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(BootCrudApplication.class, args);
	}

}
