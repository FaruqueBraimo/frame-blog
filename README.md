# frame-blog
API de blog da Framework Digital


## REST API

Desenvolvida usando spring-boot e PostgreSQL.


- ##### Segurança da App usando Spring Security
Para garantir a segurança da aplicação
Username: admin
Password: secret

Credenciais usadas para gerar o token de acesso 
Rota para gerar o token: 
Method: POST
Rota: api/v1/auth
Body: 
    {
        "username":"admin",
        "password":"secret"
    }

Para cada request deve ser enviado o token no cabeçalho com
Authorization: [token gerado na request anterior]

Usando o swagger, basta apenas colocar o token no campo authorize apresentado pela interface do swagger.

Foi usado o `flyway db` é uma ferramenta que se permite garantir a ordem e organização para os scripts SQL que são executados na base de dados, garantindo o controle de versão dos mesmos.

## Como executar?

- Criar um banco de dados com nome postgree frame_blog com { username : postgres, password : 1234 }
- `cd blog-api`
- `mvnw clean install -DskipTests`
- `java -jar target/blog-api-0.0.1-SNAPSHOT.jar`

A partir deste momento, seguindo corretamente os passos terá a aplicação correndo no endereço `http://localhost:8080`

NB:
Poderá encontrar uma documentação mais interativa da API no endereço `http://localhost:8080/swagger-ui/`

## Alternativa para executar

- `cd blog-api`
- `docker build -f Dockerfile -t api/blog-api .`
- `docker run -d -p 8080:8080 api/blog-api`

Permite executar criando um container docker


## Front End

- Segue o link de uma pequena implementacao de algumas funcionalidades da API 
-- [App em Angular](https://github.com/FaruqueBraimo/frame-blog-front-end)





