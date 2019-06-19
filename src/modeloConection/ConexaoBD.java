/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import Configura.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modeloBeans.BeansConfig;

/**
 * Classe que prove a conexão com o Banco de Dados SQL
 *
 * $(caminho) este é o caminho de acesso ao Banco de Dados
 * $(usuario) este é o usuario para acesso ao BD 
 * $(senha) esta é a senha de acesso  ao BD
 *
 * @author geovanef46
 */
public class ConexaoBD {

    public Statement stm;//responsavel pelas pesquisas
    public ResultSet rs;//guarda o resultado da pesquisa
    private final String driver = "com.mysql.jdbc.Driver";
    private String caminho;
    private String usuario;
    private String senha ;
    public Connection connection;
    private Config configArquivo;
    
    private void obterConfig(){
   
    configArquivo = Config.getInstance();
    BeansConfig configAtual = configArquivo.usarConfig();
        
    this.caminho = configAtual.getCaminhoGerado();
    this.senha = configAtual.getSenha();
    this.usuario = configAtual.getUsuario();
        
    }
    
    
    public void conexao() {//realiza a conexao com o BD
        obterConfig();
        System.setProperty("jdbc.Drivers", driver);
        try {
            connection = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "conexão efetuada com sucesso!");
        } catch (SQLException ex) {
            
        }

    }

    /**
     * Executa um Statement SQL guardanco o resultado no rs
     *
     * @param sql
     */
    public void executaSql(String sql) {
        try {
            stm = connection.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (NullPointerException ne) {
            

        } catch (SQLException ex) {
            
        }
    }

    public void desconecta() {//realiza a desconexao com o BD
        try {
            connection.close();
            // JOptionPane.showMessageDialog(null, "BD desconectado com sucesso!");
        } catch (NullPointerException ne) {

        } catch (SQLException ex) {
            
        }
    }

}
