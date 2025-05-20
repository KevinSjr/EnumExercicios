/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.model;

/**
 *
 * @author Kevin
 */
public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        status = StatusPagamento.PROCESSANDO;
        System.out.println("Processando pagamento com cartão...");

        
        String ultimos4 = numeroCartao.length() >= 4? numeroCartao.substring(numeroCartao.length() - 4)   : numeroCartao;
        
        System.out.println("Pagamento de R$" + valor + " com cartão final " + ultimos4 + " processado com sucesso.");
        status = StatusPagamento.CONCLUIDO;
    }
}


