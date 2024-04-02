<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cliente</title>
    <link href="style.css" rel="stylesheet" >
</head>

<body>

    <?php include('navbar.php') ?>


    <section id="container"> <!--começo seção formulário -->
        <form action="dadoscliente.php" method="post"> <!-- começo formulário -->
            <h1>Formulário</h1>
            <div class="nome">
               <label>Nome</label>
                <input type="text" name="txNome" />
            </div>

            <div class="estCivil">
                <label>Estado Civil</label>
                <select name="txCivil">
                    <option value="solteiro">Solteiro</option>
                    <option value="casado">Casado</option>
                    <option value="separado">Separado</option>
                    <option value="divorciado">Divorciado</option>
                    <option value="viuvo">Viúvo</option>
                </select>
            </div>

            <div class="gender">
                <label>Gênero</label>
                <select name="txGenero">
                    <option value="masculino">Masculino</option>
                    <option value="Feminino">Feminino</option>
                    <option value="naobinario">Não-Binário</option>
                </select>
            </div>

            <div class="dataNasci">
                <label>Data de Nascimento</label>
                <input type="date" name="txNas" />
            </div>

            <div class="email">
                <label>E-mail</label>
                <input type="email" name="txEmail" />
            </div>

            <div class="cpf">
                <label>CPF</label>
                <input type="number" name="txCpf" minlength="11" maxlength="11" required/>
            </div>

            <div class="estado">
                <label>Estado</label>
                <input type="text" name="txEstado"/>
            </div>

            <div class="envio">
                <input type="submit" value="Enviar"/>
            </div>

        </form>
    </section>


    <?php include('footer.php') ?>
</body>

</html>
