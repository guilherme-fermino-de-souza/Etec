<?php 

$negado = ''; // Inicializa a mensagem de erro para caso acesso negado

if (isset($_GET['negado'])) {
    $negado = "Você não possui acesso a essa página!";
}

include ('verificarLogin.php');

echo "<body style='background-color:LightYellow'>
       <h1>Clientes</h1>
        <a href=produtos.php>Produtos</a>
        <a href=logout.php>Sair</a>
    </body>";
    ?>

<div style="background-color:coral; margin:10px">
    <?php echo $negado ?? ''; ?>
</div>
