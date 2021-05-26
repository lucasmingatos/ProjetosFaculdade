//Lucas Sant'Ana Mingatos - c�digo 826274
//Segmento de mercado - esportes coletivos

/*
    *grava��o de um v�deo apresentando o software funcionando corretamente
    *coment�rios objetivos para ajudar no entendimento do c�digo
    *manter prints de teste dentro do c�digo para provar o funcionamento correto

    1 - inser��o arvore n�o balanceada, n�o permitir elementos duplicados
    2 - inser��o arvore AVL balanceada, n�o permitir elementos duplicados
    3 - impress�o espec�fica, ordem crescente e decrescente, avisar caso a arvore esteja vazia
    4 - ajuda, explicando as fun��es dispon�veis
*/


#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <windows.h>


typedef struct Arvore{
	int numero;
	char nome_esporte[20];
	struct arvore *esquerda, *direita;
}arvore ;


int op;
int numero;
int pesquisado;


//criando o no e definindo esquerda e direita como null
struct Arvore *criarNo(int num){


	struct Arvore *novo = (arvore *)malloc(sizeof(arvore));

	// if, caso o malloc n�o seja feito
	if(!novo){
		printf("mem�ria cheia");
	} else{
	    //preenchendo o campo nome_esporte na struct
        printf(" INSIRA O NOME DO ESPORTE COLETIVO PR�TICADO PELO ATLETA DE C�DIGO %i: ", num);
        scanf(" %s", novo->nome_esporte);
	    printf("\n definindo as propriedades do novo n� e inserindo na �rvore...\n");
        //Sleep(1000);
        //definindo esquerda e direita como NULL
        novo->numero = num;
        novo->esquerda = NULL;
        novo->direita = NULL;

        printf("\n check para saber quando a defini��o de esquerda e direita NULL foi finalizada, tecle ok para limpar a tela\n\n\n\n ");
        system("pause");
        //system("cls");
        //retorna novo para o programa continuar sua execu��o
        return novo;
	}
}

//inserir numero na arvore
struct Arvore* inserir(struct Arvore* no, int num){

	if(no == NULL){
		return criarNo(num);
	}

	if(num <= no->numero){
		no->esquerda = inserir(no->esquerda,num);
	}

	if(num >= no->numero){
		no->direita = inserir(no->direita,num);
	}

	return no;

	printf("\n check para saber se a fun��o de INSERIR N� foi acessada \n\n ");
}

//imprimindo em ordem crescente
void emOrdem(struct Arvore* raiz){
	if(raiz != NULL){
		emOrdem(raiz->esquerda);
		printf("\n %i\n", raiz->numero);
		printf("\n %s\n", raiz->nome_esporte);
		emOrdem(raiz->direita);
	}
}

//imprimindo em ordem decrescente
void emDecres(struct Arvore* raiz){
	if(raiz != NULL){
		emDecres(raiz->direita);
		printf("\n %i\n", raiz->numero);
		emDecres(raiz->esquerda);
	}
}

//pesquisar n� na �rvore
struct Arvore* pesquisarNo(struct Arvore *raiz, int num)
{
    //if que checa se o n�mero � existente na �rvore
    if(raiz == NULL || raiz->numero == num) {
		printf("\n O ESPORTISTA DE C�DIGO %i PRATICA %s\n", raiz->numero, raiz->nome_esporte);
		return raiz;
		system("pause");
	}

    //if para percorrer as sub-arvores da direita e esquerda de cada um dos n�s
    if(raiz->numero < num){
        pesquisarNo(raiz->direita, num);
    	pesquisarNo(raiz->esquerda, num);
    }

    //if para informar que o n�mero n�o foi encontrado na �rvore
    if(raiz->numero != num){
        printf("C�DIGO DO ESPORTISTA INSERIDO � INEXISTENTE");
    }

}

struct Arvore* checarDuplicidade(struct Arvore *raiz, int num){

};


// MENU
int main (void){
	struct Arvore *raiz = NULL; //definindo a ra�z como nula
	setlocale(LC_ALL, "Portuguese"); //utilizando a biblioteca locale.h para utilizar acentos nos menus do programa
	do{

		printf(
           "\n ALGORITMO DE �RVORE BIN�RIA E �RVORE AVL BALANCEADA - LUCAS SANT'ANA MINGATOS C�DIGO: 826274 \n"
           "\n 1 - CADASTRAR NOVO ESPORTISTA EM �RVORE BIN�RIA N�O-BALANCEADA"
           "\n 2 - CADASTRAR NOVO ESPORTISTA EM �RVORE BIN�RIA BALANCEADA"
		   "\n 3 - IMPRIMIR �RVORE EM ORDEM CRESCENTE DOS ESPORTISTAS"
		   "\n 4 - IMPRIMIR �RVORE EM ORDEM DECRESCENTE DOS ESPORTISTAS"
		   "\n 5 - PESQUISAR C�DIGO DO ESPORTISTA"
		   "\n 6 - AJUDA"
		   "\n\n DIGITE SUA OP��O: ");
		scanf("%d", &op);

		switch(op){

			case 1:
				if(raiz !=  NULL){
					printf("\n INSIRA O NOVO N�: ");
					scanf(" %d", &numero);
					//checarDuplicidade(raiz, numero);
					inserir(raiz,numero);
					system("cls");
					break;
				}
				if(raiz == NULL){
					printf("\n INSIRA O NOVO N� RA�Z: ");
					scanf(" %d", &numero);
					raiz = inserir(raiz,numero);
					system("cls");
					break;
				}

            case 2:
                /*if(raiz !=  NULL){
					printf("\n INSIRA O NOVO N�: ");
					scanf(" %d", &numero);
					//checarDuplicidade(raiz, numero);
					inserirAVL(raiz,numero);
					system("cls");
					break;
				}
				if(raiz == NULL){
					printf("\n INSIRA O NOVO N� RA�Z: ");
					scanf(" %d", &numero);
					raiz = inserirAVL(raiz,numero);
					system("cls");
					break;
				}*/

			case 3:
			    system("cls");

			    if(raiz == NULL){
                    printf(" �RVORE V�ZIA\n\n");
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }

			    if(raiz != NULL){
                    printf(" IMPRESS�O EM ORDEM CRESCENTE DOS ESPORTISTAS\n\n");
                    emOrdem(raiz);
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }

				break;

			case 4:
			    system("cls");

			    if(raiz == NULL){
                    printf(" �RVORE V�ZIA\n\n");
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }

			    if(raiz != NULL){
                    printf(" IMPRESS�O EM ORDEM DECRESCENTE DOS ESPORTISTAS\n\n");
                    emDecres(raiz);
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }

            case 5:
			    system("cls");

			    if(raiz == NULL){
                    printf(" �RVORE V�ZIA\n\n");
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }

			    if(raiz != NULL){
                    printf(" PESQUISA DE CADASTRO DO ESPORTISTA DE C�DIGO: ");
                    scanf(" %d", &numero);
                    pesquisarNo(raiz, numero);
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }
				break;

            case 6:
                system("cls");
                printf(" MENU DE AJUDA\n\n");
                printf("O software funciona de maneira simples, na op��o 1 ser�o solicitados dadospara o armazenamento em uma �rvore\nbin�ria n�o-balanceada.\n");
                printf("Na op��o 2 os dados solicitados ir�o ser inseridos em uma �rvore bin�ria\nbalanceada.");
                printf("\nAs op��es 3 e 4 imprimem os cadastros armazenados em ordem crescente e decrescente de acordo com o c�digo");
                printf("\nPor fim, a ultima op��o do menu o usu�rio localiza um esportista espec�fico dentro da �rvore.\n");
                printf(" \n");
                system("\n\n\npause");
                system("cls");

                break;
			default:
			    system("cls");
                printf(" OP��O INVALIDA\n\n");
                printf(" \n");
                system("\n\n\npause");
                system("cls");
                break;
		}
	}while(op);
}






