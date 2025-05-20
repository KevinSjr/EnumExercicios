/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.test;

/**
 *
 * @author Kevin
 */
import br.edu.etec.model.Animal;
import br.edu.etec.model.Arara;
import br.edu.etec.model.Golfinho;
import br.edu.etec.model.Leao;


public class TesteZoologico {
    public static void main(String[] args) {
        Animal leao1 = new Leao("leao", 5);
        Animal golfinho1 = new Golfinho("golfinho", 8);
        Animal arara1 = new Arara("arara", 3);
    
        leao1.emitirSom();
        leao1.exibirInfo();
        System.out.println("");
        golfinho1.emitirSom();
        golfinho1.exibirInfo();
         System.out.println("");
         arara1.emitirSom();
         arara1.exibirInfo();
    }}