package br.com.fiap.healthtrack.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.healthtrack.model.dao.DaoFactory;
import br.com.fiap.healthtrack.model.dao.UsuarioDao;
import br.com.fiap.healthtrack.model.entities.Usuario;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static UsuarioDao usuarioDao = DaoFactory.createUsuarioDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String  pwd = request.getParameter("password");
		Usuario newUsuario = new Usuario(null, nome, pwd, email);
		RequestDispatcher dispatcher = null;
		
		if(nome != null && email != null && pwd != null) {
			usuarioDao.insert(newUsuario);
			dispatcher = request.getRequestDispatcher("login.jsp");
		} 
		else {
			dispatcher = request.getRequestDispatcher("index.jsp");
		}
		dispatcher.forward(request, response);
	}
}