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

## Modificador final

### **16. Segurança de Algoritmos Críticos (Modificador final)**
Em sistemas de seguros e finanças, certas fórmulas e estruturas não podem ser modificadas para garantir a integridade dos dados e evitar comportamentos inesperados em subclasses.

Requisitos:
- Impedir Extensão: Verifique que a classe CalculadoraFiscal não permite subclasses.
- Impedir Sobrescrita: Tente declarar um método public double calcularTaxaFixa() dentro da classe Operacao e observe o erro: 'calcularTaxaFixa()' cannot override 'calcularTaxaFixa()' in 'Seguro'; overridden method is final.
- Composição vs Herança: Note que a CalculadoraFiscal processa objetos do tipo Operacao, mas não herda deles, mantendo as responsabilidades separadas.

## Casting

### **17. Sistema de Veículos com Casting (Casting de Dados e Sobrescrita)**

**Descrição do problema:** Modele uma frota onde veículos genéricos precisam ser identificados para ações específicas (como ligar o turbo em carros).

Requisitos:
- Crie a classe `Veiculo` com o método `liga()`.
- Crie a subclasse `Carro` com um método exclusivo `ativarArCondicionado()`.
- Crie uma lista de `Veiculo` e adicione objetos do tipo `Carro`.
- Ao percorrer a lista, utilize o operador `instanceof` para verificar se o veículo é um `Carro` e, se for, realize o **casting** para chamar o método exclusivo de ar condicionado.

**Conceitos:** Downcasting, `instanceof`, Vinculação dinâmica

## Enum

### **18. Sistema de Clientes e Formas de Pagamento (Enum com comportamento)**

**Descrição do problema:** Uma empresa possui diferentes tipos de clientes e formas de pagamento. Cada forma de pagamento aplica um desconto diferente, e os tipos de clientes possuem informações padronizadas, como código e descrição.

**Objetivo:** Aprender a utilizar `enum` com atributos e métodos, organizando regras de negócio diretamente dentro dele.

**Requisitos:**
 - Crie a classe `Cliente` com:
      * `nome`
      * `TipoCliente`
      * `TipoPagamento`
 

- Crie o enum `TipoCliente` contendo:
    * `PESSOA_FISICA`
    * `PESSOA_JURIDICA`


* Cada tipo deve possuir:
    * código
    * descrição
    * métodos getters


* Crie um método para buscar o tipo pela descrição:

```java
tipoClientePorNomeRelato(String descricao)
```

* Crie o enum `TipoPagamento` contendo:
    * `DEBITO`
    * `CREDITO`


* Cada tipo de pagamento deve implementar uma regra própria de desconto:
    * Débito → 5%
    * Crédito → 1%


* Crie um método abstrato:
```java
calcularDesconto(double valor)
```

* No `main`:
    * Crie clientes
    * Exiba os dados
    * Calcule descontos
    * Busque um tipo pelo nome

**Exemplo:**
Ao calcular o desconto de um cliente com pagamento em débito, o sistema deve aplicar automaticamente a regra de 5%.

**Conceitos:** Enums, métodos abstratos, polimorfismo e encapsulamento.

## Classe abstrata

### **19. Sistema de Plano de Carreira (POO)**
Objetivo: Crie um sistema em Java para gerenciar a evolução de carreira de funcionários utilizando os conceitos de POO.

**Requisitos:**
Enum deve conter os cargos:
- ESTAGIARIO (1), 
- ASSISTENTE (2), 
- ANALISTA (3), 
- SUPERVISOR (4) ,
- GESTOR (5)

obs. controlados por um valor numérico de ordem hierárquica.

Classe Abstrata Funcionario: 
- Atributos privados: nome, salario e cargo. 
- Validação: O método setSalario não deve aceitar valores negativos. 
- Método abstrato: public abstract void subiuDeCargo(Cargo novoCargo);

Classe Concreta Desenvolvedor -
Herda de Funcionario e implementa o método de promoção com as seguintes regras de negócio:
- Se ordem nova > atual: Atualiza o cargo e exibe mensagem de sucesso.
- Se ordem nova == atual: Informa que o funcionário já está nesse cargo.
- Se ordem nova < atual: Bloqueia a operação informando que rebaixamentos não são permitidos.

Exibição: Sobrescreva o método toString() para exibir o nome, a descrição amigável do cargo e o salário formatado.

## Interface

### **21. Sistema de Notificações (Básico)**
Objetivo: Entender a criação e implementação de uma interface simples.

Crie uma interface Notificador com o método void enviarMensagem(String mensagem).

Crie três classes que implementam essa interface:
- NotificacaoEmail: Exibe no console "Enviando E-mail: [mensagem]".
- NotificacaoSMS: Exibe no console "Enviando SMS: [mensagem]".
- NotificacaoPush: Exibe no console "Enviando Push Notification: [mensagem]".

Na classe Main, crie uma lista (List<Notificador>) com os três tipos de notificadores e use um laço de repetição (for) para enviar uma mensagem padrão para todos eles de uma vez.

## Polimorfismo

### **22. Sons da Natureza**

Crie uma hierarquia de animais onde cada espécie reage a um comando genérico de emitir som de maneira distinta.

Objetivo de aprendizado: Praticar a sobrescrita de métodos e entender como o Java decide qual método chamar em tempo de execução.

Requisitos:

- Crie uma superclasse Animal com o método emitirSom();
- Implemente as subclasses Cachorro, Gato e Passaro, cada uma fornecendo sua própria implementação do som;
- Em uma classe de teste, utilize um array de Animal para armazenar instâncias das subclasses e percorra-o invocando o som polimorficamente.

Conceitos: Herança, Sobrescrita (@Override), Referência de superclasse

### **23. Folha de Pagamento Corporativa**
Descrição do problema: Desenvolva um sistema que calcule os rendimentos semanais de diferentes tipos de funcionários (Assalariados, Horistas e Comissionados) de forma genérica.

Objetivo de aprendizado: Utilizar classes abstratas para definir um contrato comum para uma hierarquia de herança.

Requisitos:
- Declare a classe abstrata Employee (ou Funcionario) com um método abstrato vencimentos();
- As subclasses devem implementar o cálculo: SalariedEmployee (salário fixo), HourlyEmployee (horas trabalhadas + extras) e CommissionEmployee (porcentagem de vendas);
- O sistema deve ser capaz de aplicar um bônus de 10% apenas para funcionários que sejam do tipo BasePlusCommissionEmployee durante o processamento;

Conceitos: Classes e Métodos Abstratos, instanceof, Downcasting

### **24. Sistema de Contas a Pagar Unificado**
Descrição do problema: Uma empresa precisa processar pagamentos tanto para seus funcionários quanto para faturas de fornecedores (Invoices) em um único lote financeiro.

Objetivo de aprendizado: Demonstrar como uma interface pode unificar tipos totalmente distintos em um processamento polimórfico.

Requisitos:
- Crie a interface Payable (ou Pagavel) com o método getPaymentAmount();
- Faça com que a classe Invoice e a classe abstrata Employee implementem essa interface;
- Crie um programa que armazene ambos os tipos em um ArrayList<Payable> e processe o pagamento total;

Conceitos: Realização de Interface, Coleções Polimórficas

## Exceptions

### **25. Exploração de Stacktrace**
Descrição do problema: Crie um programa que intencionalmente cause uma falha ao tentar acessar um índice inexistente de um array durante um laço de repetição.

Objetivo de aprendizado: Compreender a leitura da stacktrace, identificando o nome da exceção, a mensagem e a linha do erro.

Requisitos:
- Declarar um array de inteiros de tamanho fixo.
- Criar um laço for que ultrapasse o tamanho limite do array, forçando uma ArrayIndexOutOfBoundsException.
- Executar o programa sem tratamento e analisar a saída no console.

### **26. Captura Múltipla**
Descrição do problema: Escreva um programa de calculadora simples que peça dois números ao usuário para realizar uma operação de divisão, lidando com diferentes tipos de falhas de entrada e de matemática.

Objetivo de aprendizado: Utilizar múltiplos blocos catch para tratar exceções de naturezas diferentes de forma independente.

Requisitos:
- Solicitar dois números via console (usando Scanner).
- Capturar ArithmeticException caso o segundo número seja zero.
- Capturar InputMismatchException caso o usuário digite texto/letras.

### **27. O Operador Ponto em Nulos**
Descrição do problema: Crie um programa que tente acessar um método de um objeto que ainda não foi instanciado em memória.

Objetivo de aprendizado: Provocar, capturar e compreender a NullPointerException, a Unchecked Exception mais comum do Java.

Requisitos:
- Declarar uma variável de referência para uma classe qualquer (ex: String texto).
- Inicializá-la explicitamente com null.
- Tentar chamar um método a partir dessa variável (ex: texto.length()) dentro de um bloco try-catch.

### **28. Garantia de Execução com Finally**
Descrição do problema: Simule o ciclo de vida de uma conexão com um banco de dados, garantindo que a conexão sempre seja encerrada após o uso, ocorrendo erros durante as consultas ou não.

Objetivo de aprendizado: Compreender o funcionamento do bloco finally e sua importância para evitar vazamento de memória e conexões abertas.

Requisitos:

- Criar um método fictício conectar() que imprime "Abrindo conexão".
- Criar um método fictício fecharConexao() que imprime "Conexão fechada".
- Usar um bloco try que simula uma consulta de banco de dados (que gera uma exceção) e garantir com o finally que o método fecharConexao() seja chamado em qualquer cenário.

### **29. O Desafio do Arquivo (Checked Exception)**
Descrição do problema: Desenvolva um programa que tente abrir um arquivo de texto presente no disco rígido para leitura, lidando com as restrições impostas pelo compilador Java sobre riscos de E/S (Entrada e Saída).

Objetivo de aprendizado: Resolver o requisito de compilação do compilador (catch-or-declare) para exceções do tipo Checked.

Requisitos:

- Tentar instanciar um leitor de arquivo java.io.FileInputStream apontando para um caminho de arquivo inexistente.
- Resolver o erro de compilação da FileNotFoundException de duas formas diferentes:
  - Método A: Utilizando try-catch para tratar o erro localmente de forma amigável.
  - Método B: Adicionando a cláusula throws na assinatura do método para delegar a responsabilidade de tratamento para quem chamá-lo.

### **30. Desalocação Automática com Try-with-resources**
Descrição do problema: Refatore a lógica de leitura de arquivos (ou conexões externas) para adotar a sintaxe mais moderna do Java para liberação de recursos.

Objetivo de aprendizado: Dominar o uso da estrutura try-with-resources para gerenciar automaticamente objetos que implementam a interface AutoCloseable.

Requisitos:
- Instanciar um recurso de leitura de arquivos ou um recurso simulado que implemente AutoCloseable diretamente na declaração de parênteses do try().
- Realizar a leitura ou lógica de teste dentro do escopo do bloco.
- Remover a necessidade de declarar um bloco finally explícito, comprovando que o Java fechou o recurso de forma oculta.

### **31. Lançamento Manual de Erros (Throw)**
Descrição do problema: Proteja a consistência interna de um modelo de dados criando regras rígidas de validação no momento da instanciação de novas entidades.

Objetivo de aprendizado: Utilizar a instrução imperativa throw para barrar a criação de objetos inválidos, forçando o fluxo a parar.

Requisitos:

- Criar uma classe Livro que receba os atributos titulo e um objeto Autor em seu construtor.
- No construtor, validar se o parâmetro Autor é igual a null.
- Se for nulo, disparar manualmente uma IllegalArgumentException contendo uma mensagem clara de erro de negócio.

### **32. Criação de Exceção Própria**
Descrição do problema: Desenvolva a lógica de saque de uma conta bancária implementando uma classe de exceção específica para o domínio do problema financeiro, evitando o uso de exceções genéricas do sistema.

Objetivo de aprendizado: Criar, herdar e disparar Exceções Customizadas que reflitam regras de negócios específicas.

Requisitos:
- Criar a classe SaldoInsuficienteException estendendo de RuntimeException (tornando-a Unchecked).

- Adicionar um construtor que aceite uma mensagem String e a envie para a classe mãe através de super(mensagem).

- Implementar um método saca(double valor) na classe Conta que verifique se o valor do saque é maior que o saldo e dispare essa nova exceção em caso de saldo insuficiente.

### **33. Encadeamento de Exceções (Exception Chaining)**
Descrição do problema: Em arquiteturas corporativas, erros técnicos de infraestrutura não devem chegar diretamente ao usuário final, mas o rastro técnico original não pode ser perdido. Crie um mecanismo que empacote um erro técnico dentro de um erro de negócio.

Objetivo de aprendizado: Dominar o conceito de Exception Chaining para repassar exceções encapsulando a causa raiz original (cause).

Requisitos:

- Simular um método de persistência que jogue uma SQLException simulada ao conectar ao banco.

- Capturar essa exceção em um bloco catch.

- Lançar uma nova exceção do tipo RuntimeException personalizada da aplicação, enviando a SQLException original como parâmetro do construtor da nova exceção.

### 34. Validação de Conteúdo**
Descrição do problema: Desenvolva um método verificador de cadeias de caracteres que analise a estrutura interna de um texto para garantir conformidade de formato.

Objetivo de aprendizado: Integrar buscas em strings com o disparo seletivo de exceções personalizadas de domínio.

Requisitos:

- Criar a exceção personalizada SemVogalException.

- Escrever um método que receba uma String por parâmetro.

- Avaliar se o texto recebido não possui nenhuma vogal (a, e, i, o, u). Se não possuir, disparar a exceção customizada.

### 35. Impedimento de Números Duplicados**
Descrição do problema: Crie uma lista numérica dinâmica que impeça a inclusão de valores duplicados pelo usuário, disparando interrupções caso o padrão seja quebrado.

Objetivo de aprendizado: Aplicar manipulação de coleções de dados integrada com a lógica de checagem em tempo de execução e emissão de erros.

Requisitos:

- Solicitar inteiros do console continuamente.
- Caso o usuário insira um número inteiro que já foi digitado anteriormente, o sistema deve interromper o fluxo de adição lançando uma IllegalArgumentException.

### 36. Regras de Exceções em Herança**
Descrição do problema: Modele uma relação de herança onde uma classe derivada tenta sobrescrever um comportamento assinado pela classe base, violando os princípios de visibilidade e escopo de exceções verificadas.

Objetivo de aprendizado: Compreender as limitações e regras rígidas impostas pelo polimorfismo do Java ao lidar com assinaturas de métodos herdados que lançam exceções (Checked Exceptions).

Requisitos:

- Criar uma classe base com o método calcular() que declara throws IOException.

- Criar uma classe filha que sobrescreve o método calcular() e tenta alterar a cláusula para throws Exception.

- Analisar o erro gerado no compilador, entendendo que o método sobrescrito na classe filha não pode lançar exceções mais genéricas (ou novas) do que as declaradas pelo pai.

## Wrappers

### **37 Conversor de Formato e Validador de Entrada (Parsing)**
Objetivo: Praticar a conversão de String para tipos primitivos usando Wrappers e o tratamento de exceção associado.

O que fazer:
Crie um método que receba uma String contendo o valor "150.75" e outra String contendo "quarenta".

- Converta a primeira String para um tipo primitivo double utilizando o Wrapper correspondente (Double.parseDouble).

- Tente converter a segunda String para int utilizando Integer.parseInt.

- Envolva a segunda conversão em um bloco try-catch para capturar a exceção de formato inválido (NumberFormatException) e exiba uma mensagem amigável no console.

### **38. Autoboxing vs Performance em Loops
Objetivo: Sentir na prática o impacto de performance do autoboxing/unboxing desnecessário em operações repetitivas.

O que fazer:
Crie um método com dois loops simples que somem números de 1 até 10.000.000:

- No Loop A, declare a variável do acumulador da soma como o Wrapper Long (Long soma = 0L;).

- No Loop B, declare a variável do acumulador da soma como o primitivo long (long soma = 0L;).

- Marque o tempo de execução de cada loop usando System.currentTimeMillis() e compare a diferença de tempo de processamento entre usar o Wrapper e o primitivo.

### **39. A armadilha do cache de memória**

Objetivo: Evidenciar o comportamento do operador `==` vs `.equals()` e entender a faixa de cache do `Integer.valueOf()`.

O que fazer:
Crie uma classe de teste que faça o seguinte:

- Declare dois objetos `Integer a = 100;` e `Integer b = 100;`. Compare-os no console usando `a == b` e `a.equals(b)`.
- Declare dois objetos `Integer x = 200;` e `Integer y = 200;`. Compare-os no console usando `x== y`e `x.equals(y)`.
- Comente no código o motivo pela qual `a == b` resulta em `true`, mas `x == y` resulta em `false, citando a faixa de cache.

### **40. O Perigo Silencioso do Unboxing e NullPointerException**
Objetivo: Identificar como o unboxing automático em variáveis null pode quebrar a aplicação em tempo de execução.

O que fazer:
Imagine um sistema financeiro ou de e-commerce onde o preço ou desconto pode ser opcional (nulo).

- Crie uma variável Double desconto = null;.

- Crie uma variável primitiva double precoFinal = 100.0;.

- -Tente fazer a operação matemática precoFinal = precoFinal - desconto;

- Observe o erro gerado (NullPointerException). Reescreva o código adicionando uma verificação de segurança (usando operador ternário ou if/else) para só aplicar o desconto caso a variável Wrapper não seja null.