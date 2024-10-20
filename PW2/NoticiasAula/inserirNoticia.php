<?php 
    include(conexao.php);
    include(imagemLocal.php);

    $titulo = $_POST['titulo'];
    $subtitulo = $_POST['subtitulo'];
    $descricao = $_POST['descricao'];
    $img = $_POST['img'];

    $numImagem = (int) file_get_contents($contatorImagens);

    switch ($img['error']) {
        case UPLOAD_ERR_OK: 
            $numImagem++;

            $nomeImagem = $localImagens . '/' . $numImagem . '.png';

            move_uploaded_file($img['tmp_name'], $nomeImagem);
            
            file_put_contents($contadorImagens, $numImagem);

            break;

        case UPLOAD_ERR_NO_FILE:

            $numImagem = 0;

            break;

        default:

            throw new ErrorException("Erro no upload da imagem");

            break;
    }

    $stmt = $pdo -> prepare("
        INSERT INTO tbNoticias VALUES(

            null,
            '$titulo'
            ,'$subtitulo'
            ,'$descricao'
            ,'$numImagem'
        )
    ");

    $stmt -> execute();

    header("Location: criarNoticia.php");
?>
