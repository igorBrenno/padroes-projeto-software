package notificacoes;

import com.mycompany.factory.Email;
import com.mycompany.factory.Notificacao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igorb
 */
public class FabricaEmail extends FabricaNotificacao {
    @Override
    public Notificacao criarNotificacao() {
        return new Email();
    }
}
