# language: pt

Funcionalidade: Executar operacoes de insercao, remocao e consulta de dinossauros

  #Implementar o beforeStep hook para garantir a base antes de cada cenario
  #Implementar o afterStep hook para garantir a base antes de cada cenario
  #Implementar tags para organizar features e cenarios (restringem hooks para um determinado cenario)

  Cenario de Fundo:
    Dado que temos dinossauros cadastrados no sistema

  Cenario: Usuario consulta a funcionalidade dinossauros
    Quando o cliente chama o endpoint '/dinossauros' para consulta
    Entao o cliente recebe como resposta o status 200
    E o cliente recebe dados validos

#  Delineacao do Cenario: Usuario insere dinossauros no sistema
#    E que o cliente quer inserir os dinossauros
#      | nome               | altura | peso   | especie   | localizacao   |
#      | Dinossauro Teste 1 | 150.00 | 100.00 | Especie 1 | Localizacao 1 |
#      | Dinossauro Teste 2 | 250.00 | 500.00 | Especie 2 | Localizacao 2 |
#      | Dinossauro Teste 3 | 140.00 | 230.00 | Especie 3 | Localizacao 3 |
#    Quando o cliente chama o endpoint '/dinossauros' para inclusao
#    Entao o cliente recebe como resposta o status <status>
#
#    Exemplos:
#      | status |
#      | 200    |
#      | 200    |
#      | 200    |
#      | 400    |
#      | 200    |
#
#  Delineacao do Cenario: Usuario remove dinossauros do sistema
#    Quando o cliente chama o endpoint '/dinossauros' para remocao com id <id>
#    Entao o cliente recebe como resposta o status <status>
#
#    Exemplos:
#      | id | status |
#      | 1  | 200    |
#      | 2  | 200    |
#      | 3  | 200    |
#      | 4  | 400    |
#      | 5  | 200    |