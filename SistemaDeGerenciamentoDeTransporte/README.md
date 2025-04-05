# Sistema de Gerenciamento de Transporte


# Contexto:

* Uma empresa de logística deseja implementar um Sistema de Gerenciamento de Transporte. O sistema precisa criar diferentes tipos de transportes (Caminhão e Navio) usando o Factory Method, garantindo que apenas uma única instância do gerenciador de transporte seja utilizada (padrão Singleton).

#
# Objetivo:
* Usar Factory Method para criar diferentes tipos de transporte.
* Implementar um Singleton para garantir que o sistema de gerenciamento de transporte tenha apenas uma única instância.

#
# Passo a Passo:

* Crie uma interface Transporte com o método entregar().

* Implemente duas classes concretas:  
    
    * Caminhao que imprime "Entrega feita por Caminhão"
    
    * Navio que imprime "Entrega feita por Navio"

* Crie uma classe abstrata TransporteFactory com um método abstrato criarTransporte().

* Implemente duas fábricas concretas:
    
    * CaminhaoFactory que retorna um objeto Caminhao
    
    * NavioFactory que retorna um objeto Navio

* Crie a classe GerenciadorTransporte  como um Singleton.  Essa classe deve:
    
    * Ter um método solicitarTransporte(String tipo), que recebe o tipo de transporte e usa o Factory Method para criá-lo.
    
    * Garantir que apenas uma única instância  da classe seja utilizada.

* Crie uma classe principal (Main) que:
    
    *  Obtém a instância do GerenciadorTransporte.
    
    * Solicita um transporte do tipo "caminhao".
    
    * Solicita um transporte do tipo "navio".
    
    * Chama o método entregar() dos objetos criados.