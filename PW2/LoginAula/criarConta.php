<form action="criarContaEnviar.php" method="post">
    <input type="text" name="usuario" placeholder="Usuário" required>
    <input type="password" name="senha" placeholder="Senha" required>
    <select name="tipo" id="usertype" onchange="showCodeInput()">
        <option value="user">Usuário</option>
        <option value="dev">Administrador</option>
    </select>
    <div id="codigoContainer"> <!-- Container somente visível caso o tipo seja Dev-->
        <input type="password" name="codigo" placeholder="Código" required>
    </div>
    <input type="submit" value="Criar Conta">
</form>
<a href="./login.php">Login</a>

<!-- Caso o Tipo seja Dev ele irá pedir o código -->
<script>// Peguei no chatGPT
    function showCodeInput() { 
        const userType = document.getElementById('usertype').value; // Obtém o valor de UserType
        const codeContainer = document.getElementById('codigoContainer'); // Obtém a Id do Container
        codeContainer.style.display = userType === 'dev' ? 'block' : 'none'; // ? 'x' : 'y': é uma operação que funciona como True or False
        //'block' = visível / 'none' = invisível
}
</script>
