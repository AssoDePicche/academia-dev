# Plataforma de Cursos Online - AcademiaDev

Este repositório contém o protótipo da plataforma **AcademiaDev**, uma startup de tecnologia educacional focada em cursos de desenvolvimento de software. O protótipo foi desenvolvido para validar a proposta de negócios da plataforma, com foco na implementação da lógica de negócios principal.

## Descrição do Desafio

A plataforma **AcademiaDev** oferece um modelo de assinatura com um catálogo de cursos focados no desenvolvimento de software. O protótipo foi implementado para validar a lógica de negócios da plataforma, sem a necessidade de um CRUD completo, e com um conjunto de dados pré-cadastrado.

O sistema é construído para ser uma aplicação de linha de comando (CLI) com funcionalidades de gerenciamento de cursos, usuários, matrículas, suporte e geração de relatórios.

## Funcionalidades

### 1. **Gerenciamento de Cursos**
   - Cadastrar e gerenciar cursos.
   - Cada curso possui: título, descrição, instrutor, carga horária, nível de dificuldade, status.
   - Cursos com status **INACTIVE** não podem receber novas matrículas.

### 2. **Usuários e Planos de Assinatura**
   - **Admin:** Gerencia o catálogo de cursos e usuários.
   - **Student:** Possui um plano de assinatura e pode se matricular em cursos.
   - Planos disponíveis:
     - **BasicPlan:** Máximo de 3 cursos ativos simultaneamente.
     - **PremiumPlan:** Número ilimitado de cursos.

### 3. **Matrículas e Progresso**
   - Alunos podem se matricular em cursos ativos, desde que o plano de assinatura permita.
   - Progresso de 0% a 100% para cada curso.

### 4. **Suporte ao Usuário**
   - Usuários podem abrir **Support Tickets**, que são processados em ordem FIFO (Primeiro a Chegar, Primeiro a Ser Atendido).

### 5. **Relatórios e Análises**
   - Relatórios que incluem:
     - Lista de cursos por nível de dificuldade.
     - Relação de instrutores únicos de cursos ativos.
     - Agrupamento de alunos por plano de assinatura.
     - Média de progresso dos alunos.
     - Aluno com maior número de matrículas ativas.
   - Exportação de dados para CSV, permitindo ao administrador escolher as colunas dinamicamente.

## Requisitos Técnicos

- **Persistência em Memória:** Utilização de `Map`, `Set`, `Queue` (como `LinkedList` ou `ArrayDeque`) para simular a persistência de dados.
- **Java 8+:** Utilização da Stream API e expressões lambda para os relatórios e análises.
- **Reflection e Anotações:** Geração de arquivos CSV utilizando reflection para processar qualquer tipo de objeto e criar a string no formato desejado.
- **Exceções Customizadas:** Manipulação de erros com exceções personalizadas, como no caso de tentativa de matrícula inválida.

## Funcionalidades da Linha de Comando

A plataforma oferece um menu de opções para os seguintes casos de uso:

### **Operações de Administrador (Admin)**
- Ativar/desativar cursos.
- Alterar plano de assinatura de um aluno.
- Processar tickets de suporte.
- Gerar relatórios e análises.
- Exportar dados para CSV.

### **Operações de Aluno (Student)**
- Matricular-se em cursos.
- Consultar matrículas e progresso.
- Atualizar progresso.
- Cancelar matrículas.

### **Operações Gerais (Qualquer Usuário)**
- Consultar catálogo de cursos.
- Abrir tickets de suporte.
- Autenticação simples por email (sem senha).
