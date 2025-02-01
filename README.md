Cronograma de Atividades
Etapa 1: Planejamento e Modelagem (6 horas)
Definição do escopo do projeto

Modelagem do banco de dados (ER diagram)

Configuração inicial do projeto Spring Boot

Etapa 2: Implementação dos Endpoints de Cadastro (10 horas)
Cadastro de Patos

Cadastro de Clientes

Cadastro de Vendedores

Etapa 3: Implementação do Registro de Vendas (8 horas)
Registro de vendas de patos

Aplicação de descontos

Validação de vendas

Etapa 4: Listagem e Relatórios (6 horas)
Listagem de patos vendidos

Geração de relatórios em Excel (usando Apache POI)

Etapa 5: Ranking de Vendedores (4 horas)
Implementação do ranking de vendedores

Filtros por período e status de venda

Etapa 6: Testes e Deploy (6 horas)
Testes unitários

Configuração do Docker

Deploy e documentação no README

Total: 40 horas

MODELAGEM DO BANCO:

Clientes (id, nome, elegivel_desconto)
Patos (id, nome, mae_id, vendido, cliente_id, vendedor_id, data_venda)
Vendedores (id, cpf, nome, matricula)
Vendas (id, cliente_id, vendedor_id, data_venda, valor_total)
PatosVendidos (id, pato_id, venda_id, valor)

RELAÇÃO ENTRE AS TABELAS:

Relações entre as Tabelas
Clientes:

Cada cliente pode ter várias vendas associadas a ele.

Patos:

Cada pato pode ter uma mãe, que também é um pato.

Cada pato pode ser vendido a um cliente.

Cada pato pode ser vendido por um vendedor.

Vendedores:

Cada vendedor pode realizar várias vendas.

Vendas:

Cada venda está associada a um cliente e a um vendedor.

PatosVendidos:

Esta tabela faz a relação entre os patos vendidos e as vendas realizadas, armazenando o valor de cada pato vendido.

Resumo da Modelagem
Clientes:

Armazena informações sobre os clientes, incluindo se são elegíveis para desconto.

Patos:

Armazena informações sobre os patos, incluindo a referência à mãe, estado de venda, cliente e vendedor.

Vendedores:

Armazena informações sobre os vendedores, garantindo unicidade de CPF e matrícula.

Vendas:

Armazena informações sobre as vendas realizadas, incluindo cliente, vendedor, data da venda e valor total.

PatosVendidos:

Armazena a relação entre patos e vendas, incluindo o valor de cada pato vendido.

TECNOLOGIAS UTILIZADAS

# Granja de Patos API

## Descrição
Esta API RESTful foi desenvolvida usando Java e Spring Boot para gerenciar uma granja de patos. O sistema permite o cadastro de patos, clientes, vendedores, registro de vendas, listagem de patos vendidos, geração de relatórios e ranking de vendedores.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para criar a API REST.
- **Spring Data JPA**: Para persistência de dados usando JPA/Hibernate.
- **PostgreSQL**: Base de dados para armazenar informações.
- **Lombok**: Biblioteca para reduzir a verbosidade do código Java.
- **Docker**: Para containerização da aplicação 

## Configuração do Ambiente

### Pré-requisitos
Certifique-se de ter os seguintes softwares instalados:
- Java JDK 11 ou superior
- Maven
- PostgreSQL
- Docker (opcional)
- Git
