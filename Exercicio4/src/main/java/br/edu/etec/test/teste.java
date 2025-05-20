/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.test;

/**
 *
 * @author Kevin
 */
import br.edu.etec.model.Email;
import br.edu.etec.model.Notificacao;
import br.edu.etec.model.SMS;

public class teste {
     public static void main(String[] args) {
        Notificacao[] notificacoes = new Notificacao[3];

        notificacoes[0] = new Email("kevin@gmail", "mensagem do email");
        notificacoes[1] = new SMS("123456789", "mensagem tamanho normal que não vai ser cortada");
        notificacoes[2] = new SMS("123455890", "mensagem gigante que vai ser cortada em algum momento,mensagem gigante que vai ser cortada em algum momento,mensagem gigante que vai ser cortada em algum momento,mensagem gigante que vai ser cortada em algum momento, ");

        for (Notificacao n : notificacoes) {
            n.preparar();
            n.enviar();
            System.out.println("");
        }
     }
}
