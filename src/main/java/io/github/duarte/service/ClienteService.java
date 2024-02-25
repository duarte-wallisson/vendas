package io.github.duarte.service;

import io.github.duarte.model.Cliente;
import io.github.duarte.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    //Não é necessário @Autowired, pois @Service já identifica que é uma dependência
    //@Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void salvar(Cliente cliente) {
        validarCliente(cliente);
        clienteRepository.salvar(cliente);
    }

    private void validarCliente(Cliente cliente) {

    }
}
