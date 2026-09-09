# Guessing Game

Um jogo simples de adivinhação desenvolvido em **Java**, no qual o jogador deve tentar descobrir um número aleatório entre **1 e 100**.

A cada tentativa, o programa informa se o número escolhido pelo jogador é **maior** ou **menor** que o número correto.

## Tecnologias utilizadas

* **Java JDK 25**
* **javac** — compilador Java
* **java** — executor da aplicação

## Estrutura do projeto

```text
game/
└── src/
    └── application/
        └── Program.java
```

## Como utilizar

### Compilando pelo terminal

Primeiro, entre no diretório `src`:

```bash
cd game/src
```

Depois, compile a classe `Program` utilizando o `javac`:

```bash
javac application/Program.java
```

Após a compilação, será criado o arquivo `Program.class` dentro do diretório `application`.

### Executando pelo terminal

Ainda dentro do diretório `src`, execute o programa utilizando:

```bash
java application.Program
```

O jogo será iniciado diretamente no terminal.

### Executando em uma IDE

Caso o projeto seja aberto em uma IDE, como **IntelliJ IDEA**, **Eclipse** ou **VS Code**, basta abrir a classe:

```text
src/application/Program.java
```

e executar o método:

```java
public static void main(String[] args)
```

Na maioria das IDEs, isso pode ser feito através do botão **Run** localizado próximo ao método `main`.

## Como jogar

Ao iniciar o programa, será exibida a opção:

```text
===== Guessing game =====
Play? [s/n]
```

Digite `s` para iniciar uma rodada.

Em seguida, informe um número entre **1 e 100**. O programa dará uma dica informando se o número escolhido é maior ou menor que o número correto.

Exemplo:

```text
===== Guessing game =====
Play? [s/n]
s

type a number from 1 to 100
50

your number is lower than correct number

type a number from 1 to 100
75

your number is higher than correct number

type a number from 1 to 100
63

Correct!
```

## Objetivo do projeto

Este projeto foi desenvolvido como prática dos fundamentos da linguagem Java, utilizando:

* `Random` para geração de números aleatórios;
* `Scanner` para entrada de dados pelo terminal;
* estruturas de repetição (`while`);
* estruturas condicionais (`if`, `else if`, `else`);
* variáveis e tipos primitivos;
* método `main` para execução da aplicação.

## Autor

Projeto desenvolvido como prática de programação em Java.
