/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.model;

/**
 *
 * @author Kevin
 */
public enum ClassificacaoProduto {
    BASICO("Produto simples"),
    PADRAO("Produto padrão"),
    PREMIUM("Produto de alto nível");
    
    private final String Descricao;
    
  ClassificacaoProduto(String Descricao){
      this.Descricao = Descricao;
  }

   
    public String getDescricao() {
        return Descricao;
    }
  
}
