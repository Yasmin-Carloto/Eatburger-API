# Eatburger-API
API desenvolvida em Java com o objetivo de complementar a aplicação em Kotlin EATburger [(Link do repositório)](https://github.com/Yasmin-Carloto/Eatburger). 

## Funcionalidades da API
Essa API tem por objetivo, unicamente, forncer dados de um banco de dados PostgreSQL, atualmente hospedado no Google Cloud, e retornar pra quaisquer aplicações que se utilizem de sua requisição GET, um JSON de modelos FOOD. Atualmente essa API também está hospedada no Google Cloud sob o domínio: <http://35.208.255.221/food> para caso precisem usar em suas aplicações.

## Técnicas e tecnologias utilizadas
* Java Spring - para criação do servidor;
* Spring MVC - para criação do servidor;
* Spring Data JPA - para manipulação e persistência de dados;
* Lombok - para geração de boilerplates, e 
* Postgres Driver - para realizar a conexão com banco de dados Postgres.

## Rodar o projeto na sua máquina 
1. Clone o repositório
```
git clone https://github.com/Yasmin-Carloto/Eatburger-API.git
```

2. No IntelliJ, navegue até a pasta onde se encontra a API.

3. Instale as dependências do MAVEN.

4. Por fim, rode a API no arquivo `EATburgerApiApplication`.
