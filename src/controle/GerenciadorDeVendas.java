package controle;

import SistemaDePagamentos.Interface_de_Connexao;
import SistemaDePagamentos.Controle_pagamentos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modeloBeans.produto.BeansItem;


/**
 * Faz uso da interface de conexão com o sistema externo de pagamentos
 * @author geovanef46
 */
public class GerenciadorDeVendas {
        private Interface_de_Connexao pagamento = new Controle_pagamentos();

	public boolean concluirCompra() {
	   
            return realizarPagamento();
	}

	private boolean realizarPagamento() {
            
            return pagamento.executaPagamento("metodo de pagamento", "data atual", "Descricao do pagamento", null);
	}

        /**
         * Sincroniza duas listas caso uma delas esteja desatualizada
         * @param listaDesatualizada
         * @param listaAtualizada
         * @return 
         */
        public ArrayList sincronizaListas(ArrayList listaDesatualizada, ArrayList listaAtualizada){
            listaDesatualizada.addAll(listaAtualizada);
            
            return listaDesatualizada;//retorna a mais atualizada
        }

        public int pesquisarQtd(int id_movel,List<BeansItem> listaDeItens){
            if(!listaDeItens.isEmpty()){
                for (BeansItem item : listaDeItens) {
                 
                    if(item.getCodProduto() == id_movel){
                        
                    return item.getQtd();
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "A lista de Itens está vazia!");
            }
            return 1;
        }
        
        
}
