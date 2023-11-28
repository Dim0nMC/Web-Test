package app.servlets;

import org.postgresql.Driver;
import utils.ConnectionManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddServlet extends HttpServlet {

    private static Connection conn;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        String group = req.getParameter("group");
        String results = req.getParameter("results");

        try
        {
            Connection conn = ConnectionManager.open();
            Statement stat = conn.createStatement();
            //int result = stat.executeUpdate(String.format("SET LANGUAGE 'Russian'"));
            int result = stat.executeUpdate(String.format("INSERT INTO users(id, name,\"group\",results) VALUES ('%s','%s','%s','%s')",101,name,group,results));

        }

        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

    }



}
