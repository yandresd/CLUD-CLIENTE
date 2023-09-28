package com.training.cludcliente.business;

import java.util.List;

import com.training.cludcliente.persistences.documents.ClienteDocument;

public interface ClienteServices {
    
    List<ClienteDocument> findAll();

    void save(ClienteDocument cliente);

    ClienteDocument findOne(String id);

    void delete(String id);
}
