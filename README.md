# Desafio Controle de Fluxo

## Descrição

Este projeto é uma aplicação simples em Java desenvolvida para praticar o uso de controle de fluxo e exceções personalizadas. O sistema recebe dois números inteiros como parâmetros via terminal e realiza a contagem de números incrementais, imprimindo os números na tela.

Caso o primeiro número seja maior que o segundo, o sistema lança uma exceção personalizada chamada `ParametrosInvalidosException`, com a mensagem: "O segundo parâmetro deve ser maior que o primeiro".

## Funcionalidades

- Receber dois parâmetros via terminal.
- Verificar se o primeiro parâmetro é maior que o segundo.
- Caso o primeiro parâmetro seja maior, lançar uma exceção personalizada (`ParametrosInvalidosException`).
- Caso os parâmetros sejam válidos, realizar a contagem de números incrementais a partir de 1 até a diferença entre os dois números.

## Exemplo de Execução

### Entrada

Primeiro parâmetro: 12

Segundo parâmetro: 30

### Saída

Imprimindo o número 1 

Imprimindo o número 2 

Imprimindo o número 3 

Imprimindo o número 4 

Imprimindo o número 5 

... 

Imprimindo o número 18

### Exemplo de erro
Primeiro parâmetro: 30 

Segundo parâmetro: 12

### Saída

O segundo parâmetro deve ser maior que o primeiro


## Estrutura do Projeto

O projeto contém as seguintes classes:

- **Contador.java**: A classe principal do programa, onde ocorre a entrada de dados e a lógica de contagem.
- **ParametrosInvalidosException.java**: A classe que define a exceção personalizada para o caso em que o segundo parâmetro é menor que o primeiro.

## Como Rodar o Projeto

### Pré-requisitos

- Ter o Java JDK instalado (Java 8 ou superior).
- Um IDE para desenvolvimento, como Eclipse ou IntelliJ IDEA, ou então rodar via terminal.

### Execução via Terminal

1. Compile o projeto:

    ```bash
    javac Contador.java ParametrosInvalidosException.java
    ```

2. Execute o projeto:

    ```bash
    java Contador
    ```

3. Insira os parâmetros quando solicitado no terminal.

## Exceções

O projeto contém uma exceção personalizada `ParametrosInvalidosException`, que é lançada quando o primeiro parâmetro fornecido é maior que o segundo. Isso garante que a contagem só seja realizada quando o segundo parâmetro for maior.

## Melhorias Futuras

- Implementar uma interface gráfica para o programa.
- Expandir a funcionalidade para aceitar intervalos maiores e outros tipos de operações.

## Autor

Este projeto foi desenvolvido por **Arthur Reis** como parte de um exercício de controle de fluxo e exceções em Java.

