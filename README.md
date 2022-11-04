# parking-lot
## Tecnologias

* Java versão 11
* Spring Boot versão 2.7.5
* PostgreSQL versão 15
<p>Para rodar o projeto localmente é necessário que o Java e o PostgreSQL estejam instaldos na máquina. 
As demais dependências são instaladas após clonar o projeto e rodar o pom.xml.</p>

## Conexão com o Banco de Dados

<p>O perfil padrão do projeto é o perfil de Dev. As credenciais de acesso ao banco podem ser acessadas 
em:</p> 

`src/main/resources application.properties` 

<p>Para testes locais é sugerido utilizar o perfil de Dev.</p>

<p>Para se conectar ao banco pela primeira vez é necessário acessar o PostgeSQL e criar uma nova base com o nome, usuário e senha especificados 
no arquivo de application.properties. Após, ainda no PostgreSQL, é necessáro rodar a query:</p>

`create table tb_parking (id bigserial not null, plate varchar(255), paid boolean, left_parking boolean, 
start_time timestamp with time zone,
end_time timestamp with time zone,
total_time bigint);`

