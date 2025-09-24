# API Finance Control #

 **Status**: 🔴 Em pausa 

##  Funcionalidades
- Cadastro de usuários.
- Registro de lançamentos financeiros (receitas e despesas).
- Classificação dos lançamentos por tipo e categoria.
- Consulta e agrupamento de lançamentos por data.
- Persistência dos dados no banco PostgreSQL.
- Estrutura preparada para facilitar integrações futuras.

##  Tecnologias
- Java 17
- Spring Boot
- JPA / Hibernate
- PostgreSQL
- Lombok

## Como usar
```bash
# Clone o repositório
git clone https://github.com/iochem/finance-control.git

# Configure o banco de dados PostgreSQL e ajuste as propriedades no arquivo application.properties

# Rode a aplicação
./mvnw spring-boot:run

# Acesse a API pelo endpoint configurado (ex: http://localhost:8080)
