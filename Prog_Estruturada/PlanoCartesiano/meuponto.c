#include "meuponto.h"


ponto entrada() {
    ponto meuPonto;

    printf("x: ");
    scanf("%d", &meuPonto.x);

    printf("y: ");
    scanf("%d", &meuPonto.y);

    return(meuPonto);
}

char *posicao(ponto meuPonto){
    if((meuPonto.x > 0) && (meuPonto.y > 0))
        return ("Q1");
    else if ((meuPonto.x < 0) && (meuPonto.y > 0))
        return ("Q2");
    else if ((meuPonto.x < 0) && (meuPonto.y < 0))
        return ("Q3");
    else if ((meuPonto.x > 0) && (meuPonto.y < 0))
        return ("Q4");
    else if ((meuPonto.x == 0) && (meuPonto.y != 0))
        return ("Eixo Y");
    else if ((meuPonto.x != 0) && (meuPonto.y == 0))
        return ("Eixo x");
    else return ("Origem");
 }

 char *toString(ponto meuPonto) {
   char *string = (char *)malloc(100);
   sprintf(string, "(%d, %d) %s\n", meuPonto.x, meuPonto.y, posicao(meuPonto));
  return string;
 }
