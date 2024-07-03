package com.brewmasters.cervejaria;

// Importando as classes necessárias do Spring Boot
import org.springframework.boot.SpringApplication; // Importando a classe SpringApplication para iniciar a aplicação
import org.springframework.boot.autoconfigure.SpringBootApplication; // Importando a anotação SpringBootApplication para configuração da aplicação

/**
 * Classe principal que inicia a aplicação Spring Boot.
 * Este arquivo define a classe principal da aplicação Spring Boot. A
 * anotação @SpringBootApplication configura automaticamente a aplicação.
 * O método main utiliza @SpringApplication.run para iniciar a aplicação.
 * 
 */
@SpringBootApplication
public class CervejariaApplication {

    /**
     * Método principal que inicia a aplicação.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        SpringApplication.run(CervejariaApplication.class, args); // Inicia a aplicação Spring Boot
    }
}
