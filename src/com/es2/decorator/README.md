<a href='https://sourcemaking.com/design_patterns/decorator'> <img src='https://sourcemaking.com/images/content-public/logos/logo.png'> </a>

<h1>O Padrão de Desenho Decorator</h1>

O padrão Decorator é um padrão estrutural que permite adicionar novas responsabilidades (comportamento/estado) aos objetos em runtime. Desta forma, a construção das características de um objeto solicitada pelo cliente dinamicamente.

Este padrão fornece uma alternativa à herança para estender a funcionalidade de uma classe. Para exemplificar o conceito, considere o diagrama seguinte.

<img src='https://sourcemaking.com/files/v2/content/patterns/Decorator_.png'> 
<br>

No diagrama anterior, a classe Window representa o objeto principal do padrão, enquanto que a classe Decorator e derivadas representam a lógica adicional que pode ser adicionada ao objeto principal dinamicamente. Para exemplificar, o código seguinte adiciona os elementos necessários para criar uma estrutura composta pelo objeto principal Window e outros objetos utilizados para fazer a decoração de uma janela (scrollbar vertical, scrollbar horizontal e contorno).

<h3>Aplique o padrão Decorator a um componente responsável por fazer a autenticação de um serviço. Este componente deverá permitir decorar a funcionalidade principal com funcionalidades de:

- logging

- verificação de palavras inseguras na password, recorrendo a uma API REST que permite verificar se a palavra utilizada durante o processo de autenticação é insegura (faz parte do dicionário).

<a href='http://ec2-18-220-227-92.us-east-2.compute.amazonaws.com/static/files/DecoratorPattern/doc/index.html'>Javadocs</a>
