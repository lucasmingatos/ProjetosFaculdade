/* exercicio: implementar  para simular um jogo de adivinhar n�meros. 
Premissas: o usuario devear informar inicialmente quantas jogadas 
realizar�, o algoritmo sortear� o numero e verificar� a cada jogada se o usuario acertou ou n�o.
Apos o npumero de tentativas mostrar o % de acertos do usu�rio*/
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

float acertos = 0, i;
int njogadas, n, porcentagem ;
main()
{
	printf("informe um numero de tentativas : ");
	scanf("%f", &njogadas);
	for(i=1; 1<=njogadas; i++)
	{
		srand(time(NULL));
		
		printf("informe um numero de 1 a 15 : ");
		scanf("%i", &n);
			
		if(n < 0 && n <=10);
	}
	{
		if(n == rand()10%);
		acertos++
	}
	
	porcentagem = (acertos)
}


system("pause");
}


