/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factory;

import notificacoes.FabricaEmail;
import notificacoes.FabricaNotificacao;
import notificacoes.FabricaPushNotification;
import notificacoes.FabricaSMS;

/**
 *
 * @author igorb
 */
public class main {

    public static void main(String[] args) {
        FabricaNotificacao fabricaEmail = new FabricaEmail();
        FabricaNotificacao fabricaSMS = new FabricaSMS();
        FabricaNotificacao fabricaPush = new FabricaPushNotification();
        
        Notificacao email = fabricaEmail.criarNotificacao();
        Notificacao sms = fabricaSMS.criarNotificacao();
        Notificacao push = fabricaPush.criarNotificacao();
        
        email.enviar();
        sms.enviar();
        push.enviar();
    }
}
