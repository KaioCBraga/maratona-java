# *Maratona-Java*

## 01 - COMPILADOR JAVA

O processo de compilação do Java envolve os seguintes passos: <br>

- O programador escreve o código-fonte em um editor de código
- O compilador Java lê o código-fonte
- O compilador Java analisa o código-fonte
- O compilador Java traduz o código-fonte para bytecode
- O bytecode é processado pela Java Virtual Machine (JVM)

![img_1.png](img_1.png)

## 02 - TIPOS PRIMITIVOS

Os tipos primitivos em Java são os tipos de dados básicos que representam valores numéricos, caracteres e booleanos. São
chamados de primitivos porque são valores simples que não são objetos e ocupam um espaço fixo na memória.

Os tipos primitivos em Java são: <br>

- byte
- short
- int
- long
- boolean
- char
- float
- double.

## 03 - OPERADORES

Os operadores em Java são símbolos que instruem o compilador a realizar operações em variáveis e valores. Eles são
usados para manipular dados e variáveis em expressões.

Existem vários tipos de operadores em Java, como aritméticos, lógicos e relacionais.

Operadores aritméticos :

- Operador de adição (+)
- Operador de subtração (-)
- Operador de multiplicação (*)
- Operador de divisão (/)
- Operador de módulo (%).

Operadores lógicos :

- Operador E lógico, que retorna verdadeiro se ambas as expressões forem verdadeiras(&&)
- Operador OU, que retorna verdadeiro se uma ou ambas as expressões forem verdadeiras(||)
- Operador de Negação inverte valores booleanos, ou seja, se um valor for verdadeiro, ele se transforma em falso, e
  vice-versa(!)

Operadores Relacionais
Igual a (==):

- Verifica se dois valores são iguais.

Diferente de (!=):

- Verifica se dois valores são diferentes.

Maior que (>):

- Verifica se o valor da esquerda é maior que o valor da direita.

Menor que (<):

- Verifica se o valor da esquerda é menor que o valor da direita.

Maior ou igual a (>=):

- Verifica se o valor da esquerda é maior ou igual ao valor da direita.

Menor ou igual a (<=):

- Verifica se o valor da esquerda é menor ou igual ao valor da direita.

## 04 - ESTRUTURAS CONDICIONAIS

1. *if* : Executa um bloco de código se uma condição for verdadeira
2. *if-else* : Executa um bloco de código se a condição for verdadeira e outro bloco se for falsa.
3. *else-if* : Permite testar múltiplas condições em sequência.
4. Operador Ternário *(? :)* : Uma forma compacta de escrever uma condição if-else.
5. switch-case: Usado para comparar uma variável com múltiplos valores possíveis.

Observações:

- Use if para condições simples.
- Use switch para múltiplas comparações de valores.
- O operador ternário é útil para atribuições condicionais simples.

## 05 - ESTRUTURAS DE REPETIÇÕES

1. FOR

- Usado quando o número de repetição é

2. WHILE

- Repete um bloco de código enquanto uma condição for verdadeira.

3. DO-WHILE

- Similar ao while, mas o bloco de código é executado pelo menos uma vez, mesmo que a condição seja falsa.

## 06 - ARRAYS

Arrays são estruturas de dados que permitem armazenar uma coleção de elementos do mesmo tipo

1. Arrays Unidimensionais

    - Um array unidimensional é uma lista de elementos do mesmo tipo, onde cada elemento pode ser acessado por um índice
      numérico.
    - Um array pode ser declarado e inicializado com um tamanho fixo ou com valores pré-definidos.
    - Os elementos de um array são acessados por meio de índices, que começam em 0. É possível modificar os valores dos
      elementos após a criação do array.
    - Para percorrer todos os elementos de um array, é comum usar estruturas de repetição como for ou for-each.

2. Arrays Multidimensionais

    - Arrays multidimensionais são arrays de arrays. O tipo mais comum é o array bidimensional, que pode ser
      visualizado como uma matriz (linhas e colunas).
    - Um array multidimensional pode ser declarado e inicializado com tamanhos fixos ou com
      valores pré-definidos.
    - Cada elemento de um array multidimensional é acessado por meio de dois ou mais índices, dependendo
      da quantidade de dimensões.
    - Para percorrer arrays multidimensionais, são usados loops aninhados, um para cada dimensão do array.

3. Observações
    - Arrays têm tamanho fixo após a inicialização, ou seja, não é possível aumentar ou diminuir o tamanho de um
      array após sua criação.
    - A propriedade length é usada para obter o tamanho de um array.
    - Arrays multidimensionais podem ter dimensões variadas, o que significa que cada "linha" pode ter um número
      diferente
      de "colunas".

## 06 - MÉTODOS

1. O que são Métodos?

- Métodos em Java são blocos de código que realizam uma tarefa específica. Eles são usados para organizar o código,
  evitar repetição e facilitar a manutenção. Um método pode receber parâmetros, executar uma lógica e retornar um valor.

2. Estrutura de um Método:

- modificador: Define a visibilidade do método (public, private, protected).

- tipoDeRetorno: O tipo de dado que o método retorna (int, double, String, void, etc.).

- nomeDoMetodo: O nome do método, que deve seguir as convenções de nomenclatura (camelCase).

- parâmetros: Dados que o método recebe para processar (opcional).

- return: Retorna um valor ao chamador (obrigatório, exceto para métodos void).

3. Conclusão

- Métodos são fundamentais para organizar e reutilizar código em Java. Ao seguir boas práticas, você pode escrever
  métodos claros, eficientes e fáceis de manter. Use-os para dividir tarefas complexas em partes menores e documente
  sempre que possível.


