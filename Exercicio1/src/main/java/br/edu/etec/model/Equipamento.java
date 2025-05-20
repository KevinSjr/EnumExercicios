/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.model;

/**
 *
 * @author Kevin
 */
public class Equipamento {
    String nome;
    String modelo;
    
   public Equipamento(String nome, String modelo){
     this.nome = nome;
  this.modelo = modelo;
    }
   
  public void exibirDados(){
   System.out.println("nome = "+nome);
   System.out.println("");
   System.out.println("modelo = "+modelo);
   }
}
