<form action="criarContaEnviar.php" method="post">
    <input type="text" name="usuario" placeholder="Usuário" required>
    <input type="password" name="senha" placeholder="Senha" required>
    <select name="tipo" id="usertype">
        <option value="user">Usuário</option>
        <option value="dev">Adiministrador</option>
    </select>
    <input type="submit" value="Criar Conta">
</form>
<a href="./login.php">login</a>
