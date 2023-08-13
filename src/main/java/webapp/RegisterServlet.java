package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neebalgurukul.service.LoginService;
import com.neebalgurukul.service.RegisterService;

@WebServlet(urlPatterns = "/register.do")
public class RegisterServlet extends HttpServlet{
    
    RegisterService registerService = new RegisterService();
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
	System.out.println("Inside RegisterServlet");

	request.getRequestDispatcher("/WEB-INF/view/Registration.jsp").forward(request, response);  
    }
    
    @Override
    protected void doPost(HttpServletRequest servletReq,HttpServletResponse servletResponse) throws ServletException, IOException
    {
	String name = servletReq.getParameter("name");
	String password = servletReq.getParameter("password");
    	String sname = servletReq.getParameter("sname");
	String email = servletReq.getParameter("email");
	String course = servletReq.getParameter("course");
	int age = Integer.parseInt(servletReq.getParameter("age"));
	System.out.println("I/P parameters: "+name+" ,"+password+" ,"+sname+" ,"+email+" ,"+course+" ,"+age);
	
	servletReq.setAttribute("name",name);
	servletReq.setAttribute("password",password);
	servletReq.setAttribute("sname",sname);
	servletReq.setAttribute("email",email);
	servletReq.setAttribute("course",course);
	servletReq.setAttribute("age",age);
	
	try {
	    if(registerService.registerSuccess(name, password, sname, email, course, age))
	    {
	        servletReq.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(servletReq, servletResponse);
	    }
	    else
	    {
	        servletReq.setAttribute("errorMessage","Something went wrong");
	        servletReq.getRequestDispatcher("/WEB-INF/view/Registration.jsp").forward(servletReq, servletResponse);
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
