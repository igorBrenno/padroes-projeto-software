/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author 201813530017
 */
public class Application {
    private GUIFactory factory;
    private Button button;
    private Checkbox check;
    
    public Application(GUIFactory f) {
        this.factory = f;
        this.button = factory.createButton();
        this.check = factory.createCheckbox();
    }
    
    public void createUI() {
        this.button = factory.createButton();
        this.check = factory.createCheckbox();
    }
    
    public void paint() {
        button.paint();
        check.paint();
    }
}
