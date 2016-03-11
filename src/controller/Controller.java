package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Controller")
public class Controller extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public Controller() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String user = req.getParameter("user");

        out.write("<html>");
        out.write("<head>");
        out.write("<title>");
        out.write("User Validation Page");
        out.write("</title>");
        out.write("</head>");
        out.write("<body>");
        out.write("<p>");
        out.write("user via get method: " + user);
        out.write("</p>");
        out.write("</body>");
        out.write("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String user = req.getParameter("user");

        out.write("<html>");
        out.write("<head>");
        out.write("<title>");
        out.write("User Validation Page");
        out.write("</title>");
        out.write("</head>");
        out.write("<body>");
        out.write("<p>");
        out.write("user via post method: " + user);
        out.write("</p>");
        out.write("</body>");
        out.write("</html>");
    }
}
