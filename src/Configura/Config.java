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
import org.json.JSONObject;

/**
 *
 * @author jason
 */
public class Config {
    
    JSONObject config_json;
   

    public void lerJson(){
         String strJson = "";
        File file = new File("src/Configura/Config.json");
        if(file.exists()){
        try {
            BufferedReader fileBR = new BufferedReader(new FileReader(file));
            while (fileBR.ready()) {                
                strJson += fileBR.readLine();
                System.out.println(strJson);
            }
            fileBR.close();
            config_json = new JSONObject(strJson.trim());
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            try {
                System.out.println("Arquivo de inicialização não encontrado!");
                file.createNewFile();
                  
            } catch (IOException ex) {
                Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public JSONObject criaNewJson(JSONObject newJson,String str){
        
        JSONObject json= new JSONObject(str);
        newJson
                .accumulate("novaConfig",json);
        return newJson;
    }
    public void imprimeJson(){
        if(config_json != null){
        
        System.out.println("\n Config Padrão= "+ config_json.getJSONObject("config").toString());
        System.out.println("Ultima Config = "+ config_json.getJSONObject("novaConfig").getString("senha"));
        
       salvarJson();
        }else{
            recebeDados();
            System.out.println("Arquivo de inicialização não encontrado!");
        }
    }
    
    public void recebeDados(){
        String str =  "{'senha':'root2','bd':'movelariaRocha2','usuario':'root2','caminho':'localhost:3306'}";
      
        config_json = criaNewJson(config_json,str);
        
        System.out.println("Nova Config = "+ config_json.getJSONObject("novaConfig").toString());//JSONObject.toString
        
    }
    public void salvarJson(){
        System.out.println("Salvando dados...");
        try {
                     
            BufferedWriter Bwrite = new BufferedWriter(new FileWriter("src/Configura/Config.json"));
            //Escreve no arquivo conteudo do Objeto JSON
            Bwrite.write(config_json.toString());
            Bwrite.close();
            System.out.println("Dados Salvos!");
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

        
    
    public static void main(String[] args) {
       Config con = new Config();
       con.lerJson();
      con.imprimeJson();
    }
}
