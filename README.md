# atividades-poo
Esse repositório contém os exercícios resolvidos das aulas de Programação Orientada a Objetos, seções 8 e 9, contidos nas aulas do professor Nelio Alves na plataforma Udemy.

## Seção 8
### - Exercício 1 -

Fazer um programa para ler os valores da largura e altura 
de um retângulo. Em seguida, mostrar na tela o valor de 
sua área, perímetro e diagonal. Usar uma classe como 
mostrado no projeto ao lado.
<br><br>**Exemplo:**

	Enter rectangle width and height:
	3.00
	4.00
	AREA = 12.00
	PERIMETER = 14.00
	DIAGONAL = 5.00

Scripts utilizados:
<br>
<br>**Application**<br>
[RectangleMain](https://github.com/NMSilos/atividades-poo-java/blob/main/src/application/RectangleMain.java)

**Entities**<br>
[Rectangle](https://github.com/NMSilos/atividades-poo-java/blob/main/src/entities/Rectangle.java)


### - Exercício 2 -

Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
projetada abaixo.
<br><br>**Exemplo:**

	Entrada:
	Name: Joao Silva
	Gross salary: 6000.00
	Tax: 1000.00

 	Saída:
	Employee: Joao Silva, $ 5000.00

  	Entrada:
	Which percentage to increase salary? 10.0

 	Saída:
	Updated data: Joao Silva, $ 5600.00

Scripts utilizados:
<br>
<br>**Application**<br>
[EmployeeMain](https://github.com/NMSilos/atividades-poo-java/blob/main/src/application/EmployeeMain.java)

**Entities**<br>
[Employee](https://github.com/NMSilos/atividades-poo-java/blob/main/src/entities/Employee.java)


### - Exercício 3 -

Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
resolver este problema.
<br><br>**Exemplo:**

	Entrada:		Saída:
	Alex Green		FINAL GRADE = 90.00
	27.00			PASS
	31.00
	32.00

	Entrada:		Saída:
	Alex Green		FINAL GRADE = 52.00
 	17.00			FAILED
	20.00			MISSING 8.00 POINTS
	15.00

Scripts utilizados:
<br>
<br>**Application**<br>
[StudentMain](https://github.com/NMSilos/atividades-poo-java/blob/main/src/application/StudentMain.java)

**Entities**<br>
[Student](https://github.com/NMSilos/atividades-poo-java/blob/main/src/entities/Student.java)


### - Exercício 4 -

Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por 
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda 
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
<br><br>**Exemplo:**

 	Entrada:
	What is the dollar price? 3.10
	How many dollars will be bought? 200.00

 	Saída:
 	Amount to be paid in reais = 657.20

Scripts utilizados:
<br>
<br>**Application**<br>
[CurrencyConverterMain](https://github.com/NMSilos/atividades-poo-java/blob/main/src/application/CurrencyConverterMain.java)

**Entities**<br>
[CurrencyConverter](https://github.com/NMSilos/atividades-poo-java/blob/main/src/entities/CurrencyConverter.java)


### - Exercício 5 -

Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do 
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito 
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua 
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.<br><br>
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já 
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por 
exemplo).<br><br>
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger 
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque 
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for 
suficiente para realizar o saque e/ou pagar a taxa.<br><br>
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não 
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre 
mostrando os dados da conta após cada operação. 
<br><br>**Exemplo:**

 	Entrada:
	Enter account number: 8532
	Enter account holder: Alex Green
	Is there an initial deposit (y/n)? y
	Enter initial deposit value: 500.00

  	Saída:
	Account data:
	Account 8532, Holder: Alex Green, Balance: $ 500.00
		
 	Enter a deposit value: 200.00

 	Saída:
 	Updated account data:
	Account 8532, Holder: Alex Green, Balance: $ 700.00 
	
 	Enter a withdraw value: 300.00

 	Saída:
 	Updated account data:
	Account 8532, Holder: Alex Green, Balance: $ 395.00

Scripts utilizados:
<br>
<br>**Application**<br>
[BankAccountMain](https://github.com/NMSilos/atividades-poo-java/blob/main/src/application/BankAccountMain.java)

**Entities**<br>
[BankAccount](https://github.com/NMSilos/atividades-poo-java/blob/main/src/entities/BankAccount.java)
