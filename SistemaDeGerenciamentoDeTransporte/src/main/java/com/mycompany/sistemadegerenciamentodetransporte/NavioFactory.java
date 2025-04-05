/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodetransporte;

/**
 *
 * @author igorb
 */
public class NavioFactory extends TransporteFactory{
    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}
