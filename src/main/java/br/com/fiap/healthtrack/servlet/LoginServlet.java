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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static UsuarioDao usuarioDao = DaoFactory.createUsuarioDao();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String  pwd = request.getParameter("password");
		RequestDispatcher dispatcher = null;
		
		Usuario user = usuarioDao.findByEmailAndPwd(email, pwd);
		
		if(user != null) {
			dispatcher = request.getRequestDispatcher("dashboard.jsp");
		}else {
			dispatcher = request.getRequestDispatcher("index.jsp");
		}
		dispatcher.forward(request, response);
	}
}
