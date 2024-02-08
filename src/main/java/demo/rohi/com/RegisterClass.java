package demo.rohi.com;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/registration")
public class RegisterClass extends HttpServlet{
	
	
	public void service() {
		System.out.print("Registraion");
	}

}
