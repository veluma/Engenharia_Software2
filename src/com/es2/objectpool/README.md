<h2>O Padrão de Desenho Object Pool</h2>

A criação de pools de objetos é uma prática popular para aumentar a eficiência de aplicações onde o custo e a frequência de instanciação de classes são elevados e o número de objetos a ser utilizados é pequeno. A eficiência do processo de criação de objetos é assegurada pela reutilização de objetos já existentes na pool.

O padrão de desenho Object Pool é um padrão estrutural que define o design de uma pool de objetos. Um processo pode reutilizar objetos da pool quando estes já não forem utilizados por nenhum outro processo.

<img src='https://sourcemaking.com/files/v2/content/patterns/Object_pool1.png'>

<br>
De forma a evitar que um processo fiquei à espera de um objeto, a pool pode criar novos objetos. Para evitar desperdício de recursos do sistema, a pool deve implementar um mecanismo de eliminação periódica de objetos.

Para garantir uma política de criação de objetos coerente, a classe que implementa a pool deve ser TestSingleton.

<h3>Aplique o padrão Object Pool à criação de uma pool de conexões para a página do IPV, utilizando objetos do tipo HttpURLConnection.

A pool é inicializada para não permitir mais do que 10 conexões por defeito. De forma a evitar problemas de concorrência, esta classe deve ser desenhada para ser thread-safe.</h3>
<a href='http://ec2-18-220-227-92.us-east-2.compute.amazonaws.com/static/files/ObjectPoolPattern/doc/index.html'>
JavaDocs </a>

