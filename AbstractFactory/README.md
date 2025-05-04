# Crie uma nova família de componentes chamada MinimalFactory:

* MinimalButton, MinimalCheckbox e MinimalMenu.

* Implemente uma nova classe MinimalFactory que implementa GUIFactory e cria os 
componentes minimalistas.

* Altere o código do Main para permitir selecionar o tema com base em uma variável (ex: "minimal"), além dos sistemas "mac" e "windows".

> Use um FactoryProducer que recebe uma string ("windows", "mac", "minimal") e retorna a fábrica correta.

Ex.:

```
public class FactoryProducer {
    public static GUIFactory getFactory(String type) {
        if (type.equalsIgnoreCase("windows")) {
            // retorne o obj correto
        } else if (type.equalsIgnoreCase("mac")) {
           // retorne o obj correto
        } else if (type.equalsIgnoreCase("minimal")) {
            // retorne o obj correto
        }
        throw new IllegalArgumentException("Tipo de fábrica não suportado: " + type);
    }
}
```