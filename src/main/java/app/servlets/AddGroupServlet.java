package app.servlets;

import app.entities.DataBank;
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

public class AddGroupServlet extends HttpServlet {

    private static Connection conn;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/index.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");


        String group = req.getParameter("group");
        DataBank.group = group;
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/index.jsp");
        requestDispatcher.forward(req,resp);
        System.out.println(group);
    }



}
