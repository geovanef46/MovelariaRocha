/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans.produto;

/**
 *
 * Classe Beans da entidade Generalizada Produto
 * @author geovanef46
 */
public class BeansProduto {
    
    private int codigo;
    private int qtd = 0;
    private String preco;
    private String nome;
    private String descricao;
    private String pesquisa;
    private String cpfOpProducao;
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }



    /**
     * @return the preco
     */
    public String getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }
    
        /**
     * @return the cpfOpProducao
     */
    public String getCpfOpProducao() {
        return cpfOpProducao;
    }

    /**
     * @param cpfOpProducao the cpfOpProducao to set
     */
    public void setCpfOpProducao(String cpfOpProducao) {
        this.cpfOpProducao = cpfOpProducao;
    }

    
    public boolean isNull(){
       if(
        this.descricao != null&&this.descricao.isEmpty()&&
        this.nome != null&&this.nome.isEmpty()&&
        this.preco != null&&this.preco.isEmpty()&&
        this.qtd != 0){
           return true;
       }else{
     return false;  
       }
    }
    
}
