# Documentação dos Exercícios de Java

Este arquivo descreve, exercício por exercício, o que cada pasta em
`exercicios/src/main/java/` deveria implementar. Cada exercício tem sua
própria pasta (`exercicio_01`, `exercicio_02`, ... `exercicio_71`), e a
numeração deste documento segue exatamente a numeração das pastas — se você
está revisando o `exercicio_35`, é só procurar "### 35." aqui.

> **Legenda de status**, usada apenas quando um exercício não está no padrão
> "concluído": `⚠️ Incompleto` (rascunho não finalizado) · `🐞 Com bug conhecido`
> (funciona, mas tem um problema documentado). Exercícios sem essa marca estão
> concluídos e sem pendência conhecida no momento da escrita deste documento.

---

### **1. O Desafio da Troca e Precedência**
📁 `exercicio_01`

**Descrição do problema:** Crie um programa que realize a troca de valores entre duas variáveis inteiras. Após a troca, o programa deve avaliar uma expressão matemática complexa para demonstrar o entendimento da ordem de operações.

- **Objetivo de aprendizado:** Compreender atribuição de variáveis, uso de variáveis temporárias.


- **Requisitos:**
    1. Trocar os valores de `a` e `b` usando uma variável `temp`.
    2. Realizar a troca novamente sem usar uma terceira variável (lógica aritmética).


- **Exemplo:** Entrada: `a = 5`, `b = 10`. Saída após troca: `a = 10`, `b = 5`.


### **2. Aritmética Primitiva e Extração de Objetos**
📁 `exercicio_02`

**Descrição do problema:** Desenvolva uma calculadora que receba dois números inteiros e exiba estatísticas básicas. Além disso, o programa deve converter um objeto complexo (`BigInteger`) em um tipo primitivo.

- **Objetivo de aprendizado:** Dominar tipos primitivos (`int`, `double`) e a extração de valores de classes invólucro ou objetos matemáticos.

- **Requisitos:**
    1. Calcular soma, produto e média (a média deve ser `double`).

- **Exemplo:** Entrada: `10, 5`. Saída: `Soma: 15, Produto: 50, Média: 7.5`.

## Construtores

### **3. Construtor Padrão (Default)**
📁 `exercicio_03`

Crie uma classe Cat com variáveis de instância name e age. Implemente um construtor padrão que inicialize o nome como "Unknown" e a idade como 0.


### **4. Sobrecarga de Parametrizado**
📁 `exercicio_04`

Crie uma classe Dog com name e color, implementando um construtor que receba e atribua esses valores no momento da criação.


### **5. Sobrecarga de Construtores**
📁 `exercicio_05`

Implemente a classe Book com title, author e price. Crie três construtores: um padrão, um que receba apenas título e autor, e outro que receba os três atributos.


### **6. Encadeamento de Construtores (Chaining)**
📁 `exercicio_06`

Crie uma classe Student e utilize a palavra-chave this() para fazer com que um construtor chame outro, inicializando studentId, studentName e grade.

### **7. Construtor de Cópia**
📁 `exercicio_07`

Na classe Rectangle, implemente um construtor que inicialize um novo objeto utilizando os valores de um objeto já existente.


### **8. Construtor com Validação**
📁 `exercicio_08`

Crie uma classe Account onde o construtor deve validar se o número da conta não é nulo/vazio e se o saldo inicial não é negativo, exibindo erro se falhar.


## **Encapsulamento**

### **9. Esconder Dados**
📁 `exercicio_09`

Crie uma classe Vehicle com um atributo speed privado.
Implemente métodos getSpeed() e setSpeed() com validação (não permitir valores negativos).
Crie um método speedUp() que aumenta a velocidade.
Em seguida, crie duas subclasses Car e Bicycle que sobrescrevem o método speedUp() com regras diferentes de aumento de velocidade.

### **10. Esconder Dados**
📁 `exercicio_10`

Criar uma classe base Shape com métodos draw() e calculateArea(). Implemente subclasses como Circle e Cylinder,
onde o Cylinder deve encapsular a lógica de cálculo de sua área de superfície total ao sobrescrever o método da classe pai.

## Membros da Classe com o Modificador static

### **11. Monitor de Instâncias de Funcionários**
📁 `exercicio_11`

Crie uma classe Funcionario que monitore automaticamente quantos objetos foram criados em memória durante a execução do programa.

Declare uma variável private static int contagem que é incrementada no construtor da classe.

Crie um método public static int getQuantidadeFuncionarios() para retornar esse valor sem precisar instanciar a classe para chamá-lo.

## Associação

### **12. Associação Bilateral: Jogadores e Times**
📁 `exercicio_12`

Implemente uma relação bidirecional onde um Jogador pertence a um Time e um Time possui uma lista de Jogadores.

Objetivo: Praticar associação de objetos, manipulação de arrays e verificações de referência nula (null check).

Requisitos:
- Atributo Time na classe Jogador.
- Atributo Jogador[] na classe Time.
- Métodos de impressão que exibam os dados de ambas as classes vinculadas.

Exemplo: Ao imprimir um Time, o programa deve listar todos os Jogadores associados a ele.

### **13. Associação: Veículo e Placa**
📁 `exercicio_13`

Modele um sistema onde uma classe de registro (Associacao) vincula um Carro a uma Placa.

Objetivo: Praticar a navegação entre objetos onde a classe associativa detém a referência.

Requisitos:
- Classe Carro com nome e marca.
- Classe Associacao com atributo String placa e atributo do tipo Carro.
- Exibir a frase: "O veículo [Nome] possui a placa [Placa]".

Exemplo: A partir de um objeto Associacao, acessar o nome do Carro vinculado para exibir o relatório.

## Herança

### **14. Polimorfismo: Controle de Bonificações**
📁 `exercicio_14`

Implemente um sistema de folha de pagamento que processe diferentes regras de bônus através de uma referência única.

Objetivo: Compreender o Dynamic Binding, observando como a JVM identifica o método correto de uma subclasse em tempo de execução, mesmo quando referenciada pela classe mãe.

Requisitos:
- Classe Funcionario: Base com o método getBonificacao() (retorno de 10% do salário).
- Subclasses Gerente e Diretor: Devem sobrescrever getBonificacao() para retornar 15% e 20%, respectivamente.
- Classe ControleDeBonificacoes: Possuir o método registra(Funcionario f) que utiliza uma lista (ArrayList) para armazenar os funcionários e acumular o valor total das bonificações.

Exemplo: Ao fornecer um Gerente ao método registra, o sistema deve ignorar a regra padrão de 10% e aplicar a regra específica de 15%, garantindo o acoplamento reduzido.

### **15. Hierarquia de Contas Bancárias (Herança e Sobrescrita)**
📁 `exercicio_15`

Modele um sistema para um banco que possui diferentes tipos de contas. Todas as contas possuem um saldo, mas o método de "saque" e "atualização" varia conforme o tipo.

Requisitos:
 - Crie uma superclasse `Conta` com o atributo `protected double saldo`.
 - Implemente o método `sacar(double valor)` na classe mãe.
 - Crie a subclasse `ContaCorrente` que cobra uma taxa de R$ 0,10 para cada saque realizado (sobrescrita).
 - Crie a subclasse `ContaPoupanca` e implemente um método de atualização que rende juros conforme uma taxa passada por parâmetro.

## Modificador final

### **16. Segurança de Algoritmos Críticos (Modificador final)**
📁 `exercicio_16`

Em sistemas de seguros e finanças, certas fórmulas e estruturas não podem ser modificadas para garantir a integridade dos dados e evitar comportamentos inesperados em subclasses.

Requisitos:
- Impedir Extensão: Verifique que a classe CalculadoraFiscal não permite subclasses.
- Impedir Sobrescrita: Tente declarar um método public double calcularTaxaFixa() dentro da classe Operacao e observe o erro: 'calcularTaxaFixa()' cannot override 'calcularTaxaFixa()' in 'Seguro'; overridden method is final.
- Composição vs Herança: Note que a CalculadoraFiscal processa objetos do tipo Operacao, mas não herda deles, mantendo as responsabilidades separadas.

## Casting

### **17. Sistema de Veículos com Casting (Casting de Dados e Sobrescrita)**
📁 `exercicio_17`

**Descrição do problema:** Modele uma frota onde veículos genéricos precisam ser identificados para ações específicas (como ligar o turbo em carros).

Requisitos:
- Crie a classe `Veiculo` com o método `liga()`.
- Crie a subclasse `Carro` com um método exclusivo `ativarArCondicionado()`.
- Crie uma lista de `Veiculo` e adicione objetos do tipo `Carro`.
- Ao percorrer a lista, utilize o operador `instanceof` para verificar se o veículo é um `Carro` e, se for, realize o **casting** para chamar o método exclusivo de ar condicionado.

**Conceitos:** Downcasting, `instanceof`, Vinculação dinâmica

## Enum

### **18. Sistema de Clientes e Formas de Pagamento (Enum com comportamento)**
📁 `exercicio_18`

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
tipoClientePorNomeRelato(String descricao);
```

* Crie o enum `TipoPagamento` contendo:
    * `DEBITO`
    * `CREDITO`


* Cada tipo de pagamento deve implementar uma regra própria de desconto:
    * Débito → 5%
    * Crédito → 1%


* Crie um método abstrato:
```java
calcularDesconto(double valor);
```

* No `main`:
    * Crie clientes
    * Exiba os dados
    * Calcule descontos
    * Busque um tipo pelo nome

**Exemplo:**
Ao calcular o desconto de um cliente com pagamento em débito, o sistema deve aplicar automaticamente a regra de 5%.

**Conceitos:** Enums, métodos abstratos, polimorfismo e encapsulamento.

## Associação (revisão)

### **19. Escalação de Time com Vínculo Bidirecional ⚠️ Incompleto**
📁 `exercicio_19`

> **Nota de status:** este exercício ficou como rascunho — o `Main.java` original
> está marcado `// INCOMPLETO`, o enum `Posicao` nunca foi preenchido (fica
> sempre `null` na impressão do jogador) e `listaJogadores` foi declarado
> `static`, o que faz **todos** os objetos `Time` compartilharem a mesma lista
> de jogadores entre si — o mesmo tipo de bug que reaparece de forma mais
> perigosa com beans `@Autowired` do Spring, que são singletons por padrão.
> Documentado aqui como estava a intenção original, para retomar ou descartar
> conscientemente.

**Descrição do problema:** Modele uma segunda variação de associação bilateral entre `Jogador` e `Time` (revisitando o tema do exercício 12), desta vez controlando o salário do jogador e a posição em que ele atua dentro do time.

**Objetivo de aprendizado:** Reforçar associação de objetos e manipulação de arrays de tamanho fixo, além de introduzir um enum (`Posicao`) para representar um atributo de domínio.

**Requisitos (como o rascunho foi iniciado):**
- Classe `Jogador` com `nome`, `salario`, `Posicao` e referência ao `Time`.
- Enum `Posicao` para representar a posição em campo do jogador (ainda vazio no rascunho — precisa ser definido, ex.: `ATACANTE`, `MEIO_CAMPO`, `ZAGUEIRO`, `GOLEIRO`).
- Classe `Time` com um array de tamanho fixo de `Jogador` e um método `adicionarJogador` que preenche as vagas disponíveis.
- **Pendências para finalizar:** tornar o array de jogadores um atributo de instância (remover o `static`), preencher o enum `Posicao`, e atribuir a posição do jogador em algum momento antes da impressão.

## Classe abstrata

### **20. Sistema de Plano de Carreira (POO)**
📁 `exercicio_20`

Objetivo: Crie um sistema em Java para gerenciar a evolução de carreira de funcionários utilizando os conceitos de POO.

**Requisitos:**
Enum deve conter os cargos:
- ESTAGIARIO (1),
- ASSISTENTE (2),
- ANALISTA (3),
- SUPERVISOR (4),
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
📁 `exercicio_21`

Objetivo: Entender a criação e implementação de uma interface simples.

Crie uma interface Notificador com o método void enviarMensagem(String mensagem).

Crie três classes que implementam essa interface:
- NotificacaoEmail: Exibe no console "Enviando E-mail: [mensagem]".
- NotificacaoSMS: Exibe no console "Enviando SMS: [mensagem]".
- NotificacaoPush: Exibe no console "Enviando Push Notification: [mensagem]".

Na classe Main, crie uma lista (List<Notificador>) com os três tipos de notificadores e use um laço de repetição (for) para enviar uma mensagem padrão para todos eles de uma vez.

## Polimorfismo

### **22. Sons da Natureza**
📁 `exercicio_22`

Crie uma hierarquia de animais onde cada espécie reage a um comando genérico de emitir som de maneira distinta.

Objetivo de aprendizado: Praticar a sobrescrita de métodos e entender como o Java decide qual método chamar em tempo de execução.

Requisitos:

- Crie uma superclasse Animal com o método emitirSom();
- Implemente as subclasses Cachorro, Gato e Passaro, cada uma fornecendo sua própria implementação do som;
- Em uma classe de teste, utilize um array de Animal para armazenar instâncias das subclasses e percorra-o invocando o som polimorficamente.

Conceitos: Herança, Sobrescrita (@Override), Referência de superclasse

### **23. Folha de Pagamento Corporativa**
📁 `exercicio_23`

Descrição do problema: Desenvolva um sistema que calcule os rendimentos semanais de diferentes tipos de funcionários (Assalariados, Horistas e Comissionados) de forma genérica.

Objetivo de aprendizado: Utilizar classes abstratas para definir um contrato comum para uma hierarquia de herança.

Requisitos:
- Declare a classe abstrata Employee (ou Funcionario) com um método abstrato vencimentos();
- As subclasses devem implementar o cálculo: SalariedEmployee (salário fixo), HourlyEmployee (horas trabalhadas + extras) e CommissionEmployee (porcentagem de vendas);

> **Nota:** o enunciado original também citava um bônus de 10% para um suposto tipo `BasePlusCommissionEmployee`, mas essa classe nunca chegou a ser especificada (nem pedida nos requisitos acima, nem implementada no código) — removido daqui para não induzir a tentar implementar algo que nunca fez parte do escopo real.

Conceitos: Classes e Métodos Abstratos, instanceof, Downcasting

### **24. Sistema de Contas a Pagar Unificado**
📁 `exercicio_24`

Descrição do problema: Uma empresa precisa processar pagamentos tanto para seus funcionários quanto para faturas de fornecedores (Invoices) em um único lote financeiro.

Objetivo de aprendizado: Demonstrar como uma interface pode unificar tipos totalmente distintos em um processamento polimórfico.

Requisitos:
- Crie a interface Payable (ou Pagavel) com o método getPaymentAmount();
- Faça com que a classe Invoice e a classe abstrata Employee implementem essa interface;
- Crie um programa que armazene ambos os tipos em um ArrayList<Payable> e processe o pagamento total;

Conceitos: Realização de Interface, Coleções Polimórficas

## Exceptions

### **25. Exploração de Stacktrace**
📁 `exercicio_25`

Descrição do problema: Crie um programa que intencionalmente cause uma falha ao tentar acessar um índice inexistente de um array durante um laço de repetição.

Objetivo de aprendizado: Compreender a leitura da stacktrace, identificando o nome da exceção, a mensagem e a linha do erro.

Requisitos:
- Declarar um array de inteiros de tamanho fixo.
- Criar um laço for que ultrapasse o tamanho limite do array, forçando uma ArrayIndexOutOfBoundsException.
- Executar o programa sem tratamento e analisar a saída no console.

### **26. Captura Múltipla**
📁 `exercicio_26`

Descrição do problema: Escreva um programa de calculadora simples que peça dois números ao usuário para realizar uma operação de divisão, lidando com diferentes tipos de falhas de entrada e de matemática.

Objetivo de aprendizado: Utilizar múltiplos blocos catch para tratar exceções de naturezas diferentes de forma independente.

Requisitos:
- Solicitar dois números via console (usando Scanner).
- Capturar ArithmeticException caso o segundo número seja zero.
- Capturar InputMismatchException caso o usuário digite texto/letras.

### **27. O Operador Ponto em Nulos**
📁 `exercicio_27`

Descrição do problema: Crie um programa que tente acessar um método de um objeto que ainda não foi instanciado em memória.

Objetivo de aprendizado: Provocar, capturar e compreender a NullPointerException, a Unchecked Exception mais comum do Java.

Requisitos:
- Declarar uma variável de referência para uma classe qualquer (ex: String texto).
- Inicializá-la explicitamente com null.
- Tentar chamar um método a partir dessa variável (ex: texto.length()) dentro de um bloco try-catch.

### **28. Garantia de Execução com Finally**
📁 `exercicio_28`

Descrição do problema: Simule o ciclo de vida de uma conexão com um banco de dados, garantindo que a conexão sempre seja encerrada após o uso, ocorrendo erros durante as consultas ou não.

Objetivo de aprendizado: Compreender o funcionamento do bloco finally e sua importância para evitar vazamento de memória e conexões abertas.

Requisitos:

- Criar um método fictício conectar() que imprime "Abrindo conexão".
- Criar um método fictício fecharConexao() que imprime "Conexão fechada".
- Usar um bloco try que simula uma consulta de banco de dados (que gera uma exceção) e garantir com o finally que o método fecharConexao() seja chamado em qualquer cenário.

### **29. O Desafio do Arquivo (Checked Exception)**
📁 `exercicio_29`

Descrição do problema: Desenvolva um programa que tente abrir um arquivo de texto presente no disco rígido para leitura, lidando com as restrições impostas pelo compilador Java sobre riscos de E/S (Entrada e Saída).

Objetivo de aprendizado: Resolver o requisito de compilação do compilador (catch-or-declare) para exceções do tipo Checked.

Requisitos:

- Tentar instanciar um leitor de arquivo java.io.FileInputStream apontando para um caminho de arquivo inexistente.
- Resolver o erro de compilação da FileNotFoundException de duas formas diferentes:
  - Método A: Utilizando try-catch para tratar o erro localmente de forma amigável.
  - Método B: Adicionando a cláusula throws na assinatura do método para delegar a responsabilidade de tratamento para quem chamá-lo.

### **30. Desalocação Automática com Try-with-resources**
📁 `exercicio_30`

Descrição do problema: Refatore a lógica de leitura de arquivos (ou conexões externas) para adotar a sintaxe mais moderna do Java para liberação de recursos.

Objetivo de aprendizado: Dominar o uso da estrutura try-with-resources para gerenciar automaticamente objetos que implementam a interface AutoCloseable.

Requisitos:
- Instanciar um recurso de leitura de arquivos ou um recurso simulado que implemente AutoCloseable diretamente na declaração de parênteses do try().
- Realizar a leitura ou lógica de teste dentro do escopo do bloco.
- Remover a necessidade de declarar um bloco finally explícito, comprovando que o Java fechou o recurso de forma oculta.

### **31. Lançamento Manual de Erros (Throw)**
📁 `exercicio_31`

Descrição do problema: Proteja a consistência interna de um modelo de dados criando regras rígidas de validação no momento da instanciação de novas entidades.

Objetivo de aprendizado: Utilizar a instrução imperativa throw para barrar a criação de objetos inválidos, forçando o fluxo a parar.

Requisitos:

- Criar uma classe Livro que receba os atributos titulo e um objeto Autor em seu construtor.
- No construtor, validar se o parâmetro Autor é igual a null.
- Se for nulo, disparar manualmente uma IllegalArgumentException contendo uma mensagem clara de erro de negócio.

### **32. Criação de Exceção Própria**
📁 `exercicio_32`

Descrição do problema: Desenvolva a lógica de saque de uma conta bancária implementando uma classe de exceção específica para o domínio do problema financeiro, evitando o uso de exceções genéricas do sistema.

Objetivo de aprendizado: Criar, herdar e disparar Exceções Customizadas que reflitam regras de negócios específicas.

Requisitos:
- Criar a classe SaldoInsuficienteException estendendo de RuntimeException (tornando-a Unchecked).
- Adicionar um construtor que aceite uma mensagem String e a envie para a classe mãe através de super(mensagem).
- Implementar um método saca(double valor) na classe Conta que verifique se o valor do saque é maior que o saldo e dispare essa nova exceção em caso de saldo insuficiente.

### **33. Encadeamento de Exceções (Exception Chaining)**
📁 `exercicio_33`

Descrição do problema: Em arquiteturas corporativas, erros técnicos de infraestrutura não devem chegar diretamente ao usuário final, mas o rastro técnico original não pode ser perdido. Crie um mecanismo que empacote um erro técnico dentro de um erro de negócio.

Objetivo de aprendizado: Dominar o conceito de Exception Chaining para repassar exceções encapsulando a causa raiz original (cause).

Requisitos:

- Simular um método de persistência que jogue uma SQLException simulada ao conectar ao banco.
- Capturar essa exceção em um bloco catch.
- Lançar uma nova exceção do tipo RuntimeException personalizada da aplicação, enviando a SQLException original como parâmetro do construtor da nova exceção.

### **34. Validação de Conteúdo**
📁 `exercicio_34`

Descrição do problema: Desenvolva um método verificador de cadeias de caracteres que analise a estrutura interna de um texto para garantir conformidade de formato.

Objetivo de aprendizado: Integrar buscas em strings com o disparo seletivo de exceções personalizadas de domínio.

Requisitos:

- Criar a exceção personalizada SemVogalException.
- Escrever um método que receba uma String por parâmetro.
- Avaliar se o texto recebido não possui nenhuma vogal (a, e, i, o, u). Se não possuir, disparar a exceção customizada.

### **35. Impedimento de Números Duplicados**
📁 `exercicio_35`

Descrição do problema: Crie uma lista numérica dinâmica que impeça a inclusão de valores duplicados pelo usuário, disparando interrupções caso o padrão seja quebrado.

Objetivo de aprendizado: Aplicar manipulação de coleções de dados integrada com a lógica de checagem em tempo de execução e emissão de erros.

Requisitos:

- Solicitar inteiros do console continuamente.
- Caso o usuário insira um número inteiro que já foi digitado anteriormente, o sistema deve interromper o fluxo de adição lançando uma IllegalArgumentException.

### **36. Regras de Exceções em Herança**
📁 `exercicio_36`

Descrição do problema: Modele uma relação de herança onde uma classe derivada tenta sobrescrever um comportamento assinado pela classe base, violando os princípios de visibilidade e escopo de exceções verificadas.

Objetivo de aprendizado: Compreender as limitações e regras rígidas impostas pelo polimorfismo do Java ao lidar com assinaturas de métodos herdados que lançam exceções (Checked Exceptions).

Requisitos:

- Criar uma classe base com o método calcular() que declara throws IOException.
- Criar uma classe filha que sobrescreve o método calcular() e tenta alterar a cláusula para throws Exception.
- Analisar o erro gerado no compilador, entendendo que o método sobrescrito na classe filha não pode lançar exceções mais genéricas (ou novas) do que as declaradas pelo pai.

## Wrappers

### **37. Conversor de Formato e Validador de Entrada (Parsing)**
📁 `exercicio_37`

Objetivo: Praticar a conversão de String para tipos primitivos usando Wrappers e o tratamento de exceção associado.

O que fazer:
Crie um método que receba uma String contendo o valor "150.75" e outra String contendo "quarenta".

- Converta a primeira String para um tipo primitivo double utilizando o Wrapper correspondente (Double.parseDouble).
- Tente converter a segunda String para int utilizando Integer.parseInt.
- Envolva a segunda conversão em um bloco try-catch para capturar a exceção de formato inválido (NumberFormatException) e exiba uma mensagem amigável no console.

### **38. Autoboxing vs Performance em Loops**
📁 `exercicio_38`

Objetivo: Sentir na prática o impacto de performance do autoboxing/unboxing desnecessário em operações repetitivas.

O que fazer:
Crie um método com dois loops simples que somem números de 1 até 10.000.000:

- No Loop A, declare a variável do acumulador da soma como o Wrapper Long (Long soma = 0L;).
- No Loop B, declare a variável do acumulador da soma como o primitivo long (long soma = 0L;).
- Marque o tempo de execução de cada loop usando System.currentTimeMillis() e compare a diferença de tempo de processamento entre usar o Wrapper e o primitivo.

### **39. A armadilha do cache de memória**
📁 `exercicio_39`

Objetivo: Evidenciar o comportamento do operador `==` vs `.equals()` e entender a faixa de cache do `Integer.valueOf()`.

O que fazer:
Crie uma classe de teste que faça o seguinte:

- Declare dois objetos `Integer a = 100;` e `Integer b = 100;`. Compare-os no console usando `a == b` e `a.equals(b)`.
- Declare dois objetos `Integer x = 200;` e `Integer y = 200;`. Compare-os no console usando `x == y` e `x.equals(y)`.
- Comente no código o motivo pela qual `a == b` resulta em `true`, mas `x == y` resulta em `false`, citando a faixa de cache.

### **40. O Perigo Silencioso do Unboxing e NullPointerException**
📁 `exercicio_40`

Objetivo: Identificar como o unboxing automático em variáveis null pode quebrar a aplicação em tempo de execução.

O que fazer:
Imagine um sistema financeiro ou de e-commerce onde o preço ou desconto pode ser opcional (nulo).

- Crie uma variável Double desconto = null;.
- Crie uma variável primitiva double precoFinal = 100.0;.
- Tente fazer a operação matemática precoFinal = precoFinal - desconto;
- Observe o erro gerado (NullPointerException). Reescreva o código adicionando uma verificação de segurança (usando operador ternário ou if/else) para só aplicar o desconto caso a variável Wrapper não seja null.

### **41. Processador de Coleção Genérica**
📁 `exercicio_41`

Objetivo: Aplicar Wrappers no contexto real do Collections Framework, onde o uso de primitivos é proibido.

O que fazer:

- Crie uma lista de números inteiros embutida em objeto Wrapper: List<Integer> numeros = new ArrayList<>();.
- Adicione os valores [10, 25, 40, null, 5, 80, 127].
- Faça um loop iterando sobre essa lista para calcular a soma apenas dos números pares:
    - Ignore os valores que forem null sem deixar o sistema quebrar.
    - Use o método intValue() ou o unboxing seguro para realizar os cálculos.

## Strings

### **42. Imutabilidade na Prática**
📁 `exercicio_42`

Objetivo: Fixar como a JVM gerencia objetos String na memória Heap.

Crie uma variável String s = "fj11", aplique o método s.replaceAll("1", "2") e imprima a variável s.

- Observe o resultado impresso.
- Em seguida, ajuste o código para que a variável s de fato passe a refletir o valor "fj22".

### **43. Extração e Manipulação de Texto**
📁 `exercicio_43`

Objetivo: Exercitar o uso combinado de índices e métodos de corte (indexOf e substring), que são rotina no desenvolvimento Backend.

Em vez de apenas iterar caractere por caractere, crie uma classe que receba um e-mail completo (ex: "usuario.silva@dominio.com") e faça o seguinte:

- Verifique se o e-mail não está vazio nem em branco (isBlank()).
- Descubra a posição do caractere '@'.
- Extraia e imprima separadamente o nome do usuário (tudo antes do @) e o domínio (tudo depois do @).

### **44. Comparação: Referência vs. Conteúdo**
📁 `exercicio_44`

Objetivo: Ver o comportamento do String Pool e do operador new na prática.

Escreva um pequeno código que declare:

```java
String a = "Java";
String b = "Java";
String c = new String("Java");
```

- Imprima o resultado de a == b e a == c.
- Imprima o resultado de a.equals(b) e a.equals(c).
- Adicione comentários no código explicando o porquê de cada true ou false.

### **45. Teste de Performance**
📁 `exercicio_45`

Objetivo: Sentir o impacto do Garbage Collector e da alocação de memória ao lidar com repetições.

Crie uma classe com método main e meça o tempo de execução (usando System.currentTimeMillis()) para duas abordagens de concatenação com 30.000 iterações:

- Concatenação usando String convencional e o operador +.
- Concatenação usando StringBuilder e o método .append().

## Regex

### **46. Sequências com Inicial Maiúscula**
📁 `exercicio_46`

Objetivo: Escreva uma Regex para encontrar palavras que comecem com uma letra maiúscula e sejam seguidas apenas por letras minúsculas (ex: "Java", "Regex").

Entrada de teste: "Aprender Java e Regex no Brasil é excelente."

### **47. Fronteiras de Palavra (\b)**
📁 `exercicio_47`

Objetivo: Utilize o metacaractere de fronteira (\b) para localizar a palavra exata "gato", impedindo que ela seja capturada dentro de palavras compostas ou derivadas (como "gatilho" ou "gatoreade").

Entrada de teste: "O gato pulou o muro quando viu o gatilho da armadilha."

### **48. O Rastreador de Logs**
📁 `exercicio_48`

- Cenário: Você está analisando um arquivo de log do sistema e precisa extrair informações de uma linha específica.
- Texto de entrada: "2026-08-03 LOG_ERROR ID:8942 Falha de conexao"
- O que você deve criar:
  - Uma Regex para capturar exatamente o código do ID de 4 dígitos (ex: 8942).
  - Uma Regex que capture a palavra "LOG_ERROR" acompanhada do espaço que a segue.
  - Uma Regex de 5 caracteres que use o ponto (.) para encontrar a palavra "Falha" sem escrever a letra 'l' (ex: "F.lha").

### **49. O Filtro de Nomes e Arquivos**
📁 `exercicio_49`

- Cenário: Você precisa validar nomes de arquivos recebidos por um servidor e entender como os conjuntos funcionam.
- Texto de entrada: "foto.png, relatorio.pdf, script.sh, gato, gatilho"
- O que você deve criar:
  - Validação de extensão: Uma Regex usando alternância | e parênteses () para aceitar apenas arquivos que terminem em .png OU .pdf.
  - Filtro por negação ([^...]): Uma Regex para encontrar todas as sequências de texto que NÃO contenham números nem vogais.
  - Palavra exata (\b): Uma Regex que capture apenas a palavra "gato", ignorando "gatilho".

### **50. O Analisador de Quantidades**
📁 `exercicio_50`

- Cenário: Uma ferramenta precisa processar códigos de cupom e variações de palavras em um texto promocional.
- Texto de entrada: "CUPOM2026 color colour a ab abb abbbb"
- O que você deve criar:
  - Código de cupom: Uma Regex que valide o padrão "CUPOM" seguido de exatamente 4 dígitos ({n}).
  - Variação ortográfica: Uma Regex usando ? para aceitar tanto "color" quanto "colour".
  - Exercício de comparação: Dada a sequência "a ab abb abbbb", escreva o resultado que cada uma das Regex abaixo vai capturar: ab?, ab+, ab*

### **51. A Trava de Segurança**
📁 `exercicio_51`

- Cenário: Você está criando a regra de segurança de um campo de formulário que precisa ser validado de ponta a ponta.
- Texto de entrada 1: "PROD-99" (Válido)
- Texto de entrada 2: "Item PROD-99 na loja" (Inválido)
- O que você deve criar:
  - Trava estrita: Uma Regex utilizando âncoras (^ e $) para garantir que o texto seja exatamente 4 letras maiúsculas, um hífen e 2 dígitos.

### **52. A Suíte de Validação de Cadastro**
📁 `exercicio_52`

- Cenário: Monte o motor de validação para o formulário de cadastro de um sistema.
- Crie a Regex para cada campo abaixo (todas devem validar a string do início ^ ao fim $):
  1. CEP: Formato "35000-000".
  2. Telefone: Formato "(31) 98888-7777" ou "98888-7777".
  3. Data e Hora combinadas: Formato "27/07/2026 14:30".
  4. Login de Usuário: Apenas letras minúsculas e números, com tamanho entre 6 e 12 caracteres.
  5. E-mail: Formato padrão usuario@dominio.com ou usuario@dominio.com.br.

### **53. O Processador de Dados em Java**
📁 `exercicio_53`

- Cenário: Você precisa limpar, dividir e extrair informações de uma base de dados bruta contendo tags HTML e registros tabulados.
- Texto de entrada: "Ana , Pedro  ,  Maria <b>Item 1</b> e <b>Item 2</b> erro: erro no sistema"
- O que você deve criar:
  1. Limpeza com split: A expressão usada no .split() para separar os nomes ("Ana , Pedro  ,  Maria"), ignorando os espaços ao redor das vírgulas.
  2. Substituição (replaceAll): Uma Regex para mascarar todos os nomes próprios do texto por "USUARIO".
  3. Captura Relutante: Uma Regex usando o quantificador relutante (.*?) para extrair apenas a primeira tag <b>Item 1</b>, sem engolir o segundo item.
  4. Retroreferência (\1): Uma Regex usando grupos () e retroreferência para identificar palavras com termos repetidos em sequência (ex: "erro: erro").

## equals() e hashCode()

### **54. Identidade vs. Igualdade Lógica (Sobrescrita do equals)**
📁 `exercicio_54`

Descrição do problema: Desenvolva uma classe Produto com os atributos id (int), nome (String) e preco (double). Dois produtos devem ser considerados logicamente iguais se possuírem o mesmo id, independentemente de seus nomes ou preços estarem diferentes ou de estarem em instâncias de memória distintas.

Objetivo de aprendizado: Compreender a diferença entre igualdade de referência (==) e igualdade lógica, praticando a sobrescrita do método equals() herdado de java.lang.Object.

Requisitos:
1. Sobrescrever o método equals(Object obj) respeitando a verificação de identidade (this == obj), tratamento de nulo e checagem de tipo (instanceof).
2. Instanciar dois objetos Produto diferentes na memória (new) com o mesmo id e testar a comparação usando == e .equals().
3. Exibir no console os resultados de ambos os testes e comentar a diferença.

### **55. As 5 Propriedades do Contrato de equals()**
📁 `exercicio_55`

Descrição do problema: Crie uma classe de testes automatizados simples (em um método main) que valide programaticamente se a implementação do método equals() da classe Cliente atende às 5 regras do contrato formal do Java.

Objetivo de aprendizado: Fixar e comprovar na prática as 5 propriedades do contrato de equals() (Reflexiva, Simétrica, Transitiva, Consistente e Não-Nulidade).

Requisitos:
1. Criar três instâncias de Cliente (x, y, z) com dados idênticos.
2. Testar e imprimir o resultado booleano de cada uma das 5 propriedades:
   - Reflexiva: x.equals(x) deve ser true.
   - Simétrica: x.equals(y) é igual a y.equals(x)?
   - Transitiva: Se x.equals(y) é true e y.equals(z) é true, x.equals(z) também é true?
   - Consistente: Múltiplas chamadas consecutivas de x.equals(y) retornam sempre o mesmo resultado?
   - Não-Nulidade: x.equals(null) retorna false sem disparar NullPointerException?

### **56. O "Desastre" da Quebra de Contrato com hashCode()**
📁 `exercicio_56`

Descrição do problema: Demonstre o que acontece quando um desenvolvedor sobrescreve o método equals() de uma entidade, mas esquece de sobrescrever o método hashCode().

Objetivo de aprendizado: Se dois objetos são considerados iguais pelo equals(), eles obrigatoriamente devem possuir o mesmo hashCode().

## List

### **57. Modificação Concorrente e Iteração Segura (ConcurrentModificationException)**
📁 `exercicio_57`

Descrição do problema: Desenvolva um programa que processe uma lista de números inteiros para remover todos os valores pares. Tentar remover elementos diretamente dentro de um loop enhanced-for resulta em uma ConcurrentModificationException. Refatore o código para realizar a remoção de forma segura utilizando o método removeIf ou a classe Iterator.

Objetivo de aprendizado: Compreender o mecanismo fail-fast do Java Collections Framework, identificando a causa da ConcurrentModificationException e aplicando as abordagens corretas para alteração da estrutura durante a iteração.

Requisitos:

- Instanciar uma List<Integer> mutável contendo uma sequência de números inteiros (pares e ímpares).
- Implementar a remoção dos elementos pares utilizando obrigatoriamente list.removeIf(...) ou iterator.remove().
- Exibir no console a lista resultante apenas com os números ímpares mantidos.

### **58. Navegação Bidirecional e Alteração em Tempo de Execução (ListIterator)**
📁 `exercicio_58`

Descrição do problema: Crie um programa que receba uma lista de nomes de produtos (String). Utilize a interface ListIterator para percorrer a lista do início ao fim, convertendo todos os nomes para letras maiúsculas (toUpperCase()). Em seguida, utilizando o mesmo iterador em sentido inverso, percorra a lista de trás para frente imprimindo os elementos já modificados.

Objetivo de aprendizado: Dominar os recursos exclusivos da interface ListIterator, como navegação bidirecional (hasNext/hasPrevious), alteração de elementos no lugar (set) e controle de ponteiros de iteração.

Requisitos:
1. Instanciar uma List<String> mutável com pelo menos 3 elementos em letras minúsculas.
2. Utilizar listIterator.hasNext() e listIterator.set(...) para transformar todos os elementos em maiúsculas na navegação para a frente.
3. Sem reinstanciar a lista ou o iterador do zero, utilizar listIterator.hasPrevious() e listIterator.previous() para imprimir cada elemento no console na ordem inversa.

### **59. Ordenação Customizada e Critérios de Desempate (List.sort e Comparator)**
📁 `exercicio_59`

Descrição do problema: Desenvolva uma classe Aluno com os atributos nome (String) e nota (double). Crie uma lista com vários alunos e ordene-a primeiramente pela nota em ordem decrescente (da maior nota para a menor) e, caso existam alunos com a mesma nota, utilize o nome em ordem alfabética como critério de desempate.

Objetivo de aprendizado: Praticar a ordenação de coleções utilizando o método .sort() da interface List combinado com a API moderna de Comparator (comparing, reversed e thenComparing).

Requisitos:

1. Criar a classe Aluno com construtor, métodos getters e sobrescrita do método toString().
2. Instanciar uma List<Aluno> contendo pelo menos 4 alunos, garantindo que haja pelo menos dois alunos com notas idênticas para testar o desempate.
3. Aplicar a ordenação na lista usando o método sort() diretamente na List com Comparator.comparing(...).
4. Exibir os alunos ordenados no console.

### **60. Ordenação Natural de Objetos (Comparable e compareTo)**
📁 `exercicio_60`

Descrição do problema: Desenvolva uma classe Livro com os atributos titulo (String), autor (String) e anoPublicacao (int). A classe deve implementar a interface Comparable<Livro> para definir que a ordem natural dos livros seja baseada no anoPublicacao em ordem cronológica crescente (do mais antigo para o mais recente).

Objetivo de aprendizado: Compreender o conceito de ordem natural de uma classe de domínio, praticando a implementação do contrato Comparable<T> e a sobrescrita do método compareTo().

Requisitos:

1. Criar a classe Livro implementando Comparable<Livro>.
2. Sobrescrever o método compareTo(Livro outro) comparando o atributo anoPublicacao (usando Integer.compare ou comparação direta).
3. Instanciar uma List<Livro> desordenada.
4. Ordenar a lista utilizando Collections.sort(lista) ou lista.sort(Comparator.naturalOrder()) e exibir os livros ordenados no console.

## Set

### **61. Contador de Palavras Únicas (Tokenização)**
📁 `exercicio_61`

Objetivo: Praticar remoção de duplicatas e ordenação natural.

Enunciado: Receba um texto longo (uma frase ou trecho de livro). Remova pontuações, converta todas as letras para minúsculas, divida o texto em palavras (split("\\s+")) e armazene-as em um TreeSet. Imprima quantas palavras únicas existem no texto e a lista completa em ordem alfabética.

### **62. Operações de Álgebra de Conjuntos**
📁 `exercicio_62`

Objetivo: Dominar os métodos addAll(), retainAll() e removeAll().

Enunciado: Crie dois conjuntos de números inteiros:
- Conjunto A: [1, 2, 3, 4, 5, 6]
- Conjunto B: [4, 5, 6, 7, 8, 9]

Implemente três métodos separados que retornem (sem alterar os conjuntos originais):
1. A União de A e B.
2. A Interseção de A e B.
3. A Diferença (elementos que estão em A, mas não em B).

### **63. Navegação em Conjuntos Ordenados (NavigableSet)**
📁 `exercicio_63`

Descrição do problema: Um catálogo de produtos precisa responder a perguntas de navegação por faixa de preço — qual o produto de preço imediatamente acima ou abaixo de um valor de referência, e quais produtos caem dentro de uma faixa específica — sem varrer a coleção inteira manualmente a cada consulta.

Objetivo de aprendizado: Ir além do Set básico (61, 62) e explorar os métodos de navegação que só existem em um `NavigableSet`, aproveitando a ordenação natural mantida por um `TreeSet`.

Requisitos:
- Criar uma classe `Produto` com `nome` e `preco`, implementando `Comparable<Produto>` pelo preço.
- Armazenar vários produtos em um `NavigableSet<Produto>` (`TreeSet`).
- Usar `ceiling(referencia)` para encontrar o menor produto com preço maior ou igual a um valor de referência.
- Usar `lower(referencia)` para encontrar o maior produto com preço estritamente menor que um valor de referência.
- Usar `subSet(de, inclusiveDe, ate, inclusiveAte)` para obter todos os produtos dentro de uma faixa de preço.

Conceitos: `NavigableSet`, `ceiling`, `lower`, `subSet`, ordenação natural via `Comparable`.

## Map

### **64. Gerenciamento e Manipulação de Estoque com Map**
📁 `exercicio_64`

- Objetivo:
Praticar a manipulação de coleções do tipo Map em Java utilizando a implementação HashMap, aplicando métodos fundamentais para inserção, consulta, verificação, remoção e iteração de elementos.

- Descrição do Problema:
Você foi encarregado de desenvolver um módulo de controle de estoque para uma loja de suprimentos de informática. Cada produto possui um identificador único (id) e uma descrição (descricao). O estoque deve mapear cada objeto do tipo Produto à sua respectiva quantidade disponível (um número inteiro).

```
p1: ID 1L, Descrição "Teclado"
p2: ID 2L, Descrição "Mouse"
p3: ID 3L, Descrição "Monitor"
p4: ID 4L, Descrição "Headset"
p5: ID 5L, Descrição "Mouse"
```

- Criação e População do Mapa:
  - Instancie um HashMap<Produto, Integer> chamado estoque.
  - Associe cada produto à sua quantidade inicial: p1 (10), p2 (25), p3 (3), p4 (8) e p5 (25).

- Consultas e Verificações:
  - Exiba a quantidade do produto p1 utilizando o método get().
  - Exiba a quantidade do produto p1 utilizando getOrDefault(), garantindo o retorno 0 caso a chave não existisse.
  - Verifique se o produto p2 está cadastrado no estoque utilizando containsKey().
  - Verifique se existe algum item com o valor de estoque igual a 25 utilizando containsValue().

- Remoção e Atualização de Tamanho:
  - Remova a entrada correspondente ao produto p5 utilizando remove() e exiba a quantidade informada no retorno do método.
  - Exiba a quantidade total de tipos de produtos no estoque utilizando size().

- Iterações:
  - Iteração por Chaves: Percorra o conjunto de chaves (keySet()) e imprima o ID e a descrição de cada produto.
  - Iteração por Valores: Percorra a coleção de valores (values()) e imprima cada uma das quantidades armazenadas.
  - Iteração por Entradas (Entry): Percorra o conjunto de pares chave-valor (entrySet()) e imprima no formato: `[ID] - [Descrição] | Quantidade: [Quantidade]`

- Limpeza e Validação:
  - Limpe todo o mapa utilizando o método clear().
  - Confirme e exiba se o mapa ficou efetivamente vazio utilizando isEmpty().

## Queue

### **65. Operações Básicas e Tratamento de Exceções com LinkedList**
📁 `exercicio_65`

Objetivo: Compreender o funcionamento FIFO (First-In, First-Out) das filas e diferenciar os métodos que lançam exceções dos métodos seguros.

Parte A (Simulador de Atendimento): Crie uma fila do tipo Queue<String> instanciada como uma LinkedList. Adicione 5 nomes de clientes utilizando o método offer(). Em seguida, remova e exiba os nomes no console, um a um, utilizando poll(), confirmando que a ordem de saída é exatamente a mesma da entrada.

Parte B (Tratamento de Fila Vazia): Com a fila completamente vazia, tente chamar os métodos remove() e element() dentro de blocos try-catch e exiba as mensagens das exceções geradas no console. Em seguida, teste os métodos seguros poll() e peek() na mesma fila vazia e imprima o resultado, confirmando o retorno null.

### **66. Manipulação de Ordenação com PriorityQueue**
📁 `exercicio_66`

Objetivo: Trabalhar com filas de prioridade, compreendendo a ordenação natural do Java e como aplicar comparadores customizados.

Modelo A (Ordenação Natural): Crie uma PriorityQueue de números decimais (Double). Insira de 5 a 10 valores de forma aleatória (fora de ordem). Após as inserções, crie um laço de repetição que remova e imprima os valores utilizando o método poll(), verificando se a saída respeita a ordem natural crescente.

Modelo B (Inversão de Prioridade): Escreva uma variação do programa anterior para alterar o comportamento da fila, forçando os elementos a saírem em ordem decrescente (maior valor sendo atendido primeiro).

### **67. Lógica Customizada e Modelagem de Mundo Real — Fila Hospitalar**
📁 `exercicio_67`

Objetivo: Aplicar os conceitos de filas na resolução de problemas práticos, modelando objetos próprios e simulando regras de negócio.

Crie uma classe Paciente com os atributos nome (String) e grauDeUrgencia (Integer), onde números maiores indicam uma urgência crítica. Faça a classe Paciente implementar a interface Comparable, definindo a regra de ordenação. Em seguida, crie uma PriorityQueue<Paciente>, adicione alguns pacientes simulados e atenda-os, confirmando que os casos mais urgentes vão para a cabeça da fila automaticamente.

### **68. Lógica Customizada e Modelagem de Mundo Real — Simulação de Supermercado**
📁 `exercicio_68`

Objetivo: Aplicar os conceitos de filas na resolução de problemas práticos, modelando objetos próprios e simulando regras de negócio.

Usando uma Queue, desenvolva um pequeno simulador de caixas de supermercado. Modele clientes chegando em intervalos de tempo específicos (você pode simular isso com um loop e variáveis de "tempo de chegada" e "tempo de atendimento"). Ao final do processamento da fila, o programa deve calcular e exibir o tempo médio que os clientes aguardaram antes de serem completamente atendidos e removidos da fila.

## Generics

### **69. Troca de Posições (Método Genérico)**
📁 `exercicio_69`

Problema: Crie um método genérico estático chamado trocarPosicoes que receba um array de qualquer tipo e dois índices (int). O método deve trocar os elementos dessas duas posições no array.

### **70. O Problema do Cast (Classe Genérica)**
📁 `exercicio_70`

Problema: Crie uma classe genérica Pilha<T> (Stack) que possua um ArrayList<T> internamente. Implemente os métodos empilhar(T elemento), T desempilhar() e boolean estaVazia().

### **71. O Problema do Cast - Ordem de Serviço**
📁 `exercicio_71`

Problema: Crie uma classe genérica Pilha<T> (Stack) que possua um ArrayList<T> internamente. Implemente os métodos empilhar(T elemento), T desempilhar() e boolean estaVazia().

Em seguida, crie uma classe Equipamento com informações como nome e descricao, e utilize uma Pilha<Equipamento> para representar uma estrutura de ordens de serviço de manutenção.

Crie um programa com menu interativo que permita:

1. Registrar um equipamento e adicioná-lo à pilha;
2. Processar o equipamento do topo da pilha utilizando desempilhar();
3. Consultar o próximo equipamento a ser processado, sem removê-lo;
4. Verificar se a pilha está vazia;
5. Encerrar o programa.

## Classes Aninhadas

### **72. Classe Interna (Inner Class) — Extrato Bancário**
📁 `exercicio_72`

Objetivo: Compreender a Inner Class (classe interna não-estática), que mantém uma referência implícita à instância externa e por isso acessa diretamente os atributos private dela.

Crie uma classe ContaBancaria com os atributos saldo e titular. Dentro dela, declare uma classe interna Extrato (sem static) com um método mostrarSaldoAtual() que imprime o saldo e o titular da conta externa. Instancie a classe interna a partir de um objeto já existente de ContaBancaria (sintaxe conta.new Extrato()) e chame o método.

Ponto de atenção: se a classe interna declarar um atributo com o mesmo nome de um atributo da classe externa (como titular), o acesso simples ao nome passa a se referir à variável da própria classe interna (shadowing). Para acessar explicitamente o atributo da classe externa nesse caso, use NomeDaClasseExterna.this.atributo.

### **73. Inner Class vs. Static Nested Class — Extrato e Cofre**
📁 `exercicio_73`

Objetivo: Comparar na prática as duas formas de classe aninhada e quando cada uma é apropriada.

Parte A (Static Nested Class): Reescreva o Extrato do exercício anterior como uma static class dentro de ContaBancaria. Como uma classe estática aninhada não tem vínculo implícito com uma instância externa, ela deve receber a conta como parâmetro no construtor (new ContaBancaria.Extrato(conta)) e guardá-la em um atributo próprio para poder ler o saldo.

Parte B (Cofre com dois tipos de classe aninhada): Crie uma classe Cofre com o atributo senhaSecreta. Declare duas classes aninhadas dentro dela: Auditor, uma Inner Class (não-estática) que acessa senhaSecreta diretamente por ter vínculo implícito com o cofre (instanciada com cofre.new Auditor()); e Fabricante, uma Static Nested Class que recebe o Cofre explicitamente pelo construtor (instanciada com new Cofre.Fabricante(cofre)). Ambas devem expor um método mostrarSenhaAtual().

Regra geral para fixar: use Inner Class quando o objeto aninhado só faz sentido atrelado a uma instância específica da classe externa; use Static Nested Class quando o objeto aninhado é conceitualmente independente e só precisa referenciar a classe externa como um colaborador comum, recebido por parâmetro.

## Streams
### **74. Filtro Rápido de Números Pares**
📁 `exercicio_74`

Objetivo: exercício de retomada rápida de Streams após uma pausa nos estudos — pipeline mínimo para reconstruir o hábito antes de avançar para pipelines mais longos.

A partir de uma List<Integer> com números variados, use stream() para filtrar apenas os números pares e colecione o resultado em uma nova lista com Collectors.toList().

### **75. Catálogo de Produtos — Streams, Collectors e Optional**
📁 `exercicio_75`

Objetivo: consolidar em um único cenário prático a maior parte da API de Streams estudada: filtragem, ordenação, distinct/limit/skip, anyMatch/allMatch/noneMatch, reduce, Optional e os principais Collectors (joining, groupingBy com downstream collectors, partitioningBy).

A partir de uma List<Produto> (atributos nome, preco, categoria), implemente em uma classe ProdutoService:

1. produtoPrecoFormatado — nomes dos produtos com preço acima de R$100, ordenados alfabeticamente e unidos em uma única String (Collectors.joining); 
2. perifericosPorPreco — nomes dos produtos de uma categoria específica, ordenados por preço crescente; 
3. contagemPorCategoria — quantidade de produtos por categoria (groupingBy + counting); 
4. precoMedioPorCategoria — preço médio por categoria (groupingBy + averagingDouble); 
5. somaPrecoPorCategoria — soma dos preços por categoria (groupingBy + summingDouble); 
6. particionarPorPreco — separa os produtos em dois grupos (acima/abaixo de um preço limite) com partitioningBy; 
7. produtoMaisCaro — retorna um Optional<Produto> com o produto de maior preço (lida com lista vazia via ifPresentOrElse); 
8. buscarPorNomeOuFalhar — busca por nome exato e lança uma exceção customizada (NoSuchElementException) via orElseThrow se não encontrar; 
9. categoriasUnicas — lista as categorias sem repetição (distinct); 
10. top3MaisCaros — os 3 produtos mais caros (sorted decrescente + limit); 
11. pularDoisMaisBaratos — a lista ordenada por preço, ignorando os dois mais baratos (skip); 
12. existeProdutoCaro — verifica se existe algum produto acima de um valor (anyMatch); 
13. todosComPrecoPositivo — verifica se todos os preços são positivos (allMatch); 
14. nenhumSemCategoria — verifica que nenhum produto está com categoria em branco (noneMatch); 
15. somarPrecosComReduce — soma total dos preços usando reduce em vez de sum().