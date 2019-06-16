/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author geovanef46
 */
public class BeansConfig {
    
    private String bancoDeDados = "movelariaRocha";
    private String caminhoIP = "localhost";
    private String porta = "3306";
    private String caminhoGerado = "localhost:3306";
    private String usuario = "root";
    private String senha = "root";
    private String padrao = "{\"senha\":\"root\",\"bd\":\"movelariaRocha\",\"usuario\":\"root\",\"caminho\":\"localhost:3306\"}";

    
    /**
     * @return a configuração padrao
     */
    public String getPadrao() {
        return padrao;
    }

        
    /**
     * @return the bancoDeDados
     */
    public String getBancoDeDados() {
        return bancoDeDados;
    }

    /**
     * @param bancoDeDados the bancoDeDados to set
     */
    public void setBancoDeDados(String bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    /**
     * @return the caminhoIP
     */
    public String getCaminhoIP() {
        return caminhoIP;
    }

    /**
     * @param caminhoIP the caminhoIP to set
     */
    public void setCaminhoIP(String caminhoIP) {
        this.caminhoIP = caminhoIP;
    }

    /**
     * @return the porta
     */
    public String getPorta() {
        return porta;
    }

    /**
     * @param porta the porta to set
     */
    public void setPorta(String porta) {
        this.porta = porta;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the caminhoGerado
     */
    public String gerarCaminho() {
        if(!this.caminhoIP.equals("")&&!this.porta.equals("")){
            this.caminhoGerado = this.caminhoIP+":"+porta;
        }
        return caminhoGerado;
    }

    public String getCaminhoGerado() {
        return caminhoGerado;
    }

    
    
    
}
