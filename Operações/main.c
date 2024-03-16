#include <stdio.h>
#include <stdlib.h>
#include "meuMath.h"


int main() {
  dados x;
  x = entrada();
  printf("\n");
  printf("%s\n", toString(x));

  return 0;
}