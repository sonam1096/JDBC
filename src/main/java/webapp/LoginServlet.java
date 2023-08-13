package webapp;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neebalgurukul.service.LoginService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
    
    LoginService loginService = new LoginService();
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
//	String name = request.getParameter("name");
//	request.setAttribute("name", name);
	System.out.println("Inside LoginServlet");
//	System.out.println("name = "+name);
//	request.getRequestDispatcher("servlet2.do").forward(request, response); 
	request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);  
    }
    
    @Override
    protected void doPost(HttpServletRequest servletReq,HttpServletResponse servletResponse) throws ServletException, IOException
    {
	String name = servletReq.getParameter("name");
	String password = servletReq.getParameter("password");
	System.out.println("I/P parameters: "+name+" ,"+password);
	servletReq.setAttribute("name",name);
	
	try {
	    if(loginService.isValidUser(name,password))
	    {
	        servletReq.getRequestDispatcher("/WEB-INF/view/welcome.jsp").forward(servletReq, servletResponse);
	    }
	    else
	    {
	        servletReq.setAttribute("errorMessage","Invalid Credentials!!");
	        servletReq.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(servletReq, servletResponse);
	    }
	} catch (ServletException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
