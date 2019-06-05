/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans.funcionario;



/**
 * Classe Beans da entidade Funcionario
 * @author geovanef46
 */
public class BeansFuncionario extends BeansUsuario{
    private String CPF;
    private String nome;
    private String rua, bairro, cidade, CEP;
    private int numero;
    private int telefone;
    private int telefone2;
    private String tipoFunc;
    private String pesquisa;
    public final String GERENTE = "GERENTE";
    public final String OP_PRODUCAO = "OP_PRODUCAO";
    public final String VENDEDOR = "VENDEDOR";



    
    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the telefone
     */
    public int getTelefone01() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the telefone2
     */
    public int getTelefone02() {
        return telefone2;
    }

    /**
     * @param telefone2 the telefone2 to set
     */
    public void setTelefone2(int telefone2) {
        this.telefone2 = telefone2;
    }


    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    
    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
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
     * @return the tipoFunc
     */
    public String getTipoFunc() {
        return tipoFunc;
    }

    /**
     * @param tipoFunc the tipoFunc to set
     */
    public void setTipoFunc(String tipoFunc) {
        this.tipoFunc = tipoFunc;
    }



   }

