# Método Factory
* O método factory é um padrão de design que permite a criação de objetos sem especificar a classe exata de que se trata. Em vez disso, o método factory retorna um objeto que implementa uma interface ou uma classe abstrata.

#
# Funcionalidades

* Permite a criação de objetos sem especificar a classe exata.

* Retorna um objeto que implementa uma interface ou uma classe abstrata.

* Encapsula a lógica de criação de objetos.

* Permite a troca de implementações sem afetar o código cliente.

#
# Exemplo de Uso
```
public class FabricaDeCarros {
    public static Carro criarCarro(String tipo) {
        if (tipo.equals("sedan")) {
            return new Sedan();
        } else if (tipo.equals("hatch")) {
            return new Hatch();
        } else {
            throw new UnsupportedOperationException("Tipo de carro não suportado");
        }
    }
}

public abstract class Carro {
    public abstract void ligar();
}

public class Sedan extends Carro {
    @Override
    public void ligar() {
        System.out.println("Ligando sedan...");
    }
}

public class Hatch extends Carro {
    @Override
    public void ligar() {
        System.out.println("Ligando hatch...");
    }
}

```

#
# Vantagens

* Permite a criação de objetos complexos de forma simplificada.

* Encapsula a lógica de criação de objetos.

* Permite a troca de implementações sem afetar o código cliente.

#
# Desvantagens

* Pode ser difícil de entender e manter se a lógica de criação for complexa.

* Pode criar dependências entre classes.

#
# Crie um sistema que gerencie diferentes tipos de notificações.
Implemente um Factory Method que crie diferentes tipos de
notificação, como E-mail, SMS e Push Notification.

#
# Sugestão:

* Criar uma interface Notificacao com um método enviar().

* Criar as classes concretas Email, SMS e PushNotification.

* Criar uma classe abstrata FabricaNotificacao com um método abstrato criarNotificacao().

* Implementar classes concretas FabricaEmail, FabricaSMS
e FabricaPushNotification.

* Criar um programa principal para testar a fábrica.