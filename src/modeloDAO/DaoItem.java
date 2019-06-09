/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.produto.BeansItem;

/**
 * Classe Dao com os metodos base para acesso ao Banco de dados da entidade
 * Item de um Produto
 * @author geovanef46@gmail.com
 */
public class DaoItem {
    ConexaoBD conex = new ConexaoBD();
    BeansItem mod = new BeansItem();
    
    
    /**
     * Cria um registro de Item no BD
     * @param modelo
     * @return 
     */
    public BeansItem salvar(BeansItem modelo){
        conex.conexao();
        try {
            PreparedStatement pst = conex.connection.prepareStatement("insert into item(quantidade, movel_codigo ) values (?,?)");
     
            pst.setInt(1, modelo.getQtd());
            pst.setInt(2, modelo.getCodProduto());
           
            pst.execute();
            pst.close();

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao inserir dados do item\n erro:"+ ex);
        }
        
        conex.desconecta();
        modelo.setCodItem(recuperaID());
        return modelo;

    }
    
    /**
     * Recupera um ID do ultimo item Criado
     * @return o ID do Item
     */
    public int recuperaID(){
        int index = 0;
        conex.conexao();
            conex.executaSql("select max(codItem) from item");
        try {
            conex.rs.first();
            index = conex.rs.getInt("max(codItem)");
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar o id do Item \n erro:"+ ex);
        }
         
         conex.desconecta();
        return index;
    }
    
    public void editar(BeansItem modelo){
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.connection.prepareStatement("update item set quantidade=?, movel_codigo=? where codItem=?");
            pst.setInt(1, modelo.getQtd());
            pst.setInt(2, modelo.getCodProduto());
                     
                pst.execute();
                pst.close();
                
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
                    } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro na alteracao dos dados \n"+ ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public void excluir(BeansItem modelo){
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.connection.prepareStatement("delete from item where codItem=?");
            pst.setInt(1, modelo.getCodItem());
            pst.execute();
            pst.close();
             JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados \n");
        }
        
        
        conex.desconecta();
    }
       
}

