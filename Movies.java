//saved under tomcat/webapps/maya/WEB-INF/classes/com/mayakaripel/web/

package com.mayakaripel.web.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Movies extends HttpServlet{
	public void doPost(httpServletRequest req, HttpServletResponse res) throws
			IOException, ServletException{
		String[] movieList = req.getParameter("moviename");
		req.setAttribute("movieList", movieList);
		RequestDispatcher rd = req.getRequestDispatcher("FistMovie.jsp");
		rd.forward(req,res);
	}
}
