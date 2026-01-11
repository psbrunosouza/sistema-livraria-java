# 📚 Sistema CLI de Livraria (Java Puro)

Este projeto consiste em um **sistema simples de livraria em modo CLI (console)**, desenvolvido em **Java puro**, sem uso de Maven, Gradle ou qualquer framework externo.  
O foco é **praticar os fundamentos da linguagem Java**, como orientação a objetos, listas, datas e interação com o usuário via terminal.

---

## 🎯 Objetivo do Projeto

Desenvolver um sistema de console para **gerenciar o empréstimo de livros de uma biblioteca**, permitindo que o usuário:

- Visualize os livros disponíveis
- Escolha um livro pelo `id`
- Informe seu nome
- Registre o empréstimo do livro

---

## 🧠 Conceitos Praticados

- Classes e objetos
- Encapsulamento
- Listas (`List`)
- Datas (`LocalDate`)
- Estruturas de controle (`if`, `while`, `switch`)
- Entrada de dados via console (`Scanner` ou `BufferedReader`)
- Organização básica de um projeto Java

---

## ⚙️ Como o Sistema Funciona

### 1️⃣ Início
O programa inicia em loop perguntando ao usuário se ele deseja **ver a lista de livros disponíveis**.

---

### 2️⃣ Listagem de Livros
- Se a resposta for **"SIM"**, o sistema exibe no console:
  - Apenas os livros que **não estão emprestados**
  - Informações como `id`, título e autor

---

### 3️⃣ Empréstimo de Livro
Após a listagem:
- O usuário escolhe um livro pelo **id**
- Informa seu **nome**
- O sistema:
  - Registra o empréstimo
  - Marca o livro como **indisponível**
  - Exibe uma **mensagem de sucesso**

---

### 4️⃣ Encerramento
- Se a resposta inicial for **"NÃO"**, ou
- Após a conclusão de um empréstimo  

O sistema exibe uma mensagem de despedida e finaliza a execução.

---

## 🗂️ Estrutura do Projeto

O projeto é dividido em classes simples para manter a organização e clareza.

---

### 📘 Classe `Livro`

Representa um livro da biblioteca.

**Atributos:**
- `id` → Identificador único do livro
- `titulo` → Título do livro
- `autor` → Autor do livro (`Autor`)
- `disponivel` → Indica se o livro está disponível para empréstimo
- `dataCadastro` → Data de cadastro do livro
- `dataAtualizacao` → Data da última atualização

---

### ✍️ Classe `Autor`

Representa o autor de um livro.

**Atributos:**
- `id` → Identificador único do autor
- `nome` → Nome do autor
- `dataNascimento` → Data de nascimento do autor

---

### 🔄 Classe `Emprestimo`

Representa um empréstimo de livro.

**Atributos:**
- `id` → Identificador único do empréstimo
- `livro` → Livro emprestado (`Livro`)
- `nomeCliente` → Nome do cliente
- `dataEmprestimo` → Data do empréstimo
- `dataDevolucao` → Data da devolução  
  _(pode ser `null` caso ainda não tenha sido devolvido)_

---

### 🏛️ Classe `Biblioteca`

Classe central que gerencia os dados do sistema.

**Atributos:**
- `livros` → Lista de livros cadastrados
- `autores` → Lista de autores cadastrados
- `emprestimos` → Lista de empréstimos realizados

---

## ▶️ Como Executar

1. Certifique-se de ter o **Java JDK** instalado
   Você pode verificar com:
   ```bash
   java -version
2. Compile os arquivos:
   javac -d out src/**/*.java
3. Execute com:
   java -cp out App
