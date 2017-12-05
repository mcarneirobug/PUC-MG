#include <stdio.h>
#include <algorithm>

using namespace std;

int main( ) {

	// definir dados
	int n;
	int x_1;
	int y_1;
	int x_2;
	int y_2;

	// ler do teclado as variaveis
	scanf("%d %d %d %d %d", &n, &x_1, &y_1, &x_2, &y_2);

	//verificar se o tabuleiro e' divisível na horizontal ou na vertical
	if((min(x_1,x_2) <= n/2 and max( x_1,x_2 ) > n/2 ) or
	   (min(y_1,y_2) <= n/2 and max( y_1, y_2 ) > n/2 ))
	   {
		printf("S\n");
	   } //end if
	   else
	   {
 		printf("N\n");
	   } //end se

	//como e' uma funcao int retornar 0
	return 0;
} //end main( )

