package session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email =req.getParameter("email");
		String password =req.getParameter("password");
		
		String al_email="ash@gmail.com";
		String al_password ="123";
		
		if(email.equals(al_email)&&password.equals(al_password)) {
			HttpSession session =req.getSession(true);
			RequestDispatcher dispatcher =req.getRequestDispatcher("inbox");
			dispatcher.forward(req, resp);
		}else {
			resp.getWriter().print("<h1>Invalid Email or Password</h1>");
			RequestDispatcher dispatcher =req.getRequestDispatcher("Login.html");
			dispatcher.include(req, resp);
		}
	}
}
