# DesafioMarvelAPI

API REST de Personagens da Marvel com Swagger-ui.

Acesso para lista de personagens: /v1/public/characters

Acesso personagem único: /v1/public/characters/{characterId}

Acesso quadrinhos de um personagem único: /v1/public/characters/{characterId}/comics

Acesso eventos relevantes de um personagem único: /v1/public/characters/{characterId}/events

Acesso série de quadrinhos de um personagem único: /v1/public/characters/{characterId}/series

Acesso histórias de quadrinhos de um personagem único: /v1/public/characters/{characterId}/stories


#Requisitos para executar

-Requisitos obrigatórios
Ter instalado o Banco PostgreSQL (9.4 ou superior)
Ter instalado Java 1.8
IDE Compatível com Mave, Java 1.8, Spring Boot e JUnit (recomendado Eclipse)
Ter o GIT instalado
Ter um navegador instalado
Estar conectado à internet para clone do projeto e download das dependências

-Requisitos opcionais
Interface de Gerenciamento do PostgreSQL (PgAdmin ou DBeaver)
Interface de Gerenciamento do GIT

#Como executar
-Fazer clone do repositório DesafioMarvelAPI
-Na IDE escolhida (já devidamente instalada) importar o projeto maven intitulado "marvel"
-Aguardar o maven executar o download das dependências
-No gerenciador de banco de dados criar um novo banco chamado "marvelrest"
-De volta ao projeto na IDE, modificar o arquivo application.properties 
-->Alterar os campos username e password substituindo os valores usuario_do_banco_aqui e senha_do_banco_aqui para os respectivos valores do seu banco de dados
-Executar como JavaApplication a classe "MarvelApplication" que está no pacote raiz do projeto (com.restapi.marvel)
-No gerenciador de banco de dados exucutar o script marvel-api-inserts.sql para popular o banco 
-No navegador acessar a URL http://localhost:8080/swagger-ui.html
-Será carregada a tela de acesso aos métodos da API Rest
-Clicar em marvel-character-controller para exibir/esconder os métodos disponíveis
-Clicar em GET para ver a descrição e parâmetros de cada método (se houver)
-Clicar no botão "Ty it out" (localizado à direita) para habilitar o botão de executar o método
-Os métodos podem possuir 1, 2 ou nenhum parâmetro

Acesso para lista de personagens: /v1/public/characters (nenhum parâmetro)

Acesso personagem único: /v1/public/characters/{characterId} (um parâmetro obrigatório de valor numérico inteiro que corresponde ao id do personagem)

Acesso quadrinhos de um personagem único: /v1/public/characters/{characterId}/comics (um parâmetro obrigatório de valor numérico inteiro que corresponde ao id do personagem e
 um parâmetro do tipo texto opcional que corresponde a parte do nome do personagem)

Acesso eventos relevantes de um personagem único: /v1/public/characters/{characterId}/events (um parâmetro obrigatório de valor numérico inteiro que corresponde ao id do personagem e
 um parâmetro do tipo texto opcional que corresponde a parte do nome do personagem)

Acesso série de quadrinhos de um personagem único: /v1/public/characters/{characterId}/series (um parâmetro obrigatório de valor numérico inteiro que corresponde ao id do personagem e
 um parâmetro do tipo texto opcional que corresponde a parte do nome do personagem)

Acesso histórias de quadrinhos de um personagem único: /v1/public/characters/{characterId}/stories (um parâmetro obrigatório de valor numérico inteiro que corresponde ao id do personagem e
 um parâmetro do tipo texto opcional que corresponde a parte do nome do personagem)

-Após preencher o parâmetro obrigatório e, caso queira, o opcional, clique em executar para visualizar os resultados retornados


#Como verificar os testes unitários
-Na IDE escolhida, execute a classe MarvelApplicationTests como JUnitTest (nesta classe estão implmentados todos os testes unitários)
-Os resultados dos testes (garantido para o eclipse) são exibidos na aba/view do JUnit
