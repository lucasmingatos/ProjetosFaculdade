/* Crie um programa em C, com base no exerc�cio anterior e, ao inv�s de inicializar o vetor,
solicitar ao usu�rio para informar os 5 n�meros desejados. Imprimir cada um desses valores
na ordem em que s�o declarados, e tamb�m na ordem contr�ria.
7 3 8 1 6
6 1 8 3 7 */


#include <stdlib.h>
#include <stdio.h>

int i=0, numero[5];

main()
{
	for(i=0; i<=4; i++)
	{
	printf("informe o numero %i: ", i+1);
	scanf("%i", &numero[i]);
	}
	printf("a ordem dos numeros informados e: ");
	for(i=0; i<=4; i++)
	{
	printf("%i ", numero[i]);
	}
	printf("\na ordem contraria dos numeros informados e: ");
	for(i=4; i>=0; i--)
	{
	printf("%i ", numero[i]);
	}
	system("pause");

}

