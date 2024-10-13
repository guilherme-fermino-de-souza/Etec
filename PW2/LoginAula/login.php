<?php
session_start();
include("conexao.php");

$erro = ''; // Inicializa a mensagem de erro

if (isset($_POST['usuario'], $_POST['senha'])) {
    $usuario = $_POST['usuario'];
    $senha = $_POST['senha'];

    //Início da consulta
    $stmt = $pdo->prepare('SELECT tipoUsuario FROM tbUsuario WHERE nomeUsuario = :usuario');
    $stmt->execute(['usuario' => $usuario]); //Chave da Consulta
    $tipoUsuario = $stmt->fetchColumn(); //Retorna o valor da coluna

    // Busca a senha da conta com base no nome
    $stmt = $pdo->prepare('SELECT senhaUsuario FROM tbUsuario WHERE nomeUsuario = :usuario');
    $stmt->execute(['usuario' => $usuario]);
    $senhaUsuario = $stmt->fetch();

    // Verifica se o usuário existe e a senha está correta

    // Compara se o Hash da Senha inserida é igual ao Hash do Banco de Dados
    if ($senhaUsuario && password_verify($senha, $senhaUsuario['senhaUsuario'])) { // Hash da senha(criptografa a senha no Banco de Dados)
        $_SESSION['usuario'] = $usuario; // Armazena o usuário na sessão
        $_SESSION['tipo'] = $tipoUsuario;
        header('Location: clientes.php');
        exit();
    } else {
        $erro = "Usuário ou senha inválidos."; // Mensagem de erro
    }
}

if (isset($_GET['erro'])) {
    $erro = "É necessário logar para acessar o site!";
}
?>

<div style="background-color:coral; margin:10px">
    <?php echo $erro ?? ''; ?>
</div>

<form action="" method="post">
    <input type="text" name="usuario" placeholder="Usuário" required>
    <input type="password" name="senha" placeholder="Senha" required>
    <input type="submit" name="login" value="Login">
</form>

<a href="./criarConta.php">Criar conta</a>
