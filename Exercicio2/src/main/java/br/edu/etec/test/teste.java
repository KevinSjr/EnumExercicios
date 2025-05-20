/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.test;

/**
 *
 * @author Kevin
 */
import br.edu.etec.model.PagamentoCartao;
import br.edu.etec.model.StatusPagamento;
import br.edu.etec.model.Pagamento;

public class teste {
      public static void main(String[] args) {
        PagamentoCartao pagamento = new PagamentoCartao(100.00, "12345678910111213");

        pagamento.exibirStatus();       
        pagamento.processarPagamento(); 
        pagamento.exibirStatus();       
    }
}
