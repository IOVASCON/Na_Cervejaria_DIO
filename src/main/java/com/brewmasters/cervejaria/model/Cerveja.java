package com.brewmasters.cervejaria.model;

// Importing necessary JPA annotations
import javax.persistence.Entity; // Annotation to mark this class as a JPA entity
import javax.persistence.GeneratedValue; // Annotation for the strategy of primary key generation
import javax.persistence.GenerationType; // Enum for different generation strategies
import javax.persistence.Id; // Annotation to mark the primary key field

/**
 * Cerveja entity representing a beer in the system.
 * This class is mapped to a table in the database.
 */
@Entity
public class Cerveja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique identifier for each beer
    private String nome; // Name of the beer
    private String tipo; // Type of the beer (e.g., IPA, Lager)
    private double teorAlcoolico; // Alcohol content of the beer
    private int volume; // Volume of the beer in milliliters
    private int quantidadeEstoque; // Quantity of the beer in stock

    /**
     * Este arquivo define a classe Cerveja como uma entidade JPA, que representa
     * uma cerveja no sistema.
     * A classe possui vários campos com anotações JPA para mapear a classe para uma
     * tabela no banco de dados,
     * e inclui getters e setters para esses campos.
     */

    // Getters and Setters for the fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
