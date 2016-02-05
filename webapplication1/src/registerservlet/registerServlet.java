package registerservlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		 response.setContentType("text/html");    
	        PrintWriter out = response.getWriter();    
	          
	        String name=request.getParameter("username");    
	        String password=request.getParameter("userpass");
            String email =request.getParameter("email");
	        String contactnumber=request.getParameter("contactnumber");
	        String dateofbirth=request.getParameter("dateofbirth");
	        String gendermale=request.getParameter("gendermale");
	        String genderfemale=request.getParameter("genderfemale");
	          
	       
	        Connection conn = null;  
	        PreparedStatement pst = null;  
	        ResultSet rs = null;  
	  
	        String url = "jdbc:mysql://localhost:3306/";  
	        String dbName = "registration";  
	        String driver = "com.mysql.jdbc.Driver";  
	        String userName = "root";  
	        String passwrd = "password";  
	        {
	        try {  
	            Class.forName(driver).newInstance();  
	            conn = DriverManager  
	                    .getConnection(url + dbName, userName, passwrd);  
	  
	            pst = conn  
	                    .prepareStatement("insert into register(user,password,email,contactnumber,dateofbirth,gendermale,genderfemale)values(?,?,?,?,?,?,?)");  
	           
				pst.setString(1, name);  
				pst.setString(2, password);  
				pst.setString(3, email);
				pst.setString(4, contactnumber);
				pst.setString(5, dateofbirth);
				pst.setString(6, gendermale);
				pst.setString(7, genderfemale);
	  
	          pst.execute();  
	          
	          RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
	          rd.forward(request,response);
	          
			out.close();
	  
	        } catch (Exception e) {  
	            System.out.println(e);  
	        }
	        
	        
	        
	        }
	        }
	        }
	  
		
	



