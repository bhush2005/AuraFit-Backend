package com.example.aurafit.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Aura fit API")
                        .version("v1.0")
                        .description("Fitness tracking application APIs")
                        .contact(new Contact()
                                .name("Bhush production")
                                .email("https://bhush.com")
                        )
                        .license(new License()
                                .name("Apache 2.0"))
                );
    }
}
