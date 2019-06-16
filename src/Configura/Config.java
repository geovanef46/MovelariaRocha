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
import org.json.JSONException;
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
        lerJson();
        
        if(configAtual != null){
       salvarJson();
        }else{
            try{
                configAtual = new BeansConfig();
         configAtual.setBancoDeDados(config_json.getJSONObject("novaConfig").getString("bd")); 
         configAtual.setSenha(config_json.getJSONObject("novaConfig").getString("senha"));
         configAtual.setUsuario(config_json.getJSONObject("novaConfig").getString("usuario"));
         configAtual.setCaminhoGerado(config_json.getJSONObject("novaConfig").getString("caminho"));
            }catch(JSONException jex){
                
                      configAtual.gerarCaminho();
                      String str =  "{'senha':'"+configAtual.getSenha()+"','bd':'"+configAtual.getBancoDeDados()+"','usuario':'"+configAtual.getUsuario()+"','caminho':'"+configAtual.getCaminhoGerado()+"'}";
                      criaNewJson(config_json, str);
                      salvarJson();
            }
         
        }
        configAtual.gerarCaminho();
       return configAtual;
    }
    
    
    public void recebeDados(BeansConfig config){
        lerJson();
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
        
        
    }
    
    private void salvarJson(){
     
        try {
                     
            BufferedWriter Bwrite = new BufferedWriter(new FileWriter(patch));
            //Escreve no arquivo conteudo do Objeto JSON
            Bwrite.write(config_json.toString());
            Bwrite.close();
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
        }


}
