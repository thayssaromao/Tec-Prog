#ifndef IMC_H_INCLUDED
#define IMC_H_INCLUDED

typedef struct dados{
 float peso;
 float altura;

}dados;


dados entrada(){
    dados resultado;

    printf("Altura > ");
    scanf("%f", &resultado.altura);

    printf("Peso > ");
    scanf("%f", &resultado.peso);

    return resultado;
}

// calcula o imc da variavel tipo struct dados e RETORNA um valor tipo float
float calculoIMC(dados paciente){
    return (paciente.peso / (paciente.altura * paciente.altura));
}

char* classificaIMC(dados paciente){
    float vlrIMC = calculoIMC(paciente);

    if(vlrIMC < 18.5)
        return("Magresa");
    else if(vlrIMC < 25.0)
        return("Normal");  
      else if(vlrIMC < 30)
          return("Sobre peso");
        else if(vlrIMC < 40)  
             return("Obesidade");
            else
               return("Obesidade Grave"); 
}

char* printString(dados paciente){
  char* resultado =(char *)malloc(250);
  sprintf(resultado, "Peso Corporal > %.2f\n"
                      "Altura > %.2f\n"
                      "Imc > %.2f (%s)\n",
                      paciente.peso, paciente.altura, calculoIMC(paciente), classificaIMC(paciente));

  return resultado;
}

#endif