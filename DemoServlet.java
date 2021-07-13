import javax.servlet.*;
import javax.servlet.http.Http;
import java.io.*;
import java.util.*;
public class DemoServlet extends HttpServlet
{
public void init()throws ServletException
{
}
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
res.setContentType("text/html");
		PrintWriter out=res.getWriter();
                out.println("<h1>Respone from Server</h1>");

        }
public void destroy()
{
}
}