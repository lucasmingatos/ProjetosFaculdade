/*implementar um algoritmo para receber 5 sal�rios e
mostrar qual o valor do maior salario*/

//declarar as bibliotecas

#include <stdio.h>
#include <stdlib.h>

//declarar variaveis 

int i;
float salario, maior=0;

main()
{
	//entrada de dados
	for(i=1; i<=5; i++)
	{
		printf("\nInforme o %i salario  ", i);
		scanf("%f", &salario);
		
		//testar se o sal�rio � maior
		
		if(salario > maior)
			maior=salario;
	}
	
	//sa�da de dados - mostrar o maior
	printf("\nMaior salario = R$ %2f", maior);
	system("pause");
}	
