package app.servlets;

import app.model.UserList;
import utils.ConnectionManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {

        try
        {
            Connection conn = ConnectionManager.open();
            Statement stat = conn.createStatement();

            ResultSet rs = stat.executeQuery("select * from users");
            String name="",group="",result ="";
            List<String> names = new ArrayList<>();
            List<String> groups = new ArrayList<>();
            List<String> results = new ArrayList<>();
            while (rs.next()) {
                name = rs.getString("name");
                group = rs.getString("group");
                result = rs.getString("results");
                names.add(name);
                groups.add(group);
                results.add(result);
            }
            req.setAttribute("names", names);
            req.setAttribute("groups", groups);
            req.setAttribute("results", results);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
            requestDispatcher.forward(req,resp);

        }

        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }


    }
}
