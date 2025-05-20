/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.model;

/**
 *
 * @author Kevin
 */
public class Usuario {
    private String login;
    String senha;
    private NivelAcesso nivel;
    boolean ativo;
    
    public Usuario(String login, String senha, NivelAcesso nivel, boolean ativo){
    this.login = login;
    this.senha = senha;
    this.nivel = nivel;
    this.ativo = ativo;
    }
   public boolean autenticar (String senhaAutenticada){
    if (this.senha.equals(senhaAutenticada) && this.ativo)
{
    return true;
    }
    else{return false;}
    }
   public void desativar(){
   this.ativo = false;        
   }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @return the nivel
     */
    public NivelAcesso getNivel() {
        return nivel;
    }
    
}
