package com.example.springboot_utilizando_beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springboot_utilizando_beans.config.AppConfig;
import com.example.springboot_utilizando_beans.entities.Autor;
import com.example.springboot_utilizando_beans.entities.Livro;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        Autor autor = factory.getBean(Autor.class);
        livro.setNome("Sense and Sensibility");
        livro.setCodigo("435657");
        autor.setNome("Jane Austen");
        System.out.println(livro);
        System.out.println(autor);
    }
}
