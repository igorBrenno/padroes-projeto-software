/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author 201813530017
 */
public class Main {

    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();

        GUIFactory factory = FactoryProducer.getFactory(os);
        Application app = new Application(factory);
        app.createUI();
        app.paint();

    }

}
