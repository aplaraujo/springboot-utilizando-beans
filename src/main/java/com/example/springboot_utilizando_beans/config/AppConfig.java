package com.example.springboot_utilizando_beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springboot_utilizando_beans.entities.Livro;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro() {
        return new Livro(null, null);
    }
}
