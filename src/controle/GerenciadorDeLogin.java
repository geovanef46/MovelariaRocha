/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.swing.JOptionPane;
import modeloBeans.funcionario.BeansFuncionario;
import modeloBeans.funcionario.BeansGerente;
import modeloBeans.funcionario.BeansUsuario;
import modeloDAO.DaoFuncionario;
import modeloDAO.DaoLogin;
import visao.TelaPrincipal;
import visao.funcionario.TelaPrincipalOpProd;
import visao.funcionario.TelaPrincipalVendedor;

/**
 * Classe que fornece a autenticação e o acesso dos usuários
 * as funcionalidades do sistema de acordo com suas competencias 
 * e seus cargos.
 * @author Geovanef46
 */
public class GerenciadorDeLogin {
    private BeansFuncionario funcionarioAtivo;
    private DaoLogin newLogin = new DaoLogin();
    private DaoFuncionario daoFunc = new DaoFuncionario();
    private BeansUsuario usuario;
    private static GerenciadorDeLogin unicaInstancia;

    
    private GerenciadorDeLogin(){
        
    }
    /**
     *  Aplicação do padrão Singleton 
     *  Fornecendo a criação de apenas uma instância para gerenciar o login dos usuários
     * @return  Uma instancia unica da classe
     */
    public static synchronized GerenciadorDeLogin getInstance(){
        if (unicaInstancia == null) {
            unicaInstancia = new GerenciadorDeLogin();
        }
     return unicaInstancia;
    }
    
    /**
     * Método inicial que provê o acesso
     * @param usuario que deverá ser autenticado 
     * @return true caso sucesso e false caso erro
     */
    public boolean fazerLogin(BeansUsuario usuario) {
        this.usuario = usuario;
        return acessar(); 
    }
    /**
     * Libera o acesso à homePage do Usuário especifico.
     */
    private void liberaAcessoHome() {
        String login = this.usuario.getNomeUsuario();
        String tipo = this.usuario.getTipoUsuario();

        if (tipo.equals(getFuncionarioAtivo().ADMINISTRADOR)) {
            TelaPrincipal telaprincipal = new TelaPrincipal(getFuncionarioAtivo());
            telaprincipal.setVisible(true);
            telaprincipal.setResizable(false);
        }
        if (tipo.equals(getFuncionarioAtivo().VENDEDOR)) {
            TelaPrincipalVendedor telaprincipal = new TelaPrincipalVendedor(getFuncionarioAtivo());
            telaprincipal.setVisible(true);
            telaprincipal.setResizable(false);
        }
        if (tipo.equals(getFuncionarioAtivo().OP_PRODUCAO)) {
            TelaPrincipalOpProd telaprincipal = new TelaPrincipalOpProd(getFuncionarioAtivo());
            telaprincipal.setVisible(true);
            telaprincipal.setResizable(false);
        }
    }
/**
 * Confere se existe algum usuario, caso não exista, torna o primeiro administrador
 * caso exista realiza a autenticação do mesmo. 
 * @return 
 */
    private boolean acessar() {
        String usuario = this.usuario.getNomeUsuario();
        String senha = this.usuario.getSenhaUsuario();
        if (newLogin.tableIsEmply() == false) {
            this.usuario = newLogin.autenticar(usuario, senha);
            if (this.usuario == null) {
                return false;
            }
            setFuncionarioAtivo(daoFunc.identificarFuncionario(this.usuario.getId()));
            if (this.usuario.getTipoUsuario() != null) {
                liberaAcessoHome();
                return true;
            }
        } else {
            BeansUsuario novoUsuario = new BeansGerente();
            novoUsuario.setNomeUsuario(usuario);
            novoUsuario.setSenhaUsuario(senha);

            String cpf_Usuario = JOptionPane.showInputDialog("Para se tornar o administrador do sistema digite seu CPF:");
            
            while (cpf_Usuario == null || cpf_Usuario.equals("")) {
                cpf_Usuario = JOptionPane.showInputDialog("Para se tornar o administrador do sistema digite seu CPF:");
            }
            if (newLogin.salvar(novoUsuario, cpf_Usuario)) {
                this.usuario = novoUsuario;
                setFuncionarioAtivo((BeansFuncionario) this.usuario);
                liberaAcessoHome();
                return true;
            }
        }

        return false;
    }

    /**
     * Retorna o funcionário que está logado
     * @return the funcionarioAtivo
     */
    public BeansFuncionario getFuncionarioAtivo() {
        return funcionarioAtivo;
    }

    /**
     * * Recebe o funcionário que está logado
     * @param funcionarioAtivo the funcionarioAtivo to set
     */
    public void setFuncionarioAtivo(BeansFuncionario funcionarioAtivo) {
        this.funcionarioAtivo = funcionarioAtivo;
    }

}
