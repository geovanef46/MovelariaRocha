/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDePagamentos;

/**
 * Classe de controle de acesso do sistema externos
 * @author geovanef46
 */
public class Controle_pagamentos implements Interface_de_Connexao {
    
        @Override
    public boolean executaPagamento(String metodo, String data, String descricao, Double valor) {
        return realizarPagamento(metodo, data, descricao, valor); 
    }
    
    public boolean realizarPagamento(String metodo, String data, String descricao, Double valor){
        Pagamento pag = new Pagamento(metodo, data, descricao, valor);
            return pagar(pag);
    }
        
    private boolean pagar(Pagamento p){
        
        return true;
    }
}
