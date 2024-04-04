Sistema de Gerenciamento de Veículos

Este projeto é um sistema de gerenciamento de veículos desenvolvido em Java, utilizando o Spring Framework. Ele permite a administração eficiente de informações de veículos, como carros e motos, incluindo operações como listagem, criação, atualização e exclusão de registros.
Características

    Herança: Utilização de uma classe abstrata Veiculos como base para as classes concretas Carros e Motos, promovendo reutilização de código e facilitando a manutenção.
    Polimorfismo: Implementação de interfaces, como VeiculosService<T extends Veiculos>, permitindo tratamento uniforme de diferentes tipos de veículos.
    Encapsulamento: Atributos definidos como privados em classes, com acesso controlado por meio de métodos públicos (getters e setters), garantindo a segurança dos dados.
    CRUD Completo: Funcionalidades completas de CRUD (Criar, Ler, Atualizar, Deletar) para carros e motos através de uma API REST.

Tecnologias Utilizadas

    Java: Linguagem de programação principal.
    Spring Framework: Framework principal para desenvolvimento da aplicação.
    Spring Boot: Para fácil configuração e publicação da aplicação.
    JPA / Hibernate: Para mapeamento objeto-relacional e interação com o banco de dados.
    H2 Database: Banco de dados em memória utilizado para testes e desenvolvimento.
    Swagger: Para documentação da API.

Instalação e Uso

Para rodar o projeto localmente, siga estes passos:

    Clone o repositório:

bash

git clone https://github.com/seuUsuario/seuRepositorio.git

    Entre no diretório do projeto:

bash

cd seuRepositorio

    Execute a aplicação utilizando o Maven:

arduino

./mvnw spring-boot:run

A aplicação estará acessível em http://localhost:8080.
Documentação da API

Para acessar a documentação da API e testar os endpoints, após iniciar a aplicação, visite:

bash

http://localhost:8080/swagger-ui.html

Contribuições

Contribuições são sempre bem-vindas! Por favor, leia o arquivo CONTRIBUTING.md para mais detalhes sobre nosso código de conduta, e o processo para enviar pedidos de pull.
Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE.md para detalhes
