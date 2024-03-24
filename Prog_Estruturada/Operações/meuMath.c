#include "meuMath.h"
#include<stdio.h>
#include<stdlib.h>

char *toString(dados x){
  char *result = (char *)malloc(250);
  sprintf(result, "Sendo a = %d e b = %d, tem se: \nsoma = %d\nsubtracao = %d\nmultiplicacao= %d\ndivisao inteira = %d\ndivisao real = %.2f\n\n", x.a,x.b,soma(x),subtracao(x),mult(x),divInteiro(x), divReal(x) );
  return(result);
}
dados entrada(){
  dados result;
  printf("a: ");
  scanf("%d", &result.a);

  printf("b: ");
  scanf("%d", &result.b);
  return result;
}
int soma(dados x){
  return (x.a + x.b);
}
int subtracao(dados x){
  return (x.a - x.b);
}
int mult(dados x){
  return (x.a * x.b);
}
int divInteiro(dados x){
  return (x.a /x.b);
}
float divReal(dados x){
  return (float)(x.a / (float)x.b);
}
//programação estruturada