package controle;

import SistemaDePagamentos.Interface_de_Connexao;
import SistemaDePagamentos.Controle_pagamentos;
import java.util.ArrayList;


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

}
