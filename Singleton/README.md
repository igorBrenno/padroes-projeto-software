#
* Implemente o padrão Singleton para gerenciar uma única instância de um objeto de configurações que armazena as configurações globais de um sistema.

#
# Contexto

* Você está desenvolvendo um sistema que possui configurações globais que podem ser acessadas em diferentes partes do programa, como a configuração de idioma, tema e modo de operação (ex.: produção ou desenvolvimento). Para evitar que essas configurações sejam criadas e modificadas várias vezes, você deve aplicar o padrão Singleton.

#
# Passo a Passo

* Crie uma classe ConfigurationManager que gerencie as configurações globais do sistema.

* Garanta que a classe tenha apenas uma instância, independentemente do número de vezes que ela seja instanciada.

* A classe deve fornecer um método getInstance() que retorna a única instância criada.

* Implemente métodos para: setConfig(String key, String value) para adicionar ou atualizar configurações e getConfig(String key) para obter o valor de uma configuração.

* Implemente uma função showConfigs() que imprima todas as configurações armazenadas.

* Teste a implementação criando duas instâncias da classe ConfigurationManager e verifique se ambas referenciam a mesma instância. 

* Após isso, adicione algumas configurações e imprima as configurações para verificar se a única instância está sendo utilizada.

* A classe ConfigurationManager deve ter um atributo estático instance para armazenar a única instância.

* O construtor da classe deve ser privado para evitar a criação direta de instâncias fora da classe.

* O método getInstance() deve ser responsável por garantir a criação da única instância.

* A implementação pode ser feita em qualquer linguagem de acordo com sua preferência.

#

# Esse projeto foi feito usando o netbeans, recomendo usar o mesmo para testar o projeto.