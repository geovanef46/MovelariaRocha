package SistemaDePagamentos;

/**
 * Interface fornecida pelo sistema externo de pagamentos 
 * @author geovanef46
 */
public interface Interface_de_Connexao {
   public boolean executaPagamento(String metodo, String data, String descricao, Double valor);
}
