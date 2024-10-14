<?php 
include ('conexao.php'); //conecta ao banco
include ('verificarLogin.php'); //verifica se está logado

//Usuário 
if ($_SESSION['tipo'] == 'user') { //Limita o acesso do usuário normal
    header('Location: clientes.php?negado=true');
    exit; 

//Desenvolvedor
} else if ($_SESSION['tipo'] == 'dev') { ?>
       <h1>Produtos</h1>
        <a href=clientes.php>Clientes</a>
        <a href=logout.php>Sair</a>

       <div class=devs>
        <h1>DESENVOLVEDORES</h1>
        <a href=desenvolvedores.php>DESENVOLVEDORES</a>
       </div>

       <?php           
        $stmt = $pdo->prepare("SELECT * FROM tbUsuario WHERE idUsuario = ?");
        $idUsuario = $_SESSION['id'];
        $stmt -> execute([$idUsuario]);
        while($row = $stmt->fetch(PDO::FETCH_BOTH)){?>
        
        <h1>Nome: <?php echo $row["nomeUsuario"]; ?></h1>
        <h2>Tipo Conta: <?php echo $row["tipoUsuario"]; ?></h2>

<?php }} ?>
