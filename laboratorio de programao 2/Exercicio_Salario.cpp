/* Implemetar um programa para receber o sal�rio de 10 colaboradores e verificar quais sal�rios s�o maiores que a m�dia dos sal�rios */

#include <stdio.h>
#include <stdlib.h>

float salario[10], soma=0, media;
int i;

main()
{
	for(i=0; i<10; i++)
	{
		printf("Informe o %i salario: ", i+1);
		scanf("%f", & salario[i]);
		soma += salario[i];
			
	}
	media= soma/10;
	printf("A media dos salarios e %.2f: ", media);
	for(i=0; i<10; i++)
	{
		if(salario[i]>media)
			printf("\nSalario: %.2f", salario[i]);
	}
	system("pause");
}
