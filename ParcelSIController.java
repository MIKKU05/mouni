package com.pluto.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pluto.beans.Parcel;
import com.pluto.services.ParcelSIService;


/**
 * Servlet implementation class ParcelSIController
 */
public class ParcelSIController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParcelSIController() {
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
		String clerkName=request.getParameter("clerkName");
		String trainNo=request.getParameter("trainNo");
	
		
		Parcel parcel=new Parcel();
		
		parcel.setPrrNo(prrNo);
		parcel.setClerkName(clerkName);
		parcel.setTrainNo(trainNo);
		
		ParcelSIService parcelSIService=new ParcelSIService();
		try {
			int i=parcelSIService.setParcelStatus(parcel);
			if(i>0){
			 request.setAttribute("msg", "success");
		     RequestDispatcher rd=request.getRequestDispatcher("/Message.jsp");
			     rd.include(request, response); 
			 }   
			 else{
				 request.setAttribute("msg", "failure");
			     RequestDispatcher rd=request.getRequestDispatcher("/Message.jsp");
			     rd.include(request, response);   	 
				 
			 }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
