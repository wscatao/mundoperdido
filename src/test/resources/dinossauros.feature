# language: pt

Funcionalidade: Executar operacoes de insercao, remocao e consulta de dinossauros

  Cenario de Fundo:
    Dado que temos dinossauros cadastrados no sistema

  Cenario: Usuario consulta a funcionalidade dinossauros
    Quando o cliente chama o endpoint '/dinossauros' para consulta
    Entao o cliente recebe como resposta o status 200
    E o cliente recebe dados validos

  Cenario: Usuario insere dinossauros no sistema
    Dado que o cliente quer inserir os dinossauros
      | nome               | altura | peso   | especie   | localizacao   |
      | Dinossauro Teste 1 | 150.00 | 100.00 | Especie 1 | Localizacao 1 |
      | Dinossauro Teste 2 | 250.00 | 500.00 | Especie 2 | Localizacao 2 |
      | Dinossauro Teste 3 | 140.00 | 230.00 | Especie 3 | Localizacao 3 |
    Quando o cliente chama o endpoint '/dinossauros' para inclusao
    Entao o cliente tera '6' dinossauros cadastrados

  Delineacao do Cenario: Usuario remove dinossauros do sistema
    Dado que o cliente quer remover o dinossauro de id <id> do sistema
    Entao o cliente recebe como resposta o status <status>

    Exemplos:
      | id        | status |
      | 1001      | 204    |
      | 1002      | 204    |
      | 1003      | 204    |
      | 123456789 | 404    |
