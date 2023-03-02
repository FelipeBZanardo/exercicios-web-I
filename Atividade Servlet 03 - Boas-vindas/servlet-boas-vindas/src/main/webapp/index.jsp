<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form name="boasVindasForm" action="boasVindas" method="POST">
    <h1>Tela de Login</h1>
    <table>
        <tr>
            <td>Nome: </td>
            <td><input type="text" name="nome"/></td>
        </tr>
        <tr>
            <td>E-mail: </td>
            <td><input type="text" name="email"/></td>
        </tr>
        <th><input type="submit" value="Enviar" name="find"/></th>
        <th><input type="reset" value="Limpar" name="reset" /></th>
    </table>
</form>
</body>
</html>