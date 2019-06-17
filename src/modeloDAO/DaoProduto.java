/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modeloBeans.produto.BeansMateria_prima;
import modeloBeans.produto.BeansMovel;
import modeloBeans.produto.BeansProduto;

/**
 * Classe Dao com os metodos base para acesso ao Banco de dados das entidades
 * de Produto (Movel, materia-prima)
 * @author geovanef46@gmail.com
 */
public class DaoProduto {
    ConexaoBD conex = new ConexaoBD();
    BeansProduto mod = new BeansProduto();
    
    
    /**
     *  Cria um registro de Movel
     * @param modelo (movel)
     */
    public void salvar(BeansMovel modelo){
        conex.conexao();
        try {
            PreparedStatement pst = conex.connection.prepareStatement("insert into movel(nome, marca, cor, preco, qtd, descricao,op_producao_CPF) values (?,?,?,?,?,?,?)");
            pst.setString(1, modelo.getNome());
            pst.setString(2, modelo.getMarca());
            pst.setString(3, modelo.getCor());
            pst.setDouble(4, converterValores(modelo.getPreco()));
            pst.setInt(5, modelo.getQtd());
            pst.setString(6, modelo.getDescricao());
            pst.setString(7, modelo.getCpfOpProducao());
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Dados inseridos no BD com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao inserir dados do movel\n");
        }
        
        conex.desconecta();
    }
        /**
         * Cria resgistro de materia-prima
         * @param modelo 
         */
        public void salvar(BeansMateria_prima modelo){
        conex.conexao();
        try {
            PreparedStatement pst = conex.connection.prepareStatement("insert into materia_prima(nome, preco, qtd, descricao, op_producao_CPF) values (?,?,?,?,?)");
            pst.setString(1, modelo.getNome());
            pst.setDouble(2, converterValores(modelo.getPreco()));
            pst.setInt(3, modelo.getQtd());
            pst.setString(4, modelo.getDescricao());
            pst.setString(5, modelo.getCpfOpProducao());
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Dados inseridos no BD com Sucesso!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao inserir dados da materia prima\n ");
        }
        
        conex.desconecta();
    }
        /**
         * 
         * @param mod
         * @return 
         */
    public BeansProduto buscaProdutoPorNome(BeansMovel mod){
        conex.conexao();
        conex.executaSql("select *from movel where nome like'%"+ mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("codigo"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setCor(conex.rs.getString("cor"));
            mod.setDescricao(conex.rs.getString("descricao"));
            mod.setMarca(conex.rs.getString("marca"));
            mod.setQtd(conex.rs.getInt("qtd"));
            mod.setPreco(converterValores(conex.rs.getDouble("preco")));
            conex.rs.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao buscar movel inesistente \n Tente novamente ");
             mod.setCodigo(0);
        }
        conex.desconecta();
        return mod;
    }
    
        public BeansProduto buscaProdutoPorNome(BeansMateria_prima mod){
        conex.conexao();
        conex.executaSql("select *from materia_prima where nome like'%"+ mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("codigo"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setDescricao(conex.rs.getString("descricao"));
            mod.setQtd(conex.rs.getInt("qtd"));
            mod.setPreco(converterValores(conex.rs.getDouble("preco")));
            conex.rs.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao buscar materia_prima inesistente \n Tente novamente ");
             mod.setCodigo(0);
        }
        conex.desconecta();
        return mod;
    }
        /**
         * Recupera um Movel a partir de um ID
         * @param codigo
         * @param modelo
         * @return 
         */
    public BeansMovel recuperaProduto(int codigo, BeansMovel modelo){
        conex.conexao();
        conex.executaSql("select *from movel where codigo='"+ codigo+"'");
        try {
            conex.rs.first();
            modelo.setCodigo(conex.rs.getInt("codigo"));
            modelo.setNome(conex.rs.getString("nome"));
            modelo.setCor(conex.rs.getString("cor"));
            modelo.setDescricao(conex.rs.getString("descricao"));
            modelo.setMarca(conex.rs.getString("marca"));
            modelo.setQtd(conex.rs.getInt("qtd"));
            modelo.setPreco(converterValores(conex.rs.getDouble("preco")));
            conex.rs.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao buscar movel inesistente \n Tente novamente ");
             modelo.setCodigo(0);
        }
        conex.desconecta();
        return modelo;
    }
    
        /**
         * Recupera uma materia prima a partir de um ID
         * @param codigo Materia-prima
         * @param modelo
         * @return 
         */
        public BeansMateria_prima recuperaProduto(int codigo, BeansMateria_prima modelo){
        conex.conexao();
        conex.executaSql("select *from materia_prima where codigo='"+ codigo+"'");
        try {
            conex.rs.first();
            modelo.setCodigo(conex.rs.getInt("codigo"));
            modelo.setNome(conex.rs.getString("nome"));
            modelo.setDescricao(conex.rs.getString("descricao"));
            modelo.setQtd(conex.rs.getInt("qtd"));
            modelo.setPreco(converterValores(conex.rs.getDouble("preco")));
            conex.rs.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao buscar materia_prima inesistente \n Tente novamente ");
             modelo.setCodigo(0);
        }
        conex.desconecta();
        return modelo;
    }
        
        /**
         * Seleciona um Movel pelo nome
         * @param nome
         * @return 
         */
        public BeansProduto selecionaMovel(String nome){
        BeansMovel modelo = new BeansMovel();
        conex.conexao();
        conex.executaSql("select *from movel where nome ='"+ nome+"'");
        try {
            conex.rs.first();
            modelo.setCodigo(conex.rs.getInt("codigo"));
            modelo.setNome(conex.rs.getString("nome"));
            modelo.setQtd(conex.rs.getInt("qtd"));
            modelo.setCor(conex.rs.getString("cor"));
            modelo.setDescricao(conex.rs.getString("descricao"));
            modelo.setMarca(conex.rs.getString("marca"));
            modelo.setPreco(converterValores(conex.rs.getDouble("preco")));
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados na tabela\n");
            return null;
        }
        conex.desconecta();
        return modelo;
    }
        
           /**
         * Seleciona um Movel pelo nome
         * @param nome
         * @return 
         */
        public BeansProduto selecionaMovel(int id){
        BeansMovel modelo = new BeansMovel();
        conex.conexao();
        conex.executaSql("select *from movel where codigo ='"+ id+"'");
        try {
            conex.rs.first();
            modelo.setCodigo(conex.rs.getInt("codigo"));
            modelo.setNome(conex.rs.getString("nome"));
            modelo.setQtd(conex.rs.getInt("qtd"));
            modelo.setCor(conex.rs.getString("cor"));
            modelo.setDescricao(conex.rs.getString("descricao"));
            modelo.setMarca(conex.rs.getString("marca"));
            modelo.setPreco(converterValores(conex.rs.getDouble("preco")));
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados na tabela\n");
            return null;
        }
        conex.desconecta();
        return modelo;
    }
      
        
        /**
         * Seleciona uma Materia-prima pelo nome
         * @param nome
         * @return 
         */
        public BeansProduto selecionaMPrima(String nome){
        BeansProduto modelo = new BeansMateria_prima();
        conex.conexao();
        conex.executaSql("select *from materia_prima where nome ='"+ nome+"'");
        try {
            conex.rs.first();
            modelo.setCodigo(conex.rs.getInt("codigo"));
            modelo.setNome(conex.rs.getString("nome"));
            modelo.setQtd(conex.rs.getInt("qtd"));
            modelo.setDescricao(conex.rs.getString("descricao"));
            modelo.setPreco(converterValores(conex.rs.getDouble("preco")));
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados na tabela de Matéria-Prima\n");
            return null;
        }
        conex.desconecta();
        return modelo;
    }
    
    
     public BeansProduto buscaProdutoPorMarca(BeansMovel mod){
        conex.conexao();
        conex.executaSql("select *from movel where marca like'%"+ mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("codigo"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setCor(conex.rs.getString("cor"));
            mod.setDescricao(conex.rs.getString("descricao"));
            mod.setMarca(conex.rs.getString("marca"));
            mod.setQtd(conex.rs.getInt("qtd"));
            mod.setPreco(converterValores(conex.rs.getDouble("preco")));
            conex.rs.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao buscar produto inesistente \n Tente novamente ");
             mod.setCodigo(0);
        }
        conex.desconecta();
        return mod;
    }
    
    
    public void editar(BeansMovel modelo){
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.connection.prepareStatement("update movel set nome=?, marca=?, cor=?, preco=?, qtd=?, descricao=? where codigo=?");
            pst.setString(1, modelo.getNome());
            pst.setString(2, modelo.getMarca());
            pst.setString(3, modelo.getCor());
            pst.setDouble(4, converterValores(modelo.getPreco()));
            pst.setInt(5, modelo.getQtd());
            pst.setString(6, modelo.getDescricao());
            pst.setInt(7, modelo.getCodigo());
            
                pst.execute();
                pst.close();
                
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
                    } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro na alteracao dos dados do movel\n");
        }
        
        conex.desconecta();
    }
    
    
    public void editar(BeansMateria_prima modelo){
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.connection.prepareStatement("update materia_prima set nome=?, preco=?, qtd=?, descricao=? where codigo=?");
            pst.setString(1, modelo.getNome());
            pst.setDouble(2, converterValores(modelo.getPreco()));
            pst.setInt(3, modelo.getQtd());
            pst.setString(4, modelo.getDescricao());
            pst.setInt(5, modelo.getCodigo());
            
                pst.execute();
                pst.close();
                
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
                    } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro na alteracao dos dados da materia prima \n");
        }
        
        conex.desconecta();
    }
    public void excluir(BeansMovel modelo){
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.connection.prepareStatement("delete from movel where codigo=?");
            pst.setInt(1, modelo.getCodigo());
            pst.execute();
            pst.close();
             JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados do movel\n");
        }
        conex.desconecta();
    }
  
        public void excluir(BeansMateria_prima modelo){
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.connection.prepareStatement("delete from materia_prima where codigo=?");
            pst.setInt(1, modelo.getCodigo());
            pst.execute();
            pst.close();
             JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados da materia_prima\n");
        }
        conex.desconecta();
    }
        
        /**
     *  Preenche um arrayList com os dados que são recuperados do BD
     * para em sequencia povoar a exibição em uma tabela de Materia-prima
     * @param sql
     * @return 
     */
           public ArrayList PreencherTabelaMP(String sql){
        ArrayList dados = new ArrayList();//linhas
        conex.conexao();
        conex.executaSql(sql);
        try {
            if(conex.rs.first() == true){
            do {                
                dados.add(new Object[]{conex.rs.getInt("codigo"), conex.rs.getString("nome"), conex.rs.getInt("qtd"),conex.rs.getDouble("preco")});
                
            } while (conex.rs.next());}
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null , "Erro ao preencher a tabela!");
            return null;
        }
        conex.desconecta();
        return dados;
    }
           
          /**
     *  Preenche um arrayList com os dados que são recuperados do BD
     * para em sequencia povoar a exibição em uma tabela de Movel
     * @param sql
     * @return 
     */
     public ArrayList PreencherTabela(String sql){
        ArrayList dados = new ArrayList();//linhas
        conex.conexao();
        conex.executaSql(sql);
        try {
            if(conex.rs.first() == true){
            do {                
                dados.add(new Object[]{conex.rs.getInt("codigo"), conex.rs.getString("nome"),conex.rs.getString("cor"), conex.rs.getInt("qtd"),conex.rs.getString("marca"),conex.rs.getDouble("preco")});
                
            } while (conex.rs.next());}
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null , "Erro ao preencher a tabela!");
            return null;
        }
        conex.desconecta();
        return dados;
    }
 
           
        
  /**
     *  Conversor de valores de double para String
     * @param valor
     * @return 
     */
    public String converterValores(double valor) {
        String formatado;
        formatado = String.valueOf(valor);
        formatado = formatado.replace(".", ",");
        return formatado;
    }
    /**
     * Conversor de valores de String para doble
     * @param valor
     * @return 
     */
    public double converterValores(String valor) {
        double formatado;
        String doubleWord = valor.replace(".", "");
        doubleWord = doubleWord.replace(",", ".");
        formatado = Double.valueOf(doubleWord);
        return formatado;
    }

    /**
     * Conversor de valores de String para int
     * @param valor
     * @return
     */
    public int converterInt(String valor) {
        int formatado;
        if (valor.equals("")) {
            formatado = 0;
        } else {
            formatado = Integer.valueOf(valor);
        }
        return formatado;
    }

       
}
