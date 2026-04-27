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