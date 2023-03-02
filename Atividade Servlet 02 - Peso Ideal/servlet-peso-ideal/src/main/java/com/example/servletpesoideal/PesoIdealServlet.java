package com.example.servletpesoideal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="pesoIdealServlet", urlPatterns = "/calcularPesoIdeal")
public class PesoIdealServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String mensagem = "";
        double pesoIdeal;

        try{
            String sexo = req.getParameter("sexo");
            double altura = Double.parseDouble(req.getParameter("altura"));

            pesoIdeal = sexo.equals("M") ? (72.7 * altura) - 58 : (62.1 * altura) - 44.7;

            req.setAttribute("pesoIdeal", String.format("Peso ideal: %.1f Kg", pesoIdeal));
        }catch (NumberFormatException e){
            mensagem = "Altura inválida. Digite apenas números";
        } finally {
            req.setAttribute("mensagem", mensagem);
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }

    }
}
