/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.test;

/**
 *
 * @author Kevin
 */
import br.edu.etec.model.Usuario;
import br.edu.etec.model.NivelAcesso;

public class teste {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Kevin", "senha123", NivelAcesso.ADMIN, true);
        
        System.out.println("Autenticação: " + user1.autenticar("senha123"));

        System.out.println("Nível de acesso: " + user1.getNivel());
    }
}
