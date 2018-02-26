#include <stdio.h>

void eliminarZeros (char *iValue) {
    char *p = 0;
    for(p = iValue; *p; ++p ) {
        if('.' == *p) {
            while(*++p);
                while('0'==*--p) *p = '\0';
                    if(*p == '.') *p = '\0';
                        break;
        } //end se
    } //end repeticao
} //end eliminarZeros()

void saveFile(int n, FILE *fPointer) {

    fPointer = fopen("in.txt", "wb"); //"wb" cria um arquivo bin para escrita
    float aux;
    int i;

    //verificar se o arquivo e' valido
    if( fPointer == NULL ) {
        printf("ERROR: File is not found. ");
    } //end se
    else {
        for(i = 0; i < n; i++) {
            scanf("%f", &aux);
            fwrite(&aux, sizeof(float), 1, fPointer); //escrever no arquivo
        } //end repeticao
    } //end else
    fclose(fPointer);
} //end saveFile()

void readFile(int n, FILE *fPointer) {

    fPointer = fopen("in.txt", "rb"); //"rb" abre arquivo binario para leitura
    float aux;
    int i; 
    char answer [100];
    //verificar se o arquivo e' valido
    if(fPointer == NULL) {
        printf("ERROR: File is not found. ");
    } //end se
    else {
        for(i = (n-1); i >= 0; i--) {   			        
		fseek(fPointer, i*(sizeof(float)), SEEK_SET); 
                fread(&aux, sizeof(float), 1, fPointer);
                sprintf(answer, "%.3f", aux);
                eliminarZeros(answer);
                printf("%s \n", answer);
        } //end repeticao
    } //end else
    fclose(fPointer);
} //end readFile()

int main() {

    FILE *fPointer;
    int n;

    scanf("%d", &n);
    saveFile(n, fPointer);
    readFile(n, fPointer);

    return (0);
} //end main()
