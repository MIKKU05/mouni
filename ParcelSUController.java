package com.pluto.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pluto.beans.ParcelStatus;
import com.pluto.services.ParcelSUService;

/**
 * Servlet implementation class ParcelSUController
 */
public class ParcelSUController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParcelSUController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prrNo=Integer.parseInt(request.getParameter("prrNo"));
	    String parcelStatus=request.getParameter("parcelStatus");
		System.out.println(prrNo);
		System.out.println(parcelStatus);
	    ParcelStatus parcelStatusObj=new ParcelStatus();
		
		parcelStatusObj.setPrrNo(prrNo);
		parcelStatusObj.setParcelStatus(parcelStatus);
		
		ParcelSUService parcelSUService=new ParcelSUService();
		try {
			int i=parcelSUService.updateParcelStatus(parcelStatusObj);
			if(i>0){
			 request.setAttribute("msg", "Parcel Status Updated successfully");
		     RequestDispatcher rd=request.getRequestDispatcher("/Message.jsp");
			     rd.include(request, response); 
			 }   
			 else{
				 request.setAttribute("msg", "Parcel Status Updation failed ");
			     RequestDispatcher rd=request.getRequestDispatcher("/Message.jsp");
			     rd.include(request, response);   	 
				 
			 }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
