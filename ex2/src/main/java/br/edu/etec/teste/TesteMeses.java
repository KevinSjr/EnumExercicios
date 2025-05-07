/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.teste;

/**
 *
 * @author Kevin
 */
import br.edu.etec.model.Meses;
import java.util.Scanner;
        
public class TesteMeses {
    public static void main(String[] args) { 
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite um numero de 1 a 12 ");
      
      int mes = scanner.nextInt();
      
     switch(mes){
         case 1:
             System.out.println(Meses.JANEIRO);
             break;
         case 2:
             System.out.println(Meses.FEVEREIRO);
               break;
         case 3:
             System.out.println(Meses.MARCO);
               break;
         case 4:
             System.out.println(Meses.ABRIL);
               break;
         case 5: 
             System.out.println(Meses.MAIO);
               break;
         case 6:
             System.out.println(Meses.JUNHO);
               break;
         case 7:
             System.out.println(Meses.JULHO);
               break;
         case 8:
             System.out.println(Meses.AGOSTO);
                break;
         case 9:
             System.out.println(Meses.SETEMBRO);
                break;
         case 10:
             System.out.println(Meses.OUTUBRO);
                break;
         case 11:
             System.out.println(Meses.NOVEMBRO);
                break;
         case 12:
             System.out.println(Meses.DEZEMBRO);
                break;
     }
              
}
}
