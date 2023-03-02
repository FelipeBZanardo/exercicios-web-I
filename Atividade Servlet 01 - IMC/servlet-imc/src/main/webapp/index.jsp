<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cálculo IMC</title>
</head>
<body>
<form name="bmiForm" action="calcularImc" method="GET">
    <h1>Cálculo do IMC - Índice de Massa Corporal</h1>
    <table>
        <tr>
            <td>Seu peso (kg) :</td>
            <td><input type="text" name="peso"/></td>
        </tr>
        <tr>
            <td>Sua altura (m) :</td>
            <td><input type="text" name="altura"/></td>
        </tr>
        <th><input type="submit" value="Enviar" name="find"/></th>
        <th><input type="reset" value="Limpar" name="reset" /></th>
    </table>
    <h2 style="color:rgb(0,255,0);">Imc: ${imc}</h2>
    <h2 style="color:rgb(255,0,0);">${mensagem}</h2>
</form>
</body>
</html>