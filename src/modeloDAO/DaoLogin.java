/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.funcionario.BeansFuncionario;
import modeloBeans.funcionario.BeansUsuario;
import modeloConection.ConexaoBD;

/**
 * Classe Dao com os metodos base para autenticaçao para acesso ao Banco de dados 
 * 
 * @author geovanef46
 */
public class DaoLogin {
   
    private ConexaoBD conex = new ConexaoBD();
    
    
    /**
     * Realiza a autentificação do usuario sob os parametros Login e Senha
     * Recuperando o Respectivo Usuario
     * @param login do Usuario
     * @param senha do Usuario
     * @return 
     */
    public BeansUsuario autenticar(String login, String senha){
        
       BeansUsuario usuario = new BeansUsuario();
        conex.conexao();
        conex.executaSql("select *from controle where login_user='"+login+"'");
        try {
            conex.rs.first();
            if(conex.rs.getString("login_user").equals(login)&& conex.rs.getString("senha_user").equals(senha)){
                usuario.setId(conex.rs.getInt("id"));
                usuario.setNomeUsuario(conex.rs.getString("login_user"));
                usuario.setSenhaUsuario(conex.rs.getString("senha_user"));
                usuario.setTipoUsuario(conex.rs.getString("tipo_user"));
                usuario.setFuncionario_CPF(conex.rs.getString("funcionario_CPF"));
                conex.rs.close();
                conex.desconecta();  
                return usuario;
            }else{
                JOptionPane.showMessageDialog(null, "Digite seu Nome ou senha novamente!");
            }  
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Algo parece está errado!");
            JOptionPane.showMessageDialog(null, "Digite seu Nome e senha novamente!");
        }
        conex.desconecta();
        return null;
    }
    
    
    /**
     * Registra um Funcionario Administrador no BD, são suprimidas as demais caracteristicas
     * Permanecendo apenas as basicas CPF e tipoDeUsuario(Administrador)
     * @param modelo Usuario
     * @param cpf_Usuario
     * @return 
     */
    public boolean salvar(BeansUsuario modelo, String cpf_Usuario){
                conex.conexao();
        try {
            PreparedStatement pst = conex.connection.prepareStatement("insert into funcionario(CPF, tipoFunc) values (?,?)");
            pst.setString(1, cpf_Usuario);
            pst.setString(2, modelo.getTipoUsuario());
            pst.execute();
            pst.clearParameters();
            pst = conex.connection.prepareStatement("insert into controle(login_user,senha_user,tipo_user,funcionario_CPF) values (?,?,?,?)");
            pst.setString(1, modelo.getNomeUsuario());
            pst.setString(2, modelo.getSenhaUsuario());
            pst.setString(3, modelo.getTipoUsuario());
            pst.setString(4, cpf_Usuario);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario criado com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao inserir dados de Usuario \n erro:"+ ex);
             
        conex.desconecta();
        return false;
        }
        
        conex.desconecta();
        return true;
    }
    /**
     * Cria um registro de um usuario no BD
     * @param modelo Usuario
     * @return boolean
     */
        public boolean salvar(BeansUsuario modelo){
                conex.conexao();
        try {
            PreparedStatement pst = conex.connection.prepareStatement("insert into controle(login_user,senha_user,tipo_user,funcionario_CPF) values (?,?,?,?)");
            pst.setString(1, modelo.getNomeUsuario());
            pst.setString(2, modelo.getSenhaUsuario());
            pst.setString(3, modelo.getTipoUsuario());
            pst.setString(4, modelo.getFuncionario_CPF());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario criado com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao inserir dados de Usuario \n erro:"+ ex);
        conex.desconecta();
        return false;
        }
        
        conex.desconecta();
        return true;
    }
    
    /**
     * Confere se a tabela de Usuarios está vazia
     * @return 
     */
     public boolean tableIsEmply(){
        conex.conexao();
        conex.executaSql("select login_user,senha_user from controle");
        try {
            if(conex.rs.first()==false){
              conex.desconecta();  
              return true;
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Consulte um técnico! Erro interno no banco de dados!");
        }
        conex.desconecta();
        return false;
    }
}
