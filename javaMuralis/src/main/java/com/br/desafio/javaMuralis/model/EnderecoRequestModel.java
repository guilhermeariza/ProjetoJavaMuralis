package com.br.desafio.javaMuralis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EnderecoRequestModel {

    private String cep;
    private String numero;
    private String complemento;

}
