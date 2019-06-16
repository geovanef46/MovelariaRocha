Ultimos registros de desenvolvimento:

1 - Módulo produto;
O form entrada de produto tem que ser dividido em movel e MP;ok
-foi necessário adicionar alguns campos de caracteristicas do produto para melhor detalhamento do produto, MARCA E COR PREDOMINANTE.
-desnecessário referenciar a materia prima utilizada para construcao do Móvel, foi retirada.
-a classe Dao tambem foi alterada
Falta o form MP; ok

2 - Módulo Funcionario;ok
Falta o form do funcionario; ok
Atualizar a tela inicial do funcionário de acordo com o tipo de funcionario, modificar o daologin para tratar o acesso de funcionarios//OK
Solucionar problemas no metodo atualizaUsuario() no daoFuncionario... adequar no daoLogin -> ver necessidade//OK
Novo Funcionario -> não fechar, no close() //OK continua com o fluxo, nao fecha, dispose()

PesquisarFunc -> apagar e editar na pesquisa //TODO
A view de Gerente deve ser separada//TODO 

3 - Módulo de producao;ok
Pesquisar Produto;ok
Pesquisar MP , apagar e editar na pesquisa//OK
retirar Vendas da pesquisa, trocar por editar, adequar a funcionalidade//OK



4 - Módulo Empresa; ok falta restante do crud
Cliente  
Fornecedor
FormEntradaEmpresa -> Falta atualizar a mascara de CNPJ//


5 - Módulo Vendas;
Vender ok Ainda falta add quantidade //OK
Pesquisar Produto ok
Registrar compras ok Ainda tem insconsistencias //TODO
Add Cliente na view Vendedor //TODO
Add remocao de estoque apos venda //TODO



6 - Módulo Relatórios;
Gerenciador de Relatórios



7 - Módulo de Configuracao;//OK
mostrar ao iniciar//OK
Alterar usuario sql//OK
Alterar caminho do Banco//OK



8 - Adicionar o Sobre
9 - inserir funcionalidades dos menus 1 a 1 //OK
10 - implementar detalhes de moveis, MP, funcionarios



obs:
1 - Com a análise da estrutura de acesso, foi necessário criar uma tabela de controle.

2 - Evitou-se o uso de acentuaçao, por ter sido desenvolvido em um sistema operacional linux, 
para evitar a incompatibilidade ao tentar compilar o codigo em outro sistema operacional.



SQL:
seleciona o funcionario.gerente que esta no controle
SELECT gerente.CPF FROM gerente join controle on gerente.CPF = controle.gerente_CPF;

SELECT funcionario.CPF FROM funcionario join controle on funcionario.CPF = controle.funcionario_CPF where id=" + id;



vendas:
listProdutos -> lista com (codigo,qtdEmEstoque)
listItens -> lista com (itens)