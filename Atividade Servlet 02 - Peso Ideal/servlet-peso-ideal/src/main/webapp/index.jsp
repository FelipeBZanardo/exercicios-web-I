<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cálculo Peso Ideal</title>
</head>
<body>
<form name="pesoIdealForm" action="calcularPesoIdeal" method="GET">
    <h1>Cálculo do Peso Ideal</h1>
    <table>
        <tr>
            <td>Seu sexo:</td>
            <td><select name="sexo">
                <option>M</option>
                <option>F</option>
            </select></td>
        </tr>
        <tr>
            <td>Sua altura (m) :</td>
            <td><input type="text" name="altura"/></td>
        </tr>
        <th><input type="submit" value="Enviar" name="find"/></th>
        <th><input type="reset" value="Limpar" name="reset" /></th>
    </table>
    <h2 style="color:rgb(0,255,0);">${pesoIdeal}</h2>
    <h2 style="color:rgb(255,0,0);">${mensagem}</h2>
</form>

</body>
</html>