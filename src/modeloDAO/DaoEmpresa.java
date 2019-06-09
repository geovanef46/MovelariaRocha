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
import java.util.List;
import javax.swing.JOptionPane;
import modeloBeans.BeansCompra;
import modeloBeans.produto.BeansItem;
import modeloBeans.empresa.BeansCliente;
import modeloBeans.empresa.BeansEmpresa;
import modeloBeans.empresa.BeansFornecedor;
import modeloBeans.funcionario.BeansFuncionario;
import modeloBeans.produto.BeansMateria_prima;

/**
 * Classe que fornece os métodos para acesso ao BD(persistencia dos dados)
 * @author geovanef46@gmail.com
 */
public class DaoEmpresa {

    ConexaoBD conex = new ConexaoBD();
    BeansCliente mod = new BeansCliente();
    DaoProduto daoProduto = new DaoProduto();
    private DaoItem itemDao = new DaoItem();
    
    
    /**
     * Salva o modelo da Empresa passada como parametro
     * @param modelo 
     */
    public void salvar(BeansEmpresa modelo) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.connection.prepareStatement("insert into Empresa(CNPJ, nome, rua, bairro, numero, cidade, tipo) values (?,?,?,?,?,?,?)");
            pst.setString(1, modelo.getCNPJ());
            pst.setString(2, modelo.getNome());
            pst.setString(3, modelo.getRua());
            pst.setString(4, modelo.getBairro());
            pst.setInt(5, modelo.getNumero());
            pst.setString(6, modelo.getCidade());
            pst.setString(7, modelo.getTipoEmpresa());
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Empresa inserida no BD com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados da loja \n erro:" + ex);
        }

        conex.desconecta();
    }

//       private void salvaFornecido(BeansItem modeloItem, BeansFornecedor modeloLoja){
//        conex.conexao();
//        try {
//        PreparedStatement pst = conex.connection.prepareStatement("insert into fornecido(item_codItem,loja_CNPJ) values (?,?)");            
//            pst.setInt(1, modeloItem.getCodItem());
//            pst.setString(2, modeloLoja.getCNPJ());
//            pst.execute();
//            pst.close();
//            JOptionPane.showMessageDialog(null, "Dados inseridos no BD Fornecido com Sucesso!");
//        } catch (SQLException ex) {
//             JOptionPane.showMessageDialog(null, "Erro ao inserir dados \n erro:"+ ex);
//        }
//        
//        conex.desconecta();
//    }
//
//        public void guardaFornecido(List<BeansItem> listItes, BeansFornecedor loja){
//         for (int i = 0; i < listItes.size(); i++) {
//            BeansItem item = listItes.get(i);
//            salvaFornecido(item, loja);
//        }
//        }
    protected void fornecerMP(List listaMP, double valorTotal) {

    }
    /**
     *  Salva uma compra concluida no BD
     * @param novaCompra Compra realizada
     * @param valorTotal Valor total da Compra
     */
    private void salvarCompra(BeansCompra novaCompra, double valorTotal) {
 
        List<BeansItem> listItens = novaCompra.getListItens();
        for (BeansItem item : listItens) {
            item = itemDao.salvar(item);
            conex.conexao();
            try {
                PreparedStatement pst = conex.connection.prepareStatement("insert into compra( valorTotal, data, item_codItem, cliente_CNPJ, vendedor_CPF) values (?,?,?,?,?)");

                pst.setDouble(1, valorTotal);
                pst.setDate(2, novaCompra.getData());
                pst.setInt(3, item.getCodItem());
                pst.setString(4, novaCompra.getCliente().getCNPJ());
                pst.setString(5, novaCompra.getVendedor_CPF());
                pst.execute();
                pst.close();
                JOptionPane.showMessageDialog(null, "Dados da compra inseridos no BD Compra com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir dados da compra\n erro:" + ex);
            }

        }

        conex.desconecta();
    }
    /**
     *  Salva a Compra
     * @param novaCompra
     * @param valorTotal 
     */
    public void guardarCompra(BeansCompra novaCompra, double valorTotal) {
        salvarCompra(novaCompra, valorTotal);

    }

    public BeansFornecedor buscaLojaPorNome(BeansFornecedor mod) {
        conex.conexao();
        conex.executaSql("select *from Empresa where nome like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCNPJ(conex.rs.getString("CNPJ"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setRua(conex.rs.getString("rua"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setCidade(conex.rs.getString("cidade"));
            mod.setTipoEmpresa(conex.rs.getString("tipo"));
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar loja inesistente \n Tente novamente ");

        }
        conex.desconecta();
        return mod;
    }
    
      public BeansCliente buscaLojaPorNome(BeansCliente mod) {
        conex.conexao();
        conex.executaSql("select *from Empresa where nome like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCNPJ(conex.rs.getString("CNPJ"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setRua(conex.rs.getString("rua"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setCidade(conex.rs.getString("cidade"));
            mod.setTipoEmpresa(conex.rs.getString("tipo"));
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar loja inesistente \n Tente novamente ");

        }
        conex.desconecta();
        return mod;
    }

    public BeansFornecedor buscaLojaPorTipo(BeansFornecedor mod) {
        conex.conexao();
        conex.executaSql("select *from Empresa where tipo like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCNPJ(conex.rs.getString("CNPJ"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setRua(conex.rs.getString("rua"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setCidade(conex.rs.getString("cidade"));
            mod.setTipoEmpresa(conex.rs.getString("tipo"));
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar loja inesistente \n Tente novamente ");

        }
        conex.desconecta();
        return mod;
    }
    
        public BeansCliente buscaLojaPorTipo(BeansCliente mod) {
        conex.conexao();
        conex.executaSql("select *from Empresa where tipo like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCNPJ(conex.rs.getString("CNPJ"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setRua(conex.rs.getString("rua"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setCidade(conex.rs.getString("cidade"));
            mod.setTipoEmpresa(conex.rs.getString("tipo"));
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar loja inesistente \n Tente novamente ");

        }
        conex.desconecta();
        return mod;
    }

//    public BeansEmpresa buscaLojaPorCNPJ(BeansEmpresa mod) {
//        conex.conexao();
//        conex.executaSql("select *from Empresa where CNPJ like'%" + mod.getPesquisa() + "%'");
//        try {
//            conex.rs.first();
//            mod.setCNPJ(conex.rs.getString("CNPJ"));
//            mod.setNome(conex.rs.getString("nome"));
//            mod.setRua(conex.rs.getString("rua"));
//            mod.setBairro(conex.rs.getString("bairro"));
//            mod.setNumero(conex.rs.getInt("numero"));
//            mod.setCidade(conex.rs.getString("cidade"));
//            mod.setTipoEmpresa(conex.rs.getString("tipo"));
//            conex.rs.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao buscar loja inesistente \n Tente novamente ");
//
//        }
//        conex.desconecta();
//        return mod;
//    }

    public BeansCliente buscaLojaPorCNPJ(String cnpj) {
        conex.conexao();
        conex.executaSql("select *from Empresa where nome like'%" + cnpj + "%'");
        try {
            conex.rs.first();
            mod.setCNPJ(conex.rs.getString("CNPJ"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setRua(conex.rs.getString("rua"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setCidade(conex.rs.getString("cidade"));
            mod.setTipoEmpresa(conex.rs.getString("tipo"));
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar loja inesistente \n Tente novamente ");

        }
        conex.desconecta();
        return mod;
    }


    public void editar(BeansEmpresa modelo) {
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.connection.prepareStatement("update Empresa set CNPJ=?, nome=?, rua=?, bairro=?, numero=?, cidade=?, tipo=? where CNPJ=?");
            pst.setString(1, modelo.getCNPJ());
            pst.setString(2, modelo.getNome());
            pst.setString(3, modelo.getRua());
            pst.setString(4, modelo.getBairro());
            pst.setInt(5, modelo.getNumero());
            pst.setString(6, modelo.getCidade());
            pst.setString(7, modelo.getTipoEmpresa());
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Dados da empresa alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteracao dos dados da empresa \n" + ex.getMessage());
        }

        conex.desconecta();
    }

    public void excluir(BeansEmpresa modelo) {
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.connection.prepareStatement("delete from Empresa where CNPJ=?");
            pst.setString(1, modelo.getCNPJ());
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados \n");
        }

        conex.desconecta();
    }
    /**
     *  Preenche um arrayList com os dados que são recuperados do BD
     * para em sequencia povoar a exibição em uma tabela.
     * @param sql
     * @return 
     */
    public ArrayList PreencherTabelaLoja(String sql) {
        ArrayList dados = new ArrayList();//linhas
        conex.conexao();
        conex.executaSql(sql);

        try {
            if (conex.rs.first() == true) {
                do {
                    dados.add(new Object[]{conex.rs.getString("CNPJ"), conex.rs.getString("nome"), conex.rs.getString("rua"), conex.rs.getString("bairro"), conex.rs.getString("cidade"), conex.rs.getString("tipo")});

                } while (conex.rs.next());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela!" + ex);
        }
        conex.desconecta();
        return dados;
    }
    /**
     *  Realiza o registro de materia-prima fornecida por uma empresa fornecedora
     * @param modeloFornecedor
     * @param modeloMP
     * @param func 
     */
    public void salvarFornecido(BeansFornecedor modeloFornecedor, BeansMateria_prima modeloMP, BeansFuncionario func) {
        daoProduto.salvar(modeloMP);
        modeloMP = (BeansMateria_prima) daoProduto.buscaProdutoPorNome(modeloMP);
        conex.conexao();
            try {
                PreparedStatement pst = conex.connection.prepareStatement("insert into fornecido(mprima_codigo, cliente_CNPJ, codFunc) values (?,?,?)");

                pst.setInt(1,modeloMP.getCodigo());
                pst.setString(2, modeloFornecedor.getCNPJ());
                pst.setString(3, func.getCPF());
                pst.execute();
                pst.close();
                JOptionPane.showMessageDialog(null, "Dados do fornecimento inseridos no BD Compra com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir dados do fornecimento\n erro:" + ex);
            }

        

        conex.desconecta();
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
