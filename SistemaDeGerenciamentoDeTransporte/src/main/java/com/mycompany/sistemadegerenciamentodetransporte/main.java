/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadegerenciamentodetransporte;

/**
 *
 * @author igorb
 */
public class main {

    public static void main(String[] args) {
        GerenciadorTransporte gerenciador = GerenciadorTransporte.getInstance();
        
        Transporte t1 = gerenciador.solicitarTransporte("Navio");
        t1.entregar();
        
        
        Transporte t2 = gerenciador.solicitarTransporte("Caminhao");
        t2.entregar();
    }
}
