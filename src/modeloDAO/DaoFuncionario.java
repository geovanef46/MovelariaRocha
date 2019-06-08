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

import modeloConection.ConexaoBD;

/**
 * Classe Dao com os metodos base para acesso ao Banco de dados da entidade
 * Funcionario
 *
 * @author Geovanef46
 */
public class DaoFuncionario implements Dao {

    private ConexaoBD conex = new ConexaoBD();
    private DaoLogin daoLogin = new DaoLogin();
    private BeansFuncionario mod = new BeansFuncionario();

    /**
     * Cria um Registro no banco de Dados de Funcionario
     *
     * @param modelo
     * @return true caso sucesso ou false caso contrario
     */
    public boolean salvar(BeansFuncionario modelo) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.connection.prepareStatement("insert into funcionario(CPF, nome, rua, bairro, numero, cidade, CEP, tipoFunc, telefone01, telefone02) values (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, modelo.getCPF());
            pst.setString(2, modelo.getNome());
            pst.setString(3, modelo.getRua());
            pst.setString(4, modelo.getBairro());
            pst.setInt(5, modelo.getNumero());
            pst.setString(6, modelo.getCidade());
            pst.setString(7, modelo.getCEP());
            pst.setString(8, modelo.getTipoFunc());
            pst.setInt(9, modelo.getTelefone01());
            pst.setInt(10, modelo.getTelefone02());

            if (modelo.getNomeUsuario() != null) {
                if (!modelo.getNomeUsuario().equals("") || !modelo.getNomeUsuario().isEmpty()) {
                    modelo.setFuncionario_CPF(modelo.getCPF());
                    daoLogin.salvar(modelo);

                }

            }
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Dados do funcionário inseridos no BD com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados do funcionario \n erro:" + ex);
            return false;
        }

        conex.desconecta();
        return true;
    }

    /**
     * Atualiza ou cria um Registro de Usuario de um funcionario( torna o ele
     * usuario)
     *
     * @param modelo
     */
    private void atualizaUsuario(BeansFuncionario modelo) {
        String login = null;
        String senha = null;
        conex.conexao();
        conex.executaSql("select login_user, senha_user from controle where funcionario_CPF like'" + modelo.getCPF() + "'");
        try {
            conex.rs.first();
            login = conex.rs.getString("login_user");
            senha = conex.rs.getString("senha_user");
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro CPF de Usuario nao existe \n Tente novamente ");

        }
        conex.desconecta();
        conex.conexao();
        try {
            PreparedStatement pst = conex.connection.prepareStatement("insert into controle(login_user,senha_user,tipo_user) values (?,?,?)");
            pst.setString(1, modelo.getNomeUsuario());
            pst.setString(2, modelo.getSenhaUsuario());
            pst.setString(3, modelo.getTipoUsuario());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados de Usuario \n erro:" + ex);

        }
        conex.desconecta();
    }

    public BeansFuncionario buscaFuncionarioPorNome(String nome) {
        conex.conexao();
        conex.executaSql("select *from funcionario where nome like'%" + nome + "%'");
        try {
            conex.rs.first();
            mod.setCPF(conex.rs.getString("CPF"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setRua(conex.rs.getString("rua"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setCidade(conex.rs.getString("cidade"));
            mod.setTipoFunc(conex.rs.getString("tipoFunc"));
            mod.setTelefone(conex.rs.getInt("telefone01"));
            mod.setTelefone2(conex.rs.getInt("telefone02"));
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionario inesistente \n Tente novamente ");

        }
        conex.desconecta();
        return mod;
    }

    public BeansFuncionario buscaFuncionarioPorNome(BeansFuncionario mod) {
        conex.conexao();
        conex.executaSql("select *from funcionario where nome like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCPF(conex.rs.getString("CPF"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setRua(conex.rs.getString("rua"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setCidade(conex.rs.getString("cidade"));
            mod.setTipoFunc(conex.rs.getString("tipoFunc"));
            mod.setTelefone(conex.rs.getInt("telefone01"));
            mod.setTelefone2(conex.rs.getInt("telefone02"));
            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar f inesistente \n Tente novamente ");

        }
        conex.desconecta();
        return mod;
    }

    public BeansFuncionario buscaFuncionarioPorTipo(BeansFuncionario mod) {
        conex.conexao();
        conex.executaSql("select *from funcionario where tipoFunc like'%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCPF(conex.rs.getString("CPF"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setRua(conex.rs.getString("rua"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setCidade(conex.rs.getString("cidade"));
            mod.setTipoFunc(conex.rs.getString("tipoFunc"));
            mod.setTelefone(conex.rs.getInt("telefone01"));
            mod.setTelefone2(conex.rs.getInt("telefone02"));

            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionario inesistente \n Tente novamente ");

        }
        conex.desconecta();
        return mod;
    }

    public BeansFuncionario buscaFuncionarioPorCPF(String CPF) {
        BeansFuncionario modelo = new BeansFuncionario();
        conex.conexao();
        conex.executaSql("select *from funcionario where CPF like'%" + CPF + "%'");
        try {
            conex.rs.first();
            modelo.setCPF(conex.rs.getString("CPF"));
            modelo.setTipoFunc(conex.rs.getString("tipoFunc"));
            modelo.setNome(conex.rs.getString("nome"));
            modelo.setRua(conex.rs.getString("rua"));
            modelo.setBairro(conex.rs.getString("bairro"));
            modelo.setNumero(conex.rs.getInt("numero"));
            modelo.setCidade(conex.rs.getString("cidade"));
            modelo.setTelefone(conex.rs.getInt("telefone01"));
            modelo.setTelefone2(conex.rs.getInt("telefone02"));

            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Funcionario inesistente \n Tente novamente \n " + ex);
            return null;
        }
        conex.desconecta();
        return modelo;

    }
    /**
     *  Identifica um o Funcionario a partir do seu id de usuario
     * @param id de usuario recuperado apos autenticar usuario
     * @return O funcionario encontrado
     */
    public BeansFuncionario identificarFuncionario(int id) {

        BeansFuncionario funcionario = new BeansFuncionario();
        conex.conexao();
        conex.executaSql("SELECT funcionario.CPF FROM funcionario join controle on funcionario.CPF = controle.funcionario_CPF where id=" + id);
        try {
            conex.rs.first();
            funcionario = buscaFuncionarioPorCPF(conex.rs.getString("CPF"));

            conex.rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o funcionario" + ex);

        }
        conex.desconecta();
        return funcionario;
    }

    public void editar(BeansFuncionario modelo) {
        conex.conexao();
        try {//CPF, nome, rua, bairro, numero, cidade, telefone, telefone2, tipoFunc
            PreparedStatement pst;
            pst = conex.connection.prepareStatement("update funcionario set CPF=?, nome=?, rua=?, bairro=?, numero=?, cidade=?, telefone=?, telefone2=?, tipoFunc=? where CPF=?");
            pst.setString(1, modelo.getCPF());
            pst.setString(2, modelo.getNome());
            pst.setString(3, modelo.getRua());
            pst.setString(4, modelo.getBairro());
            pst.setInt(5, modelo.getNumero());
            pst.setString(6, modelo.getCidade());
            pst.setInt(7, modelo.getTelefone01());
            pst.setInt(8, modelo.getTelefone02());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteracao dos dados \n" + ex.getMessage());
        }

        conex.desconecta();
    }

    public void excluir(BeansFuncionario modelo) {
        conex.conexao();
        try {
            PreparedStatement pst;
            pst = conex.connection.prepareStatement("delete from funcionario where CPF=?");
            pst.setString(1, modelo.getCPF());
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados \n");
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



//    public void criarGerente(String cpf_Usuario) {
//        conex.conexao();
//        try {
//            PreparedStatement pst = conex.connection.prepareStatement("insert into gerente(CPF) values (?)");
//            pst.setString(1, cpf_Usuario);
//
//            pst.execute();
//            JOptionPane.showMessageDialog(null, "Funcionario criado com Sucesso!");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao inserir dados de Funcionario \n erro:" + ex);
//        }
//
//        conex.desconecta();
//    }
    @Override
    public boolean seleciona(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean salvar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
