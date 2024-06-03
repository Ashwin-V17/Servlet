package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//chrome://settings/content/all
@WebServlet("/addCookie")
public class AddCookies extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c1 =new Cookie("Email", "ash@gmail.com");
		c1.setMaxAge(60*2);
		resp.addCookie(c1);
		Cookie c2 =new Cookie("Password", "123");
		resp.addCookie(c2);
	
	resp.getWriter().print("<h1>Cookies Added</h1>");
	}
}
