/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.model;

/**
 *
 * @author Kevin
 */
public class Leao extends Animal {

    public Leao(String nome, int idade) {
        super(nome, idade, habitat.TERRESTRE);
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM LEAO");
    }
}

