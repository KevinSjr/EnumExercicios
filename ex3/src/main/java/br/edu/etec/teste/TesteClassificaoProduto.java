/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.teste;

/**
 *
 * @author Kevin
 */
import br.edu.etec.model.ClassificacaoProduto;

public class TesteClassificaoProduto {
    public static void main(String[] args) { 
        for (ClassificacaoProduto Classificacao: ClassificacaoProduto.values()) 
        { System.out.println(Classificacao + " - " + Classificacao.getDescricao()); }
}}
