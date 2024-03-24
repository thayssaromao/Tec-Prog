#include <stdio.h>
#include <stdlib.h>

#include "IMC.h"

int main(){
    dados paciente; //paciente é uma variavél do tipo struct

    printf("Programa - Calculo de IMC");
    printf("\n");
    paciente = entrada();
    printf("\n");
    printf("%s", printString(paciente));
    return 0;
}