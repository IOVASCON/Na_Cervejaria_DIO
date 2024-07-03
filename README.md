# Na Cervejaria

Projeto de uma API REST para o gerenciamento de estoques de cerveja usando Spring Boot.

## Funcionalidades

- Criação de Cervejas
- Listagem de Cervejas
- Consulta por Nome
- Exclusão de Cervejas

## Tecnologias

- Java 11
- Spring Boot
- JUnit
- Mockito
- H2 Database

## Estrutura do Projeto

- `CervejariaApplication.java`: Classe principal que inicializa a aplicação Spring Boot.
- `Cerveja.java`: Classe modelo que representa a entidade Cerveja.
- `CervejaRepository.java`: Interface de repositório que estende JpaRepository para operações CRUD.
- `CervejaService.java`: Classe de serviço que contém a lógica de negócio para a entidade Cerveja.
- `CervejaController.java`: Controlador REST que expõe endpoints para manipulação de Cervejas.
- `application.properties`: Arquivo de configuração da aplicação.

## Dependências

### Maven Dependencies

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
            <version>${spring.boot.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>${spring.boot.version}</version>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
            <version>2.1.214</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <version>${spring.boot.version}</version>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <scope>test</scope>
            <version>${mockito.version}</version>
        </dependency>
        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>2.3.1</version>
        </dependency>
    </dependencies>

### Configuração

application.properties

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

## Como executar o projeto

1. Clone o repositório
2. Navegue até o diretório do projeto
3. Execute `mvn spring-boot:run`

### Endpoints Disponíveis

    POST /api/cervejas
        Descrição: Adiciona uma nova cerveja.
        Request Body: {"nome": "IPA", "tipo": "Ale", "teorAlcoolico": 5.5, "volume": 500, "quantidadeEstoque": 100}
        Response: 201 Created

    GET /api/cervejas
        Descrição: Lista todas as cervejas.
        Response: 200 OK

    GET /api/cervejas/{nome}
        Descrição: Busca uma cerveja pelo nome.
        Response: 200 OK ou 404 Not Found

    DELETE /api/cervejas/{id}
        Descrição: Deleta uma cerveja pelo ID.
        Response: 204 No Content

### Testes

Os testes unitários estão configurados utilizando JUnit e Mockito.

## Como executar os testes

1. Navegue até o diretório do projeto
2. Execute `mvn test`
