/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans.produto;


/**
 * Classe Beans da entidade Item de um produto(Movel)
 * @author geovanef46
 */
public class BeansItem {
    private int codItem;
    private int qtd = 1;//por default
    private int codProduto;
    private double valor;


    /**
     * @return the codItem
     */
    public int getCodItem() {
        return codItem;
    }

    /**
     * @param codItem the codItem to set
     */
    public void setCodItem(int codItem) {
        this.codItem = codItem;
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
    
    
    
        
//    public boolean isNull(){
//       if(
//        this.cor != null&&this.cor.equals("Selecione")&&
//        this.descricao != null&&this.descricao.isEmpty()&&
//        this.marca != null&&this.marca.isEmpty()&&
//        this.nome != null&&this.nome.isEmpty()&&
//        this.preco != null&&this.preco.isEmpty()&&
//        this.tipo != null&&this.tipo.isEmpty()&&
//        this.qtd != 0){
//           return true;
//       }else{
//     return false;  
//       }
//    }

    /**
     * @return the codProduto
     */
    public int getCodProduto() {
        return codProduto;
    }

    /**
     * @param codProduto the codProduto to set
     */
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
   }

