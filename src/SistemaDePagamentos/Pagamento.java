/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDePagamentos;



public class Pagamento {
private Long ID;
private String metodo;
    private String data;
    private String descricao;
    private Double valor;

    public Pagamento(String metodo, String data, String descricao, Double valor) {
        setID();
        this.metodo = metodo;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }
    

    public Pagamento() {
        setID();
    }
    
    
    /**
     * @return the ID
     */
    public Long getID() {
        
        return ID;
    }

    /**
     * 
     */
    public void setID() {
        this.ID = ID;
    }

    /**
     * @return the metodo
     */
    public String getMetodo() {
        return metodo;
    }

    /**
     * @param metodo the metodo to set
     */
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
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
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }


    
}
