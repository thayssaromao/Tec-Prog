#ifndef MEUPONTO_H_INCLUDED
#define MEUPONTO_H_INCLUDED
#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int x;
    int y;
}ponto;

ponto entrada();
char *posicao(ponto meuPonto);
char *toString(ponto meuPonto);


#endif