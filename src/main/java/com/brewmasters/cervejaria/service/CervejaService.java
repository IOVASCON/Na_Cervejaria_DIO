package com.brewmasters.cervejaria.service;

// Importando as classes necessárias
import com.brewmasters.cervejaria.model.Cerveja; // Importando a classe modelo Cerveja
import com.brewmasters.cervejaria.repository.CervejaRepository; // Importando a interface do repositório de Cerveja
import org.springframework.beans.factory.annotation.Autowired; // Importando Autowired para injeção de dependência
import org.springframework.stereotype.Service; // Importando Service para marcar esta classe como um serviço

import java.util.List; // Importando List para retornar listas de cervejas
import java.util.Optional; // Importando Optional para retornos opcionais

/**
 * Serviço para gerenciar operações relacionadas à entidade Cerveja.
 * Este arquivo define a classe CervejaService, que fornece métodos para salvar,
 * listar, encontrar pelo nome e deletar cervejas usando o repositório
 * CervejaRepository.
 */
@Service
public class CervejaService {

    @Autowired
    private CervejaRepository cervejaRepository; // Injeção de dependência do repositório de Cerveja

    /**
     * Salva uma nova cerveja ou atualiza uma existente.
     *
     * @param cerveja a entidade Cerveja a ser salva
     * @return a entidade Cerveja salva
     */
    public Cerveja save(Cerveja cerveja) {
        return cervejaRepository.save(cerveja);
    }

    /**
     * Retorna uma lista de todas as cervejas.
     *
     * @return uma lista de todas as cervejas
     */
    public List<Cerveja> findAll() {
        return cervejaRepository.findAll();
    }

    /**
     * Encontra uma cerveja pelo nome.
     *
     * @param nome o nome da cerveja
     * @return um Optional contendo a Cerveja encontrada, ou vazio se não for
     *         encontrada
     */
    public Optional<Cerveja> findByName(String nome) {
        return cervejaRepository.findByNome(nome);
    }

    /**
     * Deleta uma cerveja pelo seu ID.
     *
     * @param id o ID da cerveja a ser deletada
     */
    public void deleteById(Long id) {
        cervejaRepository.deleteById(id);
    }
}
