#ifndef MEUMATH_H_INCLUDED
#define MEUMATH_H_INCLUDED
#include<stdio.h>
#include<stdlib.h>
typedef struct{
  int a;
  int b;

}dados;


dados entrada();
int soma(dados x);
int subtracao(dados x);
int mult(dados x);
int divInteiro(dados x);
float divReal(dados x);
char *toString(dados x);
//programaçao estruturadas -> dados + operações
//p.o.o -> atributos + métodos



#endif