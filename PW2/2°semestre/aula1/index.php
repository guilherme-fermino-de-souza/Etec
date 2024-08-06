<?php include("conexao.php"); ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <?php
        $stmt = $pdo->prepare("select * from tbContato");	
        $stmt ->execute();
        
        while($row = $stmt ->fetch(PDO::FETCH_BOTH)){            
            
        ?>    
            <h1> <?php echo $row[0] ?> </h1>
            <h1> <?php echo $row[1] ?> </h1>   
            <h1> <?php echo $row[2] ?> </h1>   
            <h1> <?php echo $row[3] ?> </h1>   
            <h1> <?php echo $row[4] ?> </h1>               
              
        <?php }	?>      
    
</body>
</html>
