<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../auladois/dados.css" </head>

<body>
    <?php include('navbar.php') ?>

<?php
$nome = $_POST['txNome'];
$estadocivil = $_POST['txCivil'];
$genero = $_POST['txGenero'];
$datanas = $_POST['txNas'];
$email = $_POST['txEmail'];
$cpf = $_POST['txCpf'];
$estado = $_POST['txEstado'];
?>

    <div class="container-content">

        <div class="container-conteudo">
            <h1>Nome do usuário: <?php echo "$nome"; ?></h1>
        </div>

        <div class="container-conteudo">
            <h1>Estado civil: <?php echo"$estadocivil"; ?></h1>
        </div>

        <div class="container-conteudo">  
            <h1>Gênero do usuário: <?php echo"$genero"; ?></h1>
        </div>

        <div class="container-conteudo">
            <h1>Data de nascimento: <?php echo"$datanas"; ?></h1>
        </div>

        <div class="container-conteudo">   
            <h1>Email do usuário: <?php echo"$email"; ?></h1>
        </div>

        <div class="container-conteudo">            
            <h1>CPF do usuário: <?php echo"$cpf"; ?></h1>
        </div>

        <div class="container-conteudo">         
            <h1>Estado do usuário: <?php echo"$estado"; ?></h1>
        </div>

    </div>

    <?php include('footer.php') ?>
</body>

</html>
