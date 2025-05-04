/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author 201813530017
 */
public class FactoryProducer {

    public static GUIFactory getFactory(String tipo) {
        if (tipo.contains("windows")) {
            return new WinFactory();
        } else if (tipo.contains("mac")) {
            return new MacFactory();
        } else if (tipo.contains("minimal")) {
            return new MinimalFactory();
        }
        throw new IllegalArgumentException("Tipo de fábrica não suportado: " + tipo);

    }
}
