#include <stdlib.h>
#include <stdio.h>
int main( )
{
   int vitorias, empates, derrotas, golsFeitos, golsLevados;

   int  contadorVIT = 0;
   int  contadorDER = 0;
   int  contadorEMP = 0;
   int  contadorGolsMarcados = 0;
   int  contadorGolsSofridos = 0;
   int  contadorResultadoFinal = 0;

   int contadorGolsSOFR = 0;
   int contadorGolsMARC = 0;
   char resultado[4];

   int TAM = 14;
   scanf("%d", &TAM);

   for(int i = 0; i < TAM; i++)
   {
      scanf("%s", resultado);
      int a;
      a = (int)atoi(resultado);
      int b;
      b = (int)atoi(resultado+2);

      if(a > b)
      {
            //vitoria
         contadorVIT = contadorVIT + 1;
         contadorGolsMarcados = contadorGolsMarcados + a;
         contadorGolsSofridos = contadorGolsSofridos + b;
         contadorResultadoFinal += 3;
      } //end else if
      else
      {
      if(a < b)
      {
                 //derrota
         contadorDER = contadorDER + 1;
         contadorGolsMarcados = contadorGolsMarcados + a;
         contadorGolsSofridos = contadorGolsSofridos + b;
      } //end se
      else
      {
         contadorEMP = contadorEMP + 1;
         contadorGolsMarcados = contadorGolsMarcados + a;
         contadorGolsSofridos = contadorGolsSofridos + b;
         contadorResultadoFinal += 1;
      } //end se
} //end else
   } //end for
   contadorGolsMARC = contadorGolsMarcados;
   contadorGolsSOFR = contadorGolsSofridos;
   printf("VIT: %d\nEMP: %d\nDER: %d\nGOLS MARC: %d\nGOLS SOFR: %d\n%d PONTOS\n ", contadorVIT, contadorEMP, contadorDER,
         contadorGolsMARC, contadorGolsSOFR, contadorResultadoFinal);

   return 0;
}

