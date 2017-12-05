#include <stdio.h>

int main()
{
    //definir dados
    char aluno [100];
    int i;
    int n1;
    int n2;
    int n3;
    int n4;
    int qtdAl;
    int soma;

    // ler a quantidade de alunos
    scanf("%d", &qtdAl);

    for ( i = 1 ; i <= qtdAl; i++ )
    {
    	//printf("Entre com o nome do aluno: ");
    	scanf("%s %d %d %d %d", aluno, &n1, &n2, &n3, &n4);

	soma  = (n1 + n2 + n3 + n4);
        printf("%s ", aluno);
	printf("%d\n", soma);
    } //end repetir
	  return(0);
} //end main( )

