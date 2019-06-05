/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Modelo de tabela que fornece a estrutura para a manipulação de tabelas
 * @author geovanef46
 */
public class ModeloTabela extends AbstractTableModel{
    
    private ArrayList linhas = null;
    private String[] colunas = null;

    public ModeloTabela(ArrayList linhas, String[] colunas) {
        setLinhas(linhas);
        setColunas(colunas);
    }

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    public String getColumnName(int numCol){
        return colunas[numCol];
    }

    @Override
    public Object getValueAt(int numLin, int numCol) {
        Object[] linha = (Object[]) getLinhas().get(numLin);
        return linha[numCol];
    }

}
