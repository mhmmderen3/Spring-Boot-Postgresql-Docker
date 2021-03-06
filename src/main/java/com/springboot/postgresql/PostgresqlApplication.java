package com.springboot.postgresql;

import com.springboot.postgresql.model.AuditorAwareImpl;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@OpenAPIDefinition
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class PostgresqlApplication {

    @Bean
    public AuditorAware<String> auditorAware(){
        return new AuditorAwareImpl();
    }

    public static void main(String[] args) {
        SpringApplication.run(PostgresqlApplication.class, args);
    }

}
