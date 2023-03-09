package com.heitor.buscarendereco.service;

import com.heitor.buscarendereco.entity.Endereco;
import com.heitor.buscarendereco.feign.EnderecoCliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoCliente enderecoCliente;

    public Endereco buscarPorCep(String cep){
        return enderecoCliente.getEndereco(cep);
    }
}
