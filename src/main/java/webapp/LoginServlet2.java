package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/servlet2.do")
public class LoginServlet2 extends HttpServlet{
    
    public void init() throws ServletException
	{
		System.out.println("----------------");
		System.out.println("Calling the init method in "+this.getClass().getName());
		System.out.println("----------------");
	}
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
	String userName = request.getParameter("name");
	request.setAttribute("name", userName);
	//response.sendRedirect("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
	//System.out.println("Inside LoginServlet");
	request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);  
    }

}
