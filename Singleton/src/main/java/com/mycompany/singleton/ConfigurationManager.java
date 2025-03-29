/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author igorb
 */

public class ConfigurationManager {
    private static ConfigurationManager instance;
    HashMap<String, String> config = new HashMap<>();
    private  ConfigurationManager() {}
    
    public static ConfigurationManager getInstance(){
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void setConfig(String key, String value) {
        config.put(key, value);
    }

    public String getConfig(String key) {
        return config.get(key);
    }

    public String showConfigs(){
        if (config.isEmpty()) {
            System.out.println("Sem Configuração!");
        } else {
            for (Map.Entry<String, String> entry : config.entrySet()) {
                System.out.println("Chave: " + entry.getKey() + " | Valor: " + entry.getValue());
            }
        }
        return null;
    }


}