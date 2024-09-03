<?php  
    $id = $_POST['txIdContato'];
    $nome = $_POST['txNome'];
    $email = $_POST['txEmail'];
    $assunto = $_POST['txAssunto'];
    $mensagem = $_POST['txMensagem'];
    
    include("conexao.php");

    $stmt = $pdo->prepare("
        update tbContato set
            nome='$nome',
            email='$email',
            assunto='$assunto',
            mensagem='$mensagem'
            where idContato ='$id';
    ");	    
	$stmt ->execute();    

    header("location:consulta2.php");    
    
?>
