# ☕ Meus Aprendizados em Java

Repositório criado para armazenar e organizar os meus exercícios e desafios práticos desenvolvidos durante meus primeiros passos na linguagem Java.

## 📓 Projetos no Repositório

Aqui estão os códigos desenvolvidos até o momento:

1. **Atividades de varíaveis** (`academy.devdojo.variaveis.java`)
- **Atividade 01:** Calcula e exibe a diferença exata entre duas idades definidas diretamente no código. **Conceitos:** `int`, `-`.
- **Atividade 02:** Define um salário fixo e uma porcentagem para calcular o valor correspondente do imposto sobre aquele montante. **Conceitos:** `float`.
- **Atividade 03:** Calcula diferentes faixas de porcentagem (30%, 15% e 5%) sobre um mesmo salário base. **Conceitos:** `double`, mutabilidade de variáveis (a variável `resultado` é mutável).
- **Atividade 05:** Recebe os dados digitados no console e os armazena em variáveis tipo `String` e `int`. **Conceitos:** `Scanner`, `String`, `int`, `next()`, `nextInt()`.


2. **Atividades if/else** (`academy.devdojo.estruturascondicionais.ifselse`)
- **Aula 01:** Introdução a condicionais `if`e `else`.
- **Atividade 01:** Verifica se é maior ou menor de idade, exibindo uma mensagem no console. **Conceitos:** `int`,`if` e `else`, `>=`.
- **Atividade 02:** Calcula o valor correspondente dos impostos sobre um monte < ou > que 4500. **Conceitos:** `if` e `else`, `float`.
- **Atividade 03:** Calcula e define se o resultado é par ou ímpar calculando a partir do resto. **Conceitos:** `if` e `else`, `int`, `%`.
- **Atividade 04:** Calcula a porcentagem e o valor do imposto de renda com base no salário digitado. **Conceitos:** `double`, `else if`.
- **Atividade 05:** Classifica qual o tipo de torneio do participante de acordo com a idade digitada diretamente no código. **Conceitos:** `int` e `String`, `else if`, `if` e `else`,`&&`.
- **Atividade 06:** Recebe o nome e a idade do participante pelo teclado e classifica automaticamente a categoria do torneio. **Conceitos:** `int` e `String`, `else if`, `if` e `else`, `&&`, `next()` e `nextInt()`.
- **Atividade 07:** Recebe o nome do usuário pelo teclado e impede o cadastro de nomes reservados como `admin` ou `administrador`. **Conceitos:** `if` e `else`, `String`, `||`, `equalsIgnoreCase`
- **Atividade 08:** Verifica, de acordo com o sexo e a idade informados pelo teclado, se o alistamento militar é obrigatório, opcional ou não permitido. **Conceitos:** `Scanner`, `String`, `char` e `int`, `if`, `else if`, `&&` e `||`.
- **Atividade 09:** Define o dia da semana de acordo com o número digitado diretamente no código, os dias da semana estão numerados de 1 a 7. **Conceitos:** `if`, `else` e `else if`, `int`.

3. **Atividades Switch Case** (`academy.devdojo.lacosderepeticao.switchcase.java`)
- **Aula01:** exibe o dia da semana correspondente ao número definido no código. Caso o valor informado não corresponda a um dia válido, exibe a mensagem "Dia inválido". **Conceitos:** `switch`, `case`, `break`, `default`, `int`.
- **Aula02:** verifica o tipo de conta bancária definido no código e exibe a porcentagem de rendimento correspondente. Caso o tipo de conta não exista, exibe a mensagem "CONTA INEXISTENTE". **Conceitos:** `switch`, `case`, `break`, `default`, `String`.

4. **Atividades Whiles** (`academy.devdojo.lacosderepeticao.whiles.java`)
- **Aula01:** exibe uma contagem de números ímpares de 1 a 9, somando 2 a cada repetição. **Conceitos:** `while`, `ìnt`
- **Aula02:** recebe um valor digitado pelo teclado e percorre os números de 0 até o valor digitado, aumentando o contador de 1 em 1, exibindo apenas os números ímpares. **Conceitos:** `Scanner`, `int`, `if`, `while`, `%`, `!=`,`i`.
- **Aula03:** exibe um menu de opções que vai continuar sendo mostrado enquanto a opção for diferente de 3. Ao digitar 3 o programa é encerrado. **Conceitos:** `int`, `Scanner`, `while`
- **Aula04:** o sistema pede ao usuário o nome de usuário e senha. Se estiveram corretos o acesso é liberado, caso contrário, é negado. **Conceitos:** `Scanner`, `final`, `boolean`, `String`, `while`, `if`, `.equals`, `&&`.
- **Aula05 `Do-While`:** Um jogo onde os PLAYERS digitam números iguais para imprima `true`, números diferentes imprime `false`

5. **Atividades For** (`academy.devdojo.lacosderepeticao.fors`)
- **Aula 01:** Introdução ao laço de repetição `for`, um contador simples de 1 até 10.
- **Aula 02, exercício 01:** Imprime os quadrados dos números inteiros na faixa entre 0 a 40000.
           **exercício 02:** Exibe no console uma sequência de números de 5 até 50, contando de 5 em 5.
- **Aula 03:** Gera a tabuada de 1 até 10 já com os resultados, com **`for` aninhado**.
  **Conceitos Aplicados:** laço de repetição `for`.


## ♟ Projetos 'Oficiais'

0.1 - **Desconto Promocional** (`DescontoPromocional.java`)
- Desconta 10% do valor original em compras a partir de R$200,00. Se o valor for 0, o caixa fecha. **Conceitos:** `int`, `float`, `Scanner`, `while`, `!=`, `if`, `else`, **`if` aninhado**. 

0.2 - **Contagem Regressiva do Foguete** (`ContagemRegressivaDoFoguete.java`)
- Inicia uma contagem regressiva para o lançamento do foguete, chegando a '5' imprime 'metade do caminho'. **Conceitos:** `int`, `i`, `while`, `if`, `else` e `else if`.


## 🛠️ Tecnologias Utilizadas

- **Java JDK 17**
- **IDE:** IntelliJ IDEA

## 📦 Como Executar os Códigos

Para rodar qualquer um dos projetos localmente, você precisará do Java instalado na sua máquina.

1. Clone o repositório:
   ```bash
   https://github.com](https://github.com/carollyssanty-web/ProjetosJava.git)
   ```
2. Abra a pasta `src` na sua IDE de preferência.
3. Execute o arquivo contendo o método `public static void main`.
