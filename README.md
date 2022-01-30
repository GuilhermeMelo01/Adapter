#   Design Pattern Adapter
***
### PROBLEMA:
Imagine por exemplo que temos que integrar um sistema de pagamentos, todo o sistema foi pensado no **PayPal**, os métodos estão todos de acordo com PayPal, porem agora nos queremos implementar um novo modulo do sistema utilizando a API que ja funciona, e este novo modulo sera os pagamentos por meio do **Payoneer**, o problema é que os metodos possuem nomes diferentes, estruturas diferentes.

agora precisamos adaptar o nosso cliente para consumir tanto do PayPal quanto do Payoneer, só que... nao pode quebrar o que ja esta funcionado



### SOLUÇÃO:
Podemos utilizar o padrão ADAPTER para **converter a interface de um objeto** de maneira que **outro objeto possa compreender as informações.** É um adaptador.

Um adaptador encobre um dos objetos para esconder as regras de negocio e qualquer dificuldade de conversão, isso fica oculto. O objeto encoberto neste caso o PayPal nem fica sabendo que existe um adapter, o adapter só consome a informação.

__Adapter__: Converte a interface de uma classe para outra interface que o codigo cliente espera encontrar. A entidade adaptadora permite que classes com interfaces incompativeis trabalhem juntas.
***

[DIAGRAMA ADAPTER](https://cdn.discordapp.com/attachments/937340483997421593/937340561025798184/diagrama_Adapter.png)
