/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans.funcionario;

/**
* Classe Beans da entidade Usuario esta que possue acesso ao sistema
 * @author geovanef46
 */
public class BeansUsuario {
    private int id; 
    private String nomeUsuario;
    private String senhaUsuario;
    private String tipoUsuario;
    private String funcionario_CPF;
    public  final String ADMINISTRADOR = "ADMINISTRADOR";


    
    /**
     * @return the tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void criarLogin(String nomeUsuario) {
        this.setNomeUsuario(nomeUsuario);
    }

    /**
     * @return the senhaUsuario
     */
    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    /**
     * @param senhaUsuario the senhaUsuario to set
     */
    public void criarSenha(String senhaUsuario) {
        this.setSenhaUsuario(senhaUsuario);
    }
    
     /**
     * @param senhaUsuario the senhaUsuario to set
     * caso a senha do usuario seja null entao este usuário nao tem acesso 
     */
    public boolean alterarSenha(String senhaUsuario) {
        if(this.getSenhaUsuario() != null){
            this.setSenhaUsuario(senhaUsuario);
        return true;
        }
        return false;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    /**
     * @param senhaUsuario the senhaUsuario to set
     */
    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the funcionario_CPF
     */
    public String getFuncionario_CPF() {
        return funcionario_CPF;
    }

    /**
     * @param funcionario_CPF the funcionario_CPF to set
     */
    public void setFuncionario_CPF(String funcionario_CPF) {
        this.funcionario_CPF = funcionario_CPF;
    }
}
