/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans.funcionario;


/**
* Classe Beans da entidade Funcionario do tipo gerente
 * @author geovanef46
 */
public class BeansGerente extends BeansFuncionario{

    public BeansGerente() {
       super.setTipoUsuario(ADMINISTRADOR);//faz do gerente um administrador 
       
    }

   
    @Override 
    public void criarSenha(String senhaUsuario) {
        super.criarSenha(senhaUsuario+"@"+GERENTE); 
    }
    
    
    
}
