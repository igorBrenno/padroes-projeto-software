/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author 201813530017
 */
public class MinimalFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MinimalButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MinimalCheckbox();
    }
    
    public Menu createMenu() {
        return new MinimalMenu();
    }
}
