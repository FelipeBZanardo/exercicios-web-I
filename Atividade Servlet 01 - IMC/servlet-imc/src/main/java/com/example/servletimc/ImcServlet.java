package com.example.servletimc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "imcServlet", value = "/calcularImc")
public class ImcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String mensagem = "";

        try{
            double peso = Double.parseDouble(req.getParameter("peso"));
            double altura = Double.parseDouble(req.getParameter("altura"));

            if(altura == 0)
                throw new ArithmeticException();

            double imc = peso / (altura * altura);
            req.setAttribute("imc", String.format("%.2f", imc));
        }catch (NumberFormatException e){
            mensagem = "Entrada de dados inválida. Digite apenas números";
        }catch (ArithmeticException e){
            mensagem = "Altura inválida. Valor não pode ser 0";
        }finally {
            req.setAttribute("mensagem", mensagem);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }

    }
}
