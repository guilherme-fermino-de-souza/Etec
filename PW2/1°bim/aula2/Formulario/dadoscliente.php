<?php
$nome = $_POST['txNome'];
$estadocivil = $_POST['txCivil'];
$genero = $_POST['txGenero'];
$datanas = $_POST['txNas'];
$email = $_POST['txEmail'];
$cpf = $_POST['txCpf'];
$estado = $_POST['txEstado'];

echo "$nome $estadocivil $genero $datanas $email $cpf $estado";
?>
