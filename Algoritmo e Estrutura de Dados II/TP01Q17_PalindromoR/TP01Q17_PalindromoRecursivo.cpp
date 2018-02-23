#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#define TAM 1000
     
     /* Funcao recursiva para verificar se a cadeia e' um palindromo 
      * varia ate a metade assim verificando as duas partes. 	
      */

     int isPalindromo( char str[TAM], int i, int tam ) {
        bool answer = 0;
        int size = strlen( str ) - 1;
        if( i < size/2 ) //verifica ate a metade da cadeia
        {
            if( str[i] == str[tam - 1] ) {
	        answer = isPalindromo( str, i+1, tam-1); 
            } //end se
            else {
  	       answer = 0;
            } //end else
        } //end se
        else {
	  answer = 1;
        } //end se
        return ( answer );
     } //end isPalindromo()

/* Metodo recursivo para ser executado no main */
     int executar(char str[1000]) {
  	bool equals = true;
        bool answer = false; 
        equals = (strcmp(str, "FIM\n") != 0);
        if( equals != false ) { 
	   if(strcmp(str, "FIM\n") != 0) {
	       	  answer = isPalindromo( str, 0, strlen(str) -1 );
		  fgets(str, TAM, stdin);
		  if( answer == true ) {
		     printf("SIM\n");
	          } else {
		     printf("NAO\n");
	      } //end se
		 executar( str );	
	   } //end se
	} //end se
    } //end executar
 
     int main() {
	char str [1000];
	fgets(str, TAM, stdin);
        executar( str );
        return (0);
     } //end main()

