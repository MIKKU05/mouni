package com.pluto.controllers;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pluto.beans.ParcelStatus;
import com.pluto.services.ParcelStatusService;

/**
 * Servlet implementation class GetParcelStatusController
 */
public class GetParcelStatusController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetParcelStatusController() {
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
		ParcelStatus parcelStatus=new ParcelStatus();
		parcelStatus.setPrrNo(prrNo);
		ParcelStatusService parcelStatusService=new ParcelStatusService();
		
		 try {
			 ResultSet rs=null;
			rs=parcelStatusService.getParcelStatus(parcelStatus);
			 HttpSession session=request.getSession();
			 if(rs.next()==true){
			 session.setAttribute("prrNo",rs.getInt(1));
			 session.setAttribute("clerkName",rs.getString(2));
			 session.setAttribute("trainNo",rs.getString(3));
			 session.setAttribute("parcelStatus",rs.getString(4));
			
		     RequestDispatcher rd=request.getRequestDispatcher("/UpdateParcelStatus.jsp");
			 rd.include(request, response); 
			 }
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
