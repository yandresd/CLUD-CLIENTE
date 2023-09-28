package com.training.cludcliente.persistences.repositories;

import org.springframework.data.repository.CrudRepository;

import com.training.cludcliente.persistences.documents.ClienteDocument;

public interface ClienteRepository extends CrudRepository<ClienteDocument,String> {
    
}
