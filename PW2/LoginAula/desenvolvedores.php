<?php 
include ('conexao.php'); //conecta ao banco
include ('verificarLogin.php'); //verifica se está logado

//Usuário 
if ($_SESSION['tipo'] == 'user') { //Limita o acesso do usuário normal
    header('Location: clientes.php?negado=true');
    exit; 

//Desenvolvedor
} else if ($_SESSION['tipo'] == 'dev') { ?>
        <body>
          <h1>Bem Vindo</h1>
          <h1>Página Somente Para Devs</h1>
          <a href='clientes.php'>Clientes</a>
          <a href='produtos.php'>Produtos</a>
          <a href='logout.php'>Sair</a>
        </body>
<?php } ?>
