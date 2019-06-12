/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modeloBeans.empresa.BeansCliente;
import modeloBeans.empresa.BeansEmpresa;
import modeloBeans.empresa.BeansFornecedor;
import modeloBeans.funcionario.BeansFuncionario;
import modeloBeans.produto.BeansMateria_prima;
import modeloBeans.produto.BeansMovel;
import modeloBeans.produto.BeansProduto;
import modeloDAO.DaoProduto;
import modeloDAO.DaoFuncionario;
import modeloDAO.DaoEmpresa;


/**
 * Esta Classe tem o papel de uma Fachada
 * agregando os métodos de diversas entidadesBD
 * e disponibilizando-os.
 *
 * @author geovanef46
 */
public class GerenciadorDeBD {

    private DaoProduto Daocontrol = new DaoProduto();
    private DaoFuncionario DaoFunc = new DaoFuncionario();
    private DaoEmpresa DaoLoja = new DaoEmpresa();

    //-------------------------------Produto-Movel--------------------------------------------
    public void salvarMovel(BeansMovel modelo) {
        Daocontrol.salvar(modelo);
    }

    public BeansProduto buscaProdutoPorNome(BeansMovel mod) {
        return Daocontrol.buscaProdutoPorNome(mod);
    }

    public void editar(BeansMovel modelo) {
        Daocontrol.editar(modelo);
    }

    public void excluir(BeansMovel modelo) {
        Daocontrol.excluir(modelo);
    }

    public ArrayList PreencherTabela(String sql) {
        return Daocontrol.PreencherTabela(sql);
    }

    public BeansProduto selecionaMovel(String nome) {

        return Daocontrol.selecionaMovel(nome);
    }
    
     public BeansProduto selecionaMovel(int id) {

        return Daocontrol.selecionaMovel(id);
    }

    //--------------------------------Produto-Materia-Prima------------------------------
    public void salvarMPrima(BeansMateria_prima modelo) {
        Daocontrol.salvar(modelo);
    }

    public ArrayList PreencherTabelaMP(String sql) {
        return Daocontrol.PreencherTabelaMP(sql);
    }

    public BeansProduto buscaProdutoPorNome(BeansMateria_prima mod) {
        return Daocontrol.buscaProdutoPorNome(mod);
    }

    public void editar(BeansMateria_prima modelo) {
        Daocontrol.editar(modelo);
    }

    public void excluir(BeansMateria_prima modelo) {
        Daocontrol.excluir(modelo);
    }

    public BeansProduto selecionaMPrima(String nome) {

        return Daocontrol.selecionaMPrima(nome);
    }

    public BeansMovel recuperaProduto(int cod, BeansMovel modelo) {
        return Daocontrol.recuperaProduto(cod, modelo);
    }
    //------------------------------Funcionario-----------------------------------------------

    public BeansFuncionario buscarFuncionario(String CPF) {

        return DaoFunc.buscaFuncionarioPorCPF(CPF);
    }

    public void salvar(BeansFuncionario modelo) {
        DaoFunc.salvar(modelo);
    }
    
    public BeansFuncionario selecionaFunc(String nome){
       return DaoFunc.buscaFuncionarioPorNome(nome);
    }
    
    public BeansFuncionario selecionaFunc(BeansFuncionario func){
       return DaoFunc.buscaFuncionarioPorNome(func);
    }
    
     public ArrayList PreencherTabelaFunc(String sql) {
        return DaoFunc.PreencherTabelaFunc(sql);
    }
    //--------------------------------Empresa--------------------------------------------------
    public BeansFornecedor buscaLojaPorNome(BeansFornecedor modelo) {
        return DaoLoja.buscaLojaPorNome(modelo);
    }

    public BeansCliente buscaLojaPorNome(BeansCliente modelo) {
        return DaoLoja.buscaLojaPorNome(modelo);
    }

    public BeansCliente buscaLojaPorTipo(BeansCliente modelo) {
        return DaoLoja.buscaLojaPorTipo(modelo);
    }

    public BeansFornecedor buscaLojaPorTipo(BeansFornecedor modelo) {
        return DaoLoja.buscaLojaPorTipo(modelo);
    }

    public BeansCliente buscaLojaPorCNPJ(String CNPJ_loja) {
        return DaoLoja.buscaLojaPorCNPJ(CNPJ_loja);
    }

    public ArrayList PreencherTabelaLoja(String sql) {
        return DaoLoja.PreencherTabelaLoja(sql);
    }

    public void salvar(BeansEmpresa modelo) {
        DaoLoja.salvar(modelo);
    }

    public void salvaFornecido(BeansFornecedor modeloFornecedor, BeansMateria_prima modeloMP, BeansFuncionario func) {
        DaoLoja.salvarFornecido(modeloFornecedor, modeloMP, func);
    }

    /**
     *
     * @param valor
     * @return
     */
    public int converterInt(String valor) {
        int formatado = 0;
        if (valor.equals("")) {
            formatado = 0;
        } else {
            try {
                  formatado = Integer.valueOf(valor);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro ao converter valores");
            }
          
        }
        return formatado;
    }

    public String converterValores(double valor) {
        String formatado;
        formatado = String.valueOf(valor);
        formatado = formatado.replace(".", ",");
        return formatado;
    }

    public double converterValores(String valor) {
        double formatado;
        String doubleWord = valor.replace(".", "");
        doubleWord = doubleWord.replace(",", ".");
        formatado = Double.valueOf(doubleWord);
        return formatado;
    }

}
