#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define TAM 1000
#include<stdbool.h>

 int isPalindromo( char str[TAM] ) {

   bool answer  = 0;
  int  tamanho = strlen( str ) -1;
   int i = 0;
   /* repeticao responsavel em verificar se a string e' palindromo
    * compara o caractere na primeira posicao com o ultimo caractere */
   
   while( i < tamanho && str[i] == str[tamanho-1]) { //desconsidera o '\0'
          i++;
          tamanho = tamanho - 1;
   } //end repeticao
          if( i >= tamanho ) { //condicao de parada 
	     answer = 1;
           } //end se
      return ( answer );
 } //end isPalindromo()

    int main() {
    char cadeia[1000];
    bool answer = false;
    while( strcmp(cadeia, "FIM\n" ) != 0)
    {
         fgets(cadeia,TAM, stdin); 
         if ( strcmp(cadeia, "FIM\n" ) != 0) {
             answer = isPalindromo( cadeia );
	     if( answer == true ) {
	        printf("SIM\n");
             } else {
               printf("NAO\n");
          } //end else
      } //end se
   } //end repeticao
    return (0);
} //end main()
