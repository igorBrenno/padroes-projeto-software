/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author 201813530017
 */
public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Botão estilo Mac Renderizado.");
    }
}
