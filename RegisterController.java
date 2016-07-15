package com.pluto.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pluto.beans.Register;
import com.pluto.services.RegisterService;


/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init( ){
        
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entered");
		String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String name =request.getParameter("name");
        int mobileNo=Integer.parseInt(request.getParameter("mobileNo"));
        String address=request.getParameter("address");
        Register userRegister=new Register();
        userRegister.setUserId(userId);
        userRegister.setPassword(password);
        userRegister.setName(name);
        userRegister.setMobileNo(mobileNo);
        userRegister.setAddress(address);
        RegisterService registerService=new RegisterService();
        try {
		int j = registerService.registerUser(userRegister);
			 if(j>0){
				request.setAttribute("msg", "Registeration Successful enter credentials to login");
				 RequestDispatcher rd=request.getRequestDispatcher("/Login.jsp");
			     rd.include(request, response); 
		        }
			 else{
				 request.setAttribute("msg", "Registeration failed");
			     RequestDispatcher rd=request.getRequestDispatcher("/Login.jsp");
			     rd.include(request, response);   	 
				 
			 }
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
       
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
