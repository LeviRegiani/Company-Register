package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {

	public OiMundoServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("Criando Oi Mundo Servlet!");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo, parabéns vc escreveu o primeiro servlet!");
		out.println("<body>");
		out.println("<html>");

		System.out.println("O servlet OiMundoServlet foi chamado");
	}
}
