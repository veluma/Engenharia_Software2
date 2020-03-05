<h1>O Padrão de Desenho Bridge</h1>

O padrão Bridge é um padrão estrutural que é utilizado em situações onde queremos separar a abstração da implementação do código.

Neste padrão existe uma dependência do cliente relativamente à interface que permite o acesso a implementações de objetos criados dinamicamente durante a execução da aplicação. Desta forma é possível criar novas implementações sem alterar a estrutura de dependências.

O cliente interage sempre com o objeto que representa a interface com as implementações, que por sua vez delega os pedidos para o objeto pertencente à classe que contém a implementação. Desta forma, a implementação pode ser acrescentada em runtime, sem recompilar a aplicação. A imagem seguinte mostra a estrutura abstrata do padrão.

<img src='https://sourcemaking.com/files/v2/content/patterns/Bridge___.png'>
<br>   

<h3>Aplique o padrão Bridge a um componente que permita o acesso a vários serviços instanciados dinamicamente para armazenar e obter conteúdos.

A classe que serve de interface deve fornecer:

- os métodos gerais presentes na especificação;

- uma especialização do método getContent que permita obter todo o conteúdo agregado de um serviço.

Como o conteúdo está armazenado num hashmap, a classe LinkedHashMap tem de ser utilizada em vez da classe HashMap tradicional, para garantir que os dados sejam acedidos iterativamente pela ordem de inserção.

<a href='http://ec2-18-220-227-92.us-east-2.compute.amazonaws.com/static/files/BridgePattern/doc/index.html'>
JavaDocs</a>
