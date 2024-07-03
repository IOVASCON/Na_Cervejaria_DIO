package com.brewmasters.cervejaria.controller;

// Importing necessary classes and annotations
import com.brewmasters.cervejaria.model.Cerveja; // Model class for Cerveja
import com.brewmasters.cervejaria.service.CervejaService; // Service class for Cerveja operations
import org.springframework.beans.factory.annotation.Autowired; // Annotation for dependency injection
import org.springframework.http.HttpStatus; // Enum for HTTP status codes
import org.springframework.http.ResponseEntity; // Class for HTTP responses
import org.springframework.web.bind.annotation.*; // Annotations for RESTful web services

import java.util.List; // List collection
import java.util.Optional; // Optional class

/**
 * Controller for managing beer-related operations.
 * Provides endpoints for creating, retrieving, and deleting beers.
 * Este arquivo define um controlador Spring Boot para gerenciar operações
 * relacionadas a cervejas,
 * fornecendo endpoints para criar, recuperar e deletar cervejas. Cada método
 * está documentado com comentários
 * que descrevem seu propósito e comportamento, e os imports são comentados para
 * explicar sua função.
 */
@RestController
@RequestMapping("/api/cervejas")
public class CervejaController {

    @Autowired
    private CervejaService cervejaService;

    /**
     * Creates a new beer.
     *
     * @param cerveja the beer to create
     * @return ResponseEntity containing the created beer and HTTP status
     */
    @PostMapping
    public ResponseEntity<Cerveja> createCerveja(@RequestBody Cerveja cerveja) {
        Cerveja savedCerveja = cervejaService.save(cerveja);
        return new ResponseEntity<>(savedCerveja, HttpStatus.CREATED);
    }

    /**
     * Retrieves a list of all beers.
     *
     * @return ResponseEntity containing the list of beers and HTTP status
     */
    @GetMapping
    public ResponseEntity<List<Cerveja>> listAllCervejas() {
        List<Cerveja> cervejas = cervejaService.findAll();
        return new ResponseEntity<>(cervejas, HttpStatus.OK);
    }

    /**
     * Retrieves a beer by its name.
     *
     * @param nome the name of the beer to retrieve
     * @return ResponseEntity containing the beer and HTTP status, or NOT FOUND if
     *         the beer doesn't exist
     */
    @GetMapping("/{nome}")
    public ResponseEntity<Cerveja> getCervejaByName(@PathVariable String nome) {
        Optional<Cerveja> cerveja = cervejaService.findByName(nome);
        return cerveja.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * Deletes a beer by its ID.
     *
     * @param id the ID of the beer to delete
     * @return ResponseEntity with HTTP status NO CONTENT
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCerveja(@PathVariable Long id) {
        cervejaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
