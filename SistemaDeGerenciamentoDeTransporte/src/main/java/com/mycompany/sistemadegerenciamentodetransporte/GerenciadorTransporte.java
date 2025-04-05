/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodetransporte;

/**
 *
 * @author igorb
 */
public class GerenciadorTransporte {
    private static GerenciadorTransporte instance;
    
    private GerenciadorTransporte() {}
    
    public static GerenciadorTransporte getInstance() {
        if (instance == null) {
            instance = new GerenciadorTransporte();
        }
        return instance;
    }
    
    public Transporte solicitarTransporte(String tipo) {
        TransporteFactory factory = null;
                
        if (tipo.equalsIgnoreCase("caminhao")) {
            factory = new CaminhaoFactory();
        } else if (tipo.equalsIgnoreCase("navio")) {
            factory = new NavioFactory();
        }
        return factory != null ? factory.criarTransporte(): null;
    }
}
