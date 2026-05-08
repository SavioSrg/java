### **1. O Desafio da Troca e Precedência**

**Descrição do problema:** Crie um programa que realize a troca de valores entre duas variáveis inteiras. Após a troca, o programa deve avaliar uma expressão matemática complexa para demonstrar o entendimento da ordem de operações.

- **Objetivo de aprendizado:** Compreender atribuição de variáveis, uso de variáveis temporárias.


- **Requisitos:**
    1. Trocar os valores de `a` e `b` usando uma variável `temp`.
    2. Realizar a troca novamente sem usar uma terceira variável (lógica aritmética).


- **Exemplo:** Entrada: `a = 5`, `b = 10`. Saída após troca: `a = 10`, `b = 5`.


### **2. Aritmética Primitiva e Extração de Objetos**
**Descrição do problema:** Desenvolva uma calculadora que receba dois números inteiros e exiba estatísticas básicas. Além disso, o programa deve converter um objeto complexo (`BigInteger`) em um tipo primitivo.

- **Objetivo de aprendizado:** Dominar tipos primitivos (`int`, `double`) e a extração de valores de classes invólucro ou objetos matemáticos.

- **Requisitos:**
    1. Calcular soma, produto e média (a média deve ser `double`).

- **Exemplo:** Entrada: `10, 5`. Saída: `Soma: 15, Produto: 50, Média: 7.5`.

## Construtores

### **3. Construtor Padrão (Default)**
Crie uma classe Cat com variáveis de instância name e age. Implemente um construtor padrão que inicialize o nome como "Unknown" e a idade como 0.


### **4. Sobrecarga de Parametrizado**
Crie uma classe Dog com name e color, implementando um construtor que receba e atribua esses valores no momento da criação.


### **5. Sobrecarga de Construtores**
Implemente a classe Book com title, author e price. Crie três construtores: um padrão, um que receba apenas título e autor, e outro que receba os três atributos.


### **6. Encadeamento de Construtores (Chaining)**
Crie uma classe Student e utilize a palavra-chave this() para fazer com que um construtor chame outro, inicializando studentId, studentName e grade.

### **7. Construtor de Cópia**
Na classe Rectangle, implemente um construtor que inicialize um novo objeto utilizando os valores de um objeto já existente.


### **8. Construtor com Validação**
Crie uma classe Account onde o construtor deve validar se o número da conta não é nulo/vazio e se o saldo inicial não é negativo, exibindo erro se falhar.


## **Encapsulamento**

### **9. Esconder Dados**
Crie uma classe Vehicle com um atributo speed privado.
Implemente métodos getSpeed() e setSpeed() com validação (não permitir valores negativos).
Crie um método speedUp() que aumenta a velocidade.
Em seguida, crie duas subclasses Car e Bicycle que sobrescrevem o método speedUp() com regras diferentes de aumento de velocidade.

### **10. Esconder Dados**
Criar uma classe base Shape com métodos draw() e calculateArea(). Implemente subclasses como Circle e Cylinder, 
onde o Cylinder deve encapsular a lógica de cálculo de sua área de superfície total ao sobrescrever o método da classe pai.

## Membros da Classe com o Modificador static

### **11. Monitor de Instâncias de Funcionários**
Crie uma classe Funcionario que monitore automaticamente quantos objetos foram criados em memória durante a execução do programa.

Declare uma variável private static int contagem que é incrementada no construtor da classe.

Crie um método public static int getQuantidadeFuncionarios() para retornar esse valor sem precisar instanciar a classe para chamá-lo.

## Associação

### **12. Associação Bilateral: Jogadores e Times**
Implemente uma relação bidirecional onde um Jogador pertence a um Time e um Time possui uma lista de Jogadores.

Objetivo: Praticar associação de objetos, manipulação de arrays e verificações de referência nula (null check).

Requisitos:
- Atributo Time na classe Jogador.
- Atributo Jogador[] na classe Time.
- Métodos de impressão que exibam os dados de ambas as classes vinculadas.

Exemplo: Ao imprimir um Time, o programa deve listar todos os Jogadores associados a ele.

### **13. Associação: Veículo e Placa**
Modele um sistema onde uma classe de registro (Associacao) vincula um Carro a uma Placa.

Objetivo: Praticar a navegação entre objetos onde a classe associativa detém a referência.

Requisitos:
- Classe Carro com nome e marca.
- Classe Associacao com atributo String placa e atributo do tipo Carro.
- Exibir a frase: "O veículo [Nome] possui a placa [Placa]".

Exemplo: A partir de um objeto Associacao, acessar o nome do Carro vinculado para exibir o relatório.

## Herança

### **14. Polimorfismo: Controle de Bonificações**
Implemente um sistema de folha de pagamento que processe diferentes regras de bônus através de uma referência única.

Objetivo: Compreender o Dynamic Binding, observando como a JVM identifica o método correto de uma subclasse em tempo de execução, mesmo quando referenciada pela classe mãe.

Requisitos:
- Classe Funcionario: Base com o método getBonificacao() (retorno de 10% do salário).
- Subclasses Gerente e Diretor: Devem sobrescrever getBonificacao() para retornar 15% e 20%, respectivamente.
- Classe ControleDeBonificacoes: Possuir o método registra(Funcionario f) que utiliza uma lista (ArrayList) para armazenar os funcionários e acumular o valor total das bonificações.

Exemplo: Ao fornecer um Gerente ao método registra, o sistema deve ignorar a regra padrão de 10% e aplicar a regra específica de 15%, garantindo o acoplamento reduzido.

### **15. Hierarquia de Contas Bancárias(Herança e Sobrescrita)**

Modele um sistema para um banco que possui diferentes tipos de contas. Todas as contas possuem um saldo, mas o método de "saque" e "atualização" varia conforme o tipo.

Requisitos:
 - Crie uma superclasse `Conta` com o atributo `protected double saldo`.
 - Implemente o método `sacar(double valor)` na classe mãe.
 - Crie a subclasse `ContaCorrente` que cobra uma taxa de R$ 0,10 para cada saque realizado (sobrescrita).
 -  Crie a subclasse `ContaPoupanca` e implemente um método de atualização que rende juros conforme uma taxa passada por parâmetro.