/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gerenciamentoempresarial;

/**
 *
 * @author igorb
 */
public class main {

    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance(
        new ConfigurationManager.Builder("Minha Empresa Ltda")
        .idioma("en-US")
        .fusoHorario("UTC")
        .tema("escuro")
        .tamanhoFonte(14)
);
        
        System.out.println(config);
        
        ConfigurationManager config2 = ConfigurationManager.getInstance(
        new ConfigurationManager.Builder("Minha Empresa Ltda")
        .tema("claro")
);        
        System.out.println("\nVerificando singleton:");
        System.out.println(config == config2);
    }
}
