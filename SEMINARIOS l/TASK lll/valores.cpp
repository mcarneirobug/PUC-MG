#include <stdio.h>

int main( ){
   int TAM, i;
   TAM = 9;
   int conversor;
   int menor;
   double media;
   double soma=0;
   int impares = 0;
   scanf("%d", &TAM);
   float vetor[TAM];

   for(i = 0; i < TAM; i++)
   {
      scanf("%f", &vetor[i]);
      soma = soma + vetor[i];

      if(i %2 != 0)
      {
         impares++;
      }
   }

   menor = vetor[0];
   for(i = 0; i < TAM; i++)
   {
      if(vetor[i] < menor)
      {
         menor = vetor[i];
      }
   }

   media = soma/TAM;
   conversor = (int) soma;
   printf("%d\n%d \n%f  \n%d", conversor, menor, media, impares);
   return 0;
}
