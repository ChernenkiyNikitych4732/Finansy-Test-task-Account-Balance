package com.chernenkiy.finansy_test_task_account_balance.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Account Balance",
                description = "REST API for managing an account balance",
                version = "1.0.0",
                contact = @Contact(
                        name = "Nikita",
                        email = "test@example.com"
                )
        )
)
public class OpenApiConfig {
}
