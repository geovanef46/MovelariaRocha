/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import modeloBeans.produto.BeansItem;
import java.sql.Date;
import java.util.List;
import modeloBeans.empresa.BeansCliente;

/**
 * Classe Beans da entidade compra
 * @author geovanef46
 */
public class BeansCompra {
    private Date data;
    private List<BeansItem> listItens;
    private BeansCliente cliente;
    private String vendedor_CPF;
    

    public BeansCompra(Date data, List<BeansItem> listItens, BeansCliente cliente){
        this.data = data;
        this.listItens = listItens;
        this.cliente = cliente;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the listItens
     */
    public List<BeansItem> getListItens() {
        return listItens;
    }

    /**
     * @param listItens the listItens to set
     */
    public void setListItens(List<BeansItem> listItens) {
        this.listItens = listItens;
    }

    /**
     * @return the cliente
     */
    public BeansCliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(BeansCliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the vendedor_CPF
     */
    public String getVendedor_CPF() {
        return vendedor_CPF;
    }

    /**
     * @param vendedor_CPF the vendedor_CPF to set
     */
    public void setVendedor_CPF(String vendedor_CPF) {
        this.vendedor_CPF = vendedor_CPF;
    }
    
    
}
