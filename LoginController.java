package com.pluto.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pluto.beans.Login;
import com.pluto.services.LoginService;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entered");
		String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String role = "";
        Login loginInfo = new Login( );
        loginInfo.setUserName(userName);
        loginInfo.setPassword(password);
        LoginService loginService = new LoginService( );
        try{
         role = loginService.validateUser(loginInfo);
        }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
           
        }
        catch(SQLException se){
            se.printStackTrace( );
            
        }
        if( role.equalsIgnoreCase("user")){
            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
           
            RequestDispatcher rd = request.getRequestDispatcher("/UserHomePage.jsp");
            rd.forward(request, response);

        }

        if( role.equalsIgnoreCase("clerk")){
            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
           
            RequestDispatcher rd = request.getRequestDispatcher("/ClerkHomePage.jsp");
            rd.forward(request, response);

        }

        if( role.equalsIgnoreCase("invalid")){
        	HttpSession session = request.getSession();
        	session.setAttribute("msg", "Invalid login id or password");
            RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
            rd.include(request, response);

        }
    }

   public void destory( ){
       // no code
   }
	}


