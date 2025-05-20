/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.model;

/**
 *
 * @author Kevin
 */
public class Computador extends Equipamento{
    String processador;
    public Computador(String nome, String modelo,String processador) {
        super(nome, modelo);
         this.processador = processador;
    }
    


    @Override
    public void exibirDados(){
        System.out.println("nome = "+nome);
        System.out.println("");
   System.out.println("modelo = "+modelo);
System.out.println("");  
System.out.println("processador = "+processador);
    }
}
