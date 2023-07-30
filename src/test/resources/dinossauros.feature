# language: pt

Funcionalidade: Executar operacoes de insercao, remocao e consulta de dinossauros

  Cenario: Usuario consulta a funcionalidade dinossauros
    Quando o cliente chama o endpoint '/dinossauros'
    Entao o cliente recebe como resposta o status 200
    E o cliente receber uma lista de 'dinossauros'

  Delineacao do Cenario: Usuario insere dinossauros no sistema
    Quando

    Exemplos: