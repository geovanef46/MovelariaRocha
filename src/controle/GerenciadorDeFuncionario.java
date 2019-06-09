/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modeloBeans.funcionario.BeansFuncionario;

/**
 * Contém os metodos  da entidade funcionário
 *
 * @author geovanef46
 */
public class GerenciadorDeFuncionario {
BeansFuncionario modeloFuncionario = new BeansFuncionario();
GerenciadorDeBD DaoControl = new GerenciadorDeBD();
    
    
    
   /**
    * 
    * @param funcionario é um objeto do tipo BeansFuncionario
    * @return true se o funcionario foi encontrado ou false caso contrario
    */
    public boolean confereAcesso(BeansFuncionario funcionario) {
        if (funcionario.getNomeUsuario() != null || !funcionario.getNomeUsuario().equals("") || !funcionario.getNomeUsuario().isEmpty() && funcionario.getSenhaUsuario() != null ||!funcionario.getSenhaUsuario().equals("") || !funcionario.getSenhaUsuario().isEmpty()) {
            return true;
        }
        return false;
    }
    /**
     * 
     * @param CPF numero do documento CPF de um funcionário (chave primaria da tabela)
     * @return true se o funcionario foi encontrado ou false caso contrario
     */
    public BeansFuncionario buscarFuncionario(String CPF){
        modeloFuncionario = DaoControl.buscarFuncionario(CPF);
        if (modeloFuncionario != null) {
            return modeloFuncionario;
        }
        return null;
    }
}
