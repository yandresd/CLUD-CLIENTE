package com.training.cludcliente.business.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.cludcliente.business.ClienteServices;
import com.training.cludcliente.persistences.documents.ClienteDocument;
import com.training.cludcliente.persistences.repositories.ClienteRepository;

@Service
public class ClienteServicesImpl implements ClienteServices {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteDocument> findAll() {
        return (List<ClienteDocument>)clienteRepository.findAll();
    }

    @Override
    public void save(ClienteDocument cliente) {
        clienteRepository.save(cliente);
    }
    
    @Override
    public ClienteDocument findOne(String id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(String id) {
        clienteRepository.deleteById(id);
    }

}
