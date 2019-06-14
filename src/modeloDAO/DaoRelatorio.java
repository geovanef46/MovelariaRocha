/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modeloBeans.empresa.BeansCliente;
import modeloConection.ConexaoBD;

/**
 *
 * @author geovanef46
 */
public class DaoRelatorio {
    
       ConexaoBD conex = new ConexaoBD();
    BeansCliente mod = new BeansCliente();
    
    
        public ArrayList PreencherRelatorioEntrada(String sql) {
            ArrayList dados = new ArrayList();//linhas
        conex.conexao();
        conex.executaSql(sql);
        
        try {
            if(conex.rs.first()==true){
            do {                
                dados.add(new Object[]{conex.rs.getInt("codigo"), conex.rs.getString("nome"),conex.rs.getString("cor"), conex.rs.getInt("qtd"),conex.rs.getString("marca"),conex.rs.getDouble("preco")});
                
            } while (conex.rs.next());}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela de entrada"+ex);
        }
         conex.desconecta();
        return dados;
    }

    public ArrayList PreencherRelatorioCompras(String sql) {
        ArrayList dados = new ArrayList();//linhas
        conex.conexao();
        conex.executaSql(sql);
        
        try {
            if(conex.rs.first()==true){
            do {                
                dados.add(new Object[]{conex.rs.getString("cliente_CNPJ"),conex.rs.getString("data"),conex.rs.getInt("codComp"), conex.rs.getDouble("valorTotal"),conex.rs.getString("vendedor_CPF")});
                
            } while (conex.rs.next());}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela de Compras por Cliente"+ex);
        }
         conex.desconecta();
        return dados;
    }
        
        
    
}
