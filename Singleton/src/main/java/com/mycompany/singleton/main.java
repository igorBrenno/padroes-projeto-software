/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singleton;

/**
 *
 * @author igorb
 */
public class main {

    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        // ConfigurationManager config2 = ConfigurationManager.getInstance();
        
        /*
        if (config1 == config2) {
            System.out.println("Instancias sao iguais");
        } else {
            System.out.println("Instancias sao diferentes");
        }
        */
        
        config1.setConfig("Porta", "8080");
        config1.setConfig("URL", "www.google.com");
        config1.setConfig("Administrador", "Largatixa");
        
        System.out.println(config1.showConfigs());
    }
  }

