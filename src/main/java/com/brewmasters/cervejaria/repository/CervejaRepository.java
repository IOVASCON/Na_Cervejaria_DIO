package com.brewmasters.cervejaria.repository;

// Importando as classes necessárias
import com.brewmasters.cervejaria.model.Cerveja; // Importando a classe modelo Cerveja
import org.springframework.data.jpa.repository.JpaRepository; // Importando JpaRepository para operações CRUD

import java.util.Optional; // Importando Optional para o tipo de retorno opcional

/**
 * Interface de repositório para a entidade Cerveja.
 * Estende JpaRepository para fornecer operações CRUD e métodos de consulta
 * adicionais.
 */
public interface CervejaRepository extends JpaRepository<Cerveja, Long> {
    /**
     * Método de consulta personalizado para encontrar uma Cerveja pelo seu nome.
     *
     * @param nome o nome da cerveja
     * @return um Optional contendo a Cerveja encontrada, ou vazio se não for
     *         encontrada
     */
    Optional<Cerveja> findByNome(String nome);
}
