<h1>O Padrão de Desenho Memento</h1>

O padrão Memento é um padrão comportamental utilizado quando o estado do objeto necessita de ser guardado fora do mesmo, de forma a restaurar esse estado posteriormente. Este padrão é utilizado em situações em que é necessário fazer rollback/undo do estado do objeto ou proteger esse estado de uma forma independente do objeto que o gerou.

<img src='https://sourcemaking.com/files/v2/content/patterns/Memento.png'>
<br><br>
No diagrama anterior

- o Originator é o objeto que cria e interpreta os estados armazenados em objetos Memento

- o Caretaker solicita a criação de objetos Memento e armazena os objetos até serem necessários novamente, mas não tem acesso ao estado do mesmo.

<h3>Aplique o padrão Memento a um serviço de backups que permite guardar snapshots do estado de um servidor responsável por registar o nome de estudantes. Utilize o código seguinte para testar a implementação. </h3>

Server s = new Server();
BackupService backup = new BackupService(s);
backup.takeSnapshot();
s.addStudent("Maria José");
backup.takeSnapshot();
s.addStudent("Manuel António");
System.out.println(s.getStudentNames().size());

backup.restoreSnapshot(1);
System.out.println(s.getStudentNames().size());

<a href='http://ec2-18-220-227-92.us-east-2.compute.amazonaws.com/static/files/MementoPattern/doc/index.html'> Javdocs </a>
