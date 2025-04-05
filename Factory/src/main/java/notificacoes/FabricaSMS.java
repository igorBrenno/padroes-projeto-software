/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacoes;

import com.mycompany.factory.Notificacao;
import com.mycompany.factory.SMS;

/**
 *
 * @author igorb
 */
public class FabricaSMS extends FabricaNotificacao{
    @Override
    public Notificacao criarNotificacao() {
        return new SMS();
    }
}
