<h1>O Padrão de Desenho Factory Method</h1>

A arquitetura de muitos frameworks abriga à definição de uma interface comum para a criação de objetos, sem comprometer as especificidades de cada objeto.

O padrão Factory Method permite definir uma interface para a criação desses objetos. Neste padrão, a superclasse do objeto a criar implementa o comportamento genérico, enquanto que as subclasses instanciadas pelos clientes implementam os detalhes da criação.

<img src='http://ec2-18-220-227-92.us-east-2.compute.amazonaws.com/static/files/FactoryPattern/resources/product.png'>

<br></br>
O desenho dos argumentos do método da fábrica utilizada para criar o objeto permite a identificação da classe derivada a instanciar. Para evitar várias formas de instanciação, os construtores não podem ser públicos e o método da fábrica deve ser static.

Este padrão pode ser complementado com uma object pool para reutilizar objetos. Desta forma objetos com o mesmo estado podem ser reutilizados.

<h3>Aplique o padrão Factory Method à criação dos objetos Computer e Software.</h3>
<a href='http://ec2-18-220-227-92.us-east-2.compute.amazonaws.com/static/files/FactoryPattern/doc/index.html'>
_**JavaDocs**_</a>    
