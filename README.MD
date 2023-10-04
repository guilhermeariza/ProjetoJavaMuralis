# Descrição Geral

Esta aplicação foi desenvolvida para cumprir o desafio de Java com Spring proposto pela empresa Muralis Tecnologia. É um projeto Spring Boot que permite realizar operações de cadastro, consulta, exclusão, listagem e atualização de Clientes com seu respectivo Endereço e Contato.

## Estrutura do Projeto

A estrutura de pastas do projeto está organizada da seguinte forma:

- **config:** Esta camada contém configurações, principalmente para o uso da classe RestTemplate do Java.
- **controller:** Nesta camada, são definidos os endpoints da API e suas funcionalidades.
- **model:** Aqui, são definidos os modelos de dados para a interação com o banco de dados.
- **repository:** Esta camada é responsável por manipular os dados no banco de dados.
- **viaCep:** É uma camada que separa o serviço externo da API do viaCep e a configura de forma adequada para uso no projeto.

**Observações:** Todos os endpoints estão documentados no código das controllers.

## Endpoints Endereco:

### GET /endereco/listaTodos

- **Descrição:** Retorna uma lista de todos os endereços.

### GET /endereco/{id}

- **Descrição:** Retorna informações de um endereço específico com base no ID.

### POST /endereco/cadastrar

- **Descrição:** Cadastra um novo endereço com base nos dados fornecidos no corpo da solicitação, que é enviada para a API viaCep e retorna os dados necessários.
- **Corpo da Solicitação:** Um objeto JSON contendo os dados do endereço a ser cadastrado.

### PUT /endereco/atualizar

- **Descrição:** Atualiza informações de um endereço existente com base nos dados fornecidos no corpo da solicitação.
- **Corpo da Solicitação:** Um objeto JSON contendo os dados atualizados do endereço.

### DELETE /endereco/{id}

- **Descrição:** Deleta um endereço existente com base no ID.
- **Parâmetros de Consulta:** Nenhum.

## Endpoint Contato:

### GET /contato/listaTodos

- **Descrição:** Retorna uma lista de todos os contatos.

### GET /contato/{id}

- **Descrição:** Retorna informações de um contato específico com base no ID.

### POST /contato/cadastrar

- **Descrição:** Cadastra um novo contato com base nos dados fornecidos no corpo da solicitação.
- **Corpo da Solicitação:** Um objeto JSON contendo os dados do contato a ser cadastrado.

### PUT /contato/atualizar

- **Descrição:** Atualiza informações de um contato existente com base nos dados fornecidos no corpo da solicitação.
- **Corpo da Solicitação:** Um objeto JSON contendo os dados atualizados do contato.

### DELETE /contato/{id}

- **Descrição:** Deleta um contato existente com base no ID.

## Endpoint Cliente:

### GET /cliente/listaTodos

- **Descrição:** Retorna uma lista de todos os clientes.

### GET /cliente/{id}

- **Descrição:** Retorna informações de um cliente específico com base no ID.

### POST /cliente/cadastrar

- **Descrição:** Cadastra um novo cliente com base nos dados fornecidos no corpo da solicitação.
- **Corpo da Solicitação:** Um objeto JSON contendo os dados do cliente a ser cadastrado.

### PUT /cliente/atualizar

- **Descrição:** Atualiza informações de um cliente existente com base nos dados fornecidos no corpo da solicitação.
- **Corpo da Solicitação:** Um objeto JSON contendo os dados atualizados do cliente.

### DELETE /cliente/{id}

- **Descrição:** Deleta um cliente existente com base no ID.

