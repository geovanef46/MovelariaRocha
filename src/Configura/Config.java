/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configura;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansConfig;
import org.json.JSONObject;

/**
 *
 * @author geovanef46
 */
public class Config {
    
    JSONObject config_json;
    BeansConfig configAtual;
    String patch = "src/Configura/Config.json";
    private static Config unicaInstancia;

    private Config() {
    lerJson();
    }
   
        /**
     *  Aplicação do padrão Singleton 
     *  Fornecendo a criação de apenas uma instância para gerar configuraçoes personalizadas ou padrao
     * @return  Uma instancia unica da classe
     */
    public static synchronized Config getInstance(){
               if (unicaInstancia == null) {
            unicaInstancia = new Config();
        }
     return unicaInstancia;
    }
    
    
    private void lerJson(){
         String strJson = "";
        File file = new File(patch);
        if(file.exists()){
        try {
            BufferedReader fileBR = new BufferedReader(new FileReader(file));
            while (fileBR.ready()) {                
                strJson += fileBR.readLine();
                System.out.println(strJson);                                        ////
            }
            fileBR.close();
            config_json = new JSONObject(strJson.trim());
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            try {
                JOptionPane.showMessageDialog(null,"Arquivo de inicialização não encontrado!");
                file.createNewFile();
                  
            } catch (IOException ex) {
                Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    private JSONObject criaNewJson(JSONObject newJson,String str){
        
        JSONObject json= new JSONObject(str);
        newJson
                .accumulate("novaConfig",json);
        return newJson;
    }
    
    /**
     * Caso exista uma config valida 
     * @return a configuracao atual   else Retorna null 
     *
     */
    public BeansConfig usarConfig() throws NullPointerException{
        
        System.out.println("\n Config Padrão= "+ config_json.getJSONObject("config").toString());
        System.out.println("Ultima Config = "+ config_json.getJSONObject("novaConfig").getString("senha"));
        if(configAtual != null){
       salvarJson();
        }
       return configAtual;
    }
    
    
    public void recebeDados(BeansConfig config){
        String str="";
        try {
              config.gerarCaminho();
        str =  "{'senha':'"+config.getSenha()+"','bd':'"+config.getBancoDeDados()+"','usuario':'"+config.getUsuario()+"','caminho':'"+config.getCaminhoGerado()+"'}";
      
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Configuracao inválida! Usando Configuracao Padrao...");
            str = config.getPadrao();
            
        }
       
      
        config_json = criaNewJson(config_json,str);
        configAtual = config;
        
        System.out.println("Nova Config = "+ config_json.getJSONObject("novaConfig").toString());//JSONObject.toString ////
        
    }
    
    private void salvarJson(){
     
        try {
                     
            BufferedWriter Bwrite = new BufferedWriter(new FileWriter(patch));
            //Escreve no arquivo conteudo do Objeto JSON
            Bwrite.write(config_json.toString());
            Bwrite.close();
           JOptionPane.showMessageDialog(null,"Nova Configuracao Salva!");
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
        }


}
