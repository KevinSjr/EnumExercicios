/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.model;

/**
 *
 * @author Kevin
 */
public class Golfinho extends Animal {

    public Golfinho(String nome, int idade) {
        super(nome, idade, habitat.AQUATICO);
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM GOLFINHO");
    }
}
