/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.teste;

import br.edu.etec.model.RegiaoBrasil;

/**
 *
 * @author Kevin
 */
public class TesteRegiao {
    public static void main(String[] args) { 
        for (RegiaoBrasil regiao : RegiaoBrasil.values()) 
        { System.out.println(regiao + " - " + regiao.getDescricao()); }
}
}
