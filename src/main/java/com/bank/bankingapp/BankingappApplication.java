package com.bank.bankingapp;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "The Bank",
                description = "Backend Rest APIs for The Bank",
                version = "v1.0",
                contact = @Contact(
                        name = "Ahmed Hassan",
                        email = "atariq344@gmail.com"
                ),
                license = @License(
                        name = "The Bank"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "The Bank Application Documentation"
        )
)
public class BankingappApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingappApplication.class, args);
    }

}
