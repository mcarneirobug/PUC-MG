#include <stdio.h>
#include <string.h>

int main()
{
    char aluno[100];
    char bestAluno[100];
    int  bestNota = 0;
    int i, n1, n2, n3, n4, n;
    float notas [4];

    scanf("%d", &n);
    notas[0] = 0.0;
    notas[1] = 0.0;
    notas[2] = 0.0;
    notas[3] = 0.0;

    for(i = 1; i <= n; i++)
    {
        scanf("%s %d %d %d %d", aluno, &n1, &n2, &n3, &n4);

	notas[0] += n1;
        notas[1] += n2;
        notas[2] += n3;
        notas[3] += n4;

	if(n1 + n2 + n3 + n4 > bestNota)
        {
	   bestNota = (n1 + n2 + n3 + n4);
           strcpy(bestAluno, aluno);
	} //end 
    } //end repetir
       
	notas[0] = notas[0]/n;
        notas[1] = notas[1]/n;
        notas[2] = notas[2]/n;
        notas[3] = notas[3]/n;
   	
    printf("PROVA 1 %.2lf\n",notas[0]);
    printf("PROVA 2 %.2lf\n", notas[1]);
    printf("PROVA 3 %.2lf\n", notas[2]);
    printf("PROVA 4 %.2lf\n", notas[3]);
    printf("%s %d\n", bestAluno, bestNota);
    
      return(0);
}

