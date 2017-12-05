#include <stdio.h>

int main ( )
{

int notas [0];
notas [0] = 0.0;
char aluno [100];
int count  = 0;
int count2 = 0;
int n = 0;
int n1 = 0;
float p = 0;

   scanf("%d", &n);

   for(int i = 0; i < n; i++)
   {
        scanf("%s %d", aluno, &n1);

        if(n1 >= 60)
        {
           count = count + 1;
           printf("%s %s", aluno, "APROVADO\n");
        } //end 
        else
        {
           count2 = count2 + 1;
           printf("%s %s", aluno, "REPROVADO\n");
         } //end se
   } //end repetir
     p = ((float) count / n)*100;
       printf("%d %s", count, "APROVADOS\n");
        printf("%d %s", count2, "REPROVADOS\n");
        printf("%.0f%s", p,"%\n");

return (0);
} //end main()
