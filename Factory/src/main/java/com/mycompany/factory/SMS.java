/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author igorb
 */
public class SMS implements Notificacao{
    @Override
    public void enviar() {
        System.out.println("Notificacao enviada por SMS...");
    }
}
