<?php include("conexao.php"); ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

     <!-- Bootstrap CSS -->
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Document</title>
</head>
<body>

    <section>
        <form action="contato-alterar.php" method="post">      
            <div>
                <input type="hidden" name="txIdContato" value="<?php echo @$_GET['id']; ?>" />
            </div>		

            <div>
                <input type="text" name="txNome" value="<?php echo @$_GET['nome']; ?>" placeholder="Nome" />
            </div>

            <div>
                <input type="text" name="txEmail" value="<?php echo @$_GET['email']; ?>" placeholder="E-mail" />
            </div>

            <div>
                <input type="text" name="txAssunto" value="<?php echo @$_GET['assunto']; ?>" placeholder="Assunto" />
            </div>

            <div>
                <input type="text" name="txMensagem" value="<?php echo @$_GET['msg']; ?>" placeholder="Mensagem" />
            </div>

            <div>
                <input type="submit" value="Salvar" />
            </div>
        </form>

    </section>

    <section>

        <table class="table">
            <thead>
                <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">E-mail</th>
                <th scope="col">Assunto</th>
                <th scope="col">Mensagem </th>
                <th scope="col"> Rotinas </th>
                </tr>
            </thead>
            <tbody>

                <?php
                $stmt = $pdo->prepare("select * from tbContato");	
                $stmt ->execute();
                
                while($row = $stmt ->fetch(PDO::FETCH_BOTH)){            
                    
                ?>

                <tr>
                    <th scope="row"> <?php echo $row[0] ?> </th>
                    <td> <?php echo $row[1] ?> </td>
                    <td> <?php echo $row[2] ?> </td>
                    <td> <?php echo $row[3] ?> </td>
                    <td> <?php echo $row[4] ?> </td>
                    <td>
                        <a href="excluircontato.php?id=<?php echo $row[0]; ?>"> Excluir </a>
                    </td>                
                    <td>
                        <a href='<?php echo "?id=$row[0]&nome=$row[1]&email=$row[2]&assunto=$row[3]&msg=$row[4]"; ?>'> 
                            Editar 
                        </a>
                    </td> 
                </tr>
                
                <?php }	?>
            </tbody>
            </table>

    </section>
    
</body>
</html>
