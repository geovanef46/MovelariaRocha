/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modeloDAO.DaoRelatorio;

/**
 * Gerencia a criação de relatorios
 * @author geovanef46
 */
public class GerenciadorDeRelatorio {
    
        private DaoRelatorio DaoRelatorio = new DaoRelatorio();
        
        
    public ArrayList PreencherRelatorioEntrada(String sql) {
            return DaoRelatorio.PreencherRelatorioEntrada(sql);
    }
    
//    public String retornaQTDRelatorio(ArrayList<String> dados){
//
//    }
    
}
