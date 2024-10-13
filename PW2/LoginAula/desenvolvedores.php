<?php 

include ('verificarLogin.php');

if (!isset($_SESSION['tipo'])) {
    header('Location: cliente.php?erro=true');
    exit;
}

if ($_SESSION['tipo'] == 'user') { //Usuário
    header('Location: clientes.php?negado=true');
    exit;
} else if ($_SESSION['tipo'] == 'dev') { //Desenvolvedor
    echo "<body style='background-color:LightBlue'>
          <h1>Bem Vindo</h1>
          <h1>Página Somente Para Devs</h1>
          <a href='clientes.php'>Clientes</a>
          <a href='produtos.php'>Produtos</a>
          <a href='logout.php'>Sair</a>
          </body>";
}
?>
