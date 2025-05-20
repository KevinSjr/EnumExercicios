/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.model;

/**
 *
 * @author Kevin
 */
public abstract class Notificacao {
    String destinatario;
    String mensagem;
    TipoNotificacao tipo;
      public Notificacao(String destinatario, String mensagem, TipoNotificacao tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }
  public void preparar() {
        System.out.println("Preparando notificacao do tipo: " + tipo);
    }

    public abstract void enviar();

}
