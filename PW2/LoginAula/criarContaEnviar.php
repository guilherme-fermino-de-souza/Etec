<?php
session_start();
include("conexao.php");

// Verifica se os dados foram enviados via POST
if (isset($_POST['usuario'], $_POST['senha'], $_POST['tipo'])) {
    $nome = $_POST['usuario'];
    $senha = $_POST['senha'];
    $tipo = $_POST['tipo'];

    if ($tipo == 'dev') { // Checa se o tipo é dev
        $codigo = $_POST['codigo'];
        if ($codigo !== '123') { // Da erro caso o código esteja errado
            echo "Código Inválido.";
            header("Location: criarConta.php?tipo=dev");
            exit();
        }
    }

    // Verifica se o usuário já existe
    $stmt = $pdo->prepare('SELECT COUNT(*) FROM tbUsuario WHERE nomeUsuario = :usuario');
    $stmt->execute(['usuario' => $nome]);
    
    if ($stmt->fetchColumn() > 0) {
        // Usuário já existe
        echo "Usuário já existe. Escolha outro nome.";
    } else {
        $senhaHash = password_hash($senha, PASSWORD_DEFAULT);
        
        // Prepara e executa a inserção
        $stmt = $pdo->prepare("INSERT INTO tbUsuario (nomeUsuario, senhaUsuario, tipoUsuario) VALUES (:nomeUsuario, :senhaUsuario, :tipoUsuario)");
        if ($stmt->execute(['nomeUsuario' => $nome, 'senhaUsuario' => $senhaHash, 'tipoUsuario' => $tipo])) {
            // Redireciona após sucesso
            header("Location: criarConta.php");
            exit();
        } else {
            // Mensagem de erro ao inserir
            echo "Erro ao criar conta. Tente novamente.";
        }
    }
} else {
    echo "Por favor, preencha todos os campos.";
}
?>
