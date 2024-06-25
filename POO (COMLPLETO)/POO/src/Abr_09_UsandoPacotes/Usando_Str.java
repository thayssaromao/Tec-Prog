package Abr_09_UsandoPacotes;

import MeuPacote.Str;

public class Usando_Str {
    
  public static void main(String[] args) {
    System.out.println("Y " + (Str.ehAlfabetico('Y')?"é alfabético":"não é alfabético"));
    System.out.println("* " + (Str.ehAlfabetico('*')?"é alfabético":"não é alfabético"));
    System.out.println("0 " + (Str.ehAlfabetico('0')?"é alfabético":"não é alfabético"));
    System.out.println("a " + (Str.ehAlfabetico('a')?"é alfabético":"não é alfabético"));
    
    System.out.println(Str.repetir());
    System.out.println(Str.repetir('.'));
    System.out.println(Str.repetir('X', 30));
    System.out.println(Str.repetir("X", 30));
    
    System.out.println("i " + (Str.ehVogal('i')?"é vogal":"não é vogal"));
    System.out.println("O " + (Str.ehVogal('O')?"é vogal":"não é vogal"));
    System.out.println("z " + (Str.ehVogal('z')?"é vogal":"não é vogal"));
    
    System.out.println(Str.repetir());
    System.out.println(Str.repetir('@'));
    System.out.println(Str.repetir('#', 50));
    System.out.println(Str.repetir("ABC", 20));
    
    System.out.println("O " + (Str.ehConsoante('O')?"é consoante":"não é consoante"));
    System.out.println("p " + (Str.ehConsoante('p')?"é consoante":"não é consoante"));
    System.out.println("7 " + (Str.ehConsoante('7')?"é consoante":"não é consoante"));
    
    System.out.println("[" + Str.center("UTFPR", 30, ' ') + "]");
    System.out.println("[" + Str.center("UTFPR", 31, '.') + "]");
  }
    
}
