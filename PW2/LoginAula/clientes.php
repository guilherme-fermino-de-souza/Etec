<?php 

include ('verificarLogin.php'); //verifica o login

$negado = ''; // Inicializa a mensagem de erro para caso acesso negado

if (isset($_GET['negado'])) { // Quando o user tenta entrar em páginas restritas
    $negado = "Você não possui acesso a essa página!";
}
?>

<h1>Clientes</h1>

<!-- Sempre visível -->
<a href="desenvolvedores.php">Desenvolvedor</a>


<?php if ($_SESSION['tipo'] === 'dev'): ?> <!-- Visível somente para os devs-->
    <a href="produtos.php">Produtos</a>

<?php else: ?><!-- Bloqueia produtos.php caso seja um user -->   
    <span style="color:gray;">Produtos (Acesso Negado)</span>

<?php endif; ?>

<a href="logout.php">Sair</a><!-- Sai da SESSION-->

<!-- Aviso ativado quando o $negado receber um valor true -->
<div style="background-color:coral; margin:10px">
    <?php echo $negado ?? ''; ?>
</div>
