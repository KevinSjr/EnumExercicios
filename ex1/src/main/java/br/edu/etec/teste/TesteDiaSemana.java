/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.teste;

/**
 *
 * @author Kevin
 */
import br.edu.etec.model.DiaSemana;
import java.util.Scanner;

public class TesteDiaSemana {
      public static void main(String[] args) { 
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite um numero de 1 a 7 ");
      
      int diaSemana = scanner.nextInt();
      
     switch(diaSemana){
         case 1:
             System.out.println(DiaSemana.SEGUNDA);
             break;
         case 2:
             System.out.println(DiaSemana.TERCA);
               break;
         case 3:
             System.out.println(DiaSemana.QUARTA);
               break;
         case 4:
             System.out.println(DiaSemana.QUINTA);
               break;
         case 5: 
             System.out.println(DiaSemana.SEXTA);
               break;
         case 6:
             System.out.println(DiaSemana.SABADO);
               break;
         case 7:
             System.out.println(DiaSemana.DOMINGO);
               break;
     }
              
}
}
