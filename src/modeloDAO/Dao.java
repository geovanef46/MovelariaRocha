/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

/**
 * Interface que força a implementação dos métodos base do DAO (Data Acess Object)
 * @author geovanef46
 */
public interface Dao {
    
    public boolean salvar(Object objeto);
    
    public boolean excluir(Object objeto);
    
    public boolean editar(Object objeto);
    
    public boolean seleciona(Object objeto);
}
