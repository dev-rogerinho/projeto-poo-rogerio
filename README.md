# 🎬 Sistema de Cinema — POO em Java

> Projeto desenvolvido para a disciplina de Programação Orientada a Objetos utilizando Java.

O sistema simula o funcionamento básico de um cinema, permitindo:

- Gerenciamento de filmes
- Criação de sessões
- Compra de bilhetes
- Reserva de cadeiras
- Aplicação de descontos
- Críticas e avaliações de filmes
- Tratamento de exceções
- Organização utilizando o padrão MVC

---

## 👥 Integrantes do Grupo

| Nome | Usuário GitHub |
|------|----------------|
| Jose Bezerra | [josesandesneto-cyber](https://github.com/josesandesneto-cyber) |
| João Felipe | [JoaoFelipe005](https://github.com/JoaoFelipe005) |
| Luiz Rogério | [dev-rogerinho](https://github.com/dev-rogerinho) |

---

## 📚 Conceitos de POO Utilizados

- Encapsulamento
- Herança
- Polimorfismo
- Abstração
- Interfaces
- Sobrescrita de métodos
- Tratamento de exceções
- Enumerações (enum)
- Padrão de Projeto MVC

---

## 🎟️ Funcionalidades do Sistema

### 👤 Usuários

- Usuário comum
- Estudante com meia entrada
- Crítico com sistema de notas e críticas

### 🎥 Filmes

- Nome, duração e sinopse
- Nota média
- Vetor de críticas
- Controle de filmes em cartaz

### 🪑 Sessões

- Número da sala
- Tipo da sala
- Horário
- Reserva de cadeiras utilizando matriz booleana

### 🛒 Compra

- Compra de múltiplos bilhetes
- Adição de produtos
- Aplicação de cupons promocionais
- Cálculo automático do total

---

## ⚠️ Tratamento de Exceções

O sistema trata:

- Compra de filme fora de cartaz
- Sessão já encerrada
- Tentativa de reservar cadeira ocupada

---

## 🏗️ Estrutura do Projeto

### 📌 Model
Classes responsáveis pelas regras e dados do sistema:
`Usuario` · `Estudante` · `Critico` · `Filme` · `Sessao` · `Compra` · `Bilhete`

### 📌 Controller
Classe responsável pela lógica do sistema:
`CinemaController`

### 📌 View
Classe responsável pela execução e exibição:
`Main`

---

## ▶️ Como Executar o Projeto

**1. Clone o repositório**
```bash
git clone https://github.com/dev-rogerinho/projeto-poo-rogerio.git
```

**2. Acesse a pasta do projeto**
```bash
cd sistema-cinema-poo
```

**3. Compile os arquivos**
```bash
javac *.java
```

**4. Execute o programa**
```bash
java Main
```