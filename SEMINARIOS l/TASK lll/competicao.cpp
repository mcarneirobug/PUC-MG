#include<stdio.h>

int main( ){
    char r [15], s [15];
    scanf("%s", r);
    scanf("%s", s);
    int i, tam;
    int vit1 = 0, emp1 = 0, gol1 = 0, pnt1 = 0;
    int vit2 = 0, emp2 = 0, gol2 = 0, pnt2 = 0;
    scanf("%d", &tam);
    int res1 [tam][2], res2[tam][2];

    for(i = 0; i < tam; i = i + 1){
        scanf("%dx%d", &res1[i][0], &res1[i][1]);
        if(res1[i][0] > res1[i][1]){
            vit1 = vit1 + 1;
        }
        else{
            if(res1[i][0] == res1[i][1]){
            emp1 = emp1 + 1;
            }
        }
        gol1 = gol1 + res1[i][0];
        pnt1 = emp1 + (vit1*3);
    }

    for(i = 0; i < tam; i = i + 1){
        scanf("%dx%d", &res2[i][0], &res2[i][1]);
        if(res2[i][0] > res2[i][1]){
            vit2 = vit2 + 1;
        }
        else{
            if(res2[i][0] == res2[i][1]){
            emp2 = emp2 + 1;
            }
        }
        gol2 = gol2 + res2[i][0];
        pnt2 = emp2 + (vit2*3);
    }

    if(vit1 > vit2){
        printf("%s VENCEU MAIS: %d\n", r, vit1);
    }
    else{
        printf("%s VENCEU MAIS: %d\n", s, vit2);
    }

    if(gol1 > gol2){
        printf("%s FEZ MAIS GOLS: %d\n", r, gol1);
    }
    else{
        printf("%s FEZ MAIS GOLS: %d\n", s, gol2);
    }

    if(pnt1 > pnt2){
        printf("%s FEZ MAIS PONTOS: %d", r, pnt1);
    }
    else{
        printf("%s FEZ MAIS PONTOS: %d", s, pnt2);
    }

    return 0;
}
