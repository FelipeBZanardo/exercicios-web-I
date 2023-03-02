package com.example.servletboasvindas;

import com.example.servletboasvindas.exception.EntradaDeDadosException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalTime;

@WebServlet(name = "BoasVindasServlet", urlPatterns = "/boasVindas")
public class BoasVindasServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String mensagem = "";

        try{
            String nome = req.getParameter("nome");
            String email = req.getParameter("email");
            int hora = LocalTime.now().getHour();

            if(nome.equals("") || email.equals(""))
                throw new EntradaDeDadosException();

            if (hora > 6 && hora < 12)
                mensagem = "Bom dia, " + nome + "!";
            else if (hora < 18 )
                mensagem = "Boa tarde, " + nome + "!";
            else
                mensagem = "Boa noite, " + nome + "!";


        }catch (EntradaDeDadosException e){
            mensagem = e.getMessage();
        }finally {
            req.setAttribute("mensagem", mensagem);
            req.getRequestDispatcher("/boasVindas.jsp").forward(req,resp);
        }
    }
}
