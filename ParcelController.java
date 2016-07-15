
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

import com.pluto.beans.Parcel;
import com.pluto.services.ParcelService;

/**
 * Servlet implementation class ParcelController
 */
public class ParcelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParcelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String clerkName=request.getParameter("clerkName");
		String date=request.getParameter("date");
		String trainNo=request.getParameter("trainNo");
		String sourceStationName=request.getParameter("sourceStationName");
		String destinationStationName=request.getParameter("destinationStationName");
		String itemType=request.getParameter("itemType");
		int itemQuantity=Integer.parseInt(request.getParameter("itemQuantity"));
		int weight=Integer.parseInt(request.getParameter("weight"));
		int distance=Integer.parseInt(request.getParameter("distance"));
		int price=Integer.parseInt(request.getParameter("price"));
		String senderName=request.getParameter("senderName");
		String senderMobile=request.getParameter("senderMobile");
		String senderAddress=request.getParameter("senderAddress");
		String recipientName=request.getParameter("recipientName");
		String recipientMobile=request.getParameter("recipientMobile");
		String recipientAddress=request.getParameter("recipientAddress");
		
		
		Parcel parcel=new Parcel();
		
		parcel.setClerkName(clerkName);
		parcel.setDate(date);
		parcel.setTrainNo(trainNo);
		parcel.setSourceStationName(sourceStationName);
		parcel.setDestinationStationName(destinationStationName);
		parcel.setItemType(itemType);
		parcel.setItemQuantity(itemQuantity);
		parcel.setWeight(weight);
		parcel.setDistance(distance);
		parcel.setPrice(price);
		parcel.setSenderName(senderName);
		parcel.setSenderMobile(senderMobile);
		parcel.setSenderAddress(senderAddress);
		parcel.setRecipientName(recipientName);
		parcel.setRecipientMobile(recipientMobile);
		parcel.setRecipientAddress(recipientAddress);
		
		
		ParcelService parcelService=new ParcelService();
	try {
		int j=parcelService.bookParcel(parcel);
		 if(j>0){
			 ResultSet rs=null;
			 rs=parcelService.displayParcelDetails(parcel);
			 HttpSession session=request.getSession();
			
			 if(rs.next()==true){
			 session.setAttribute("prrNo",rs.getInt(1));
			 session.setAttribute("clerkName",rs.getString(2));
			 session.setAttribute("date", rs.getDate(3));
			 session.setAttribute("trainNo",rs.getString(4));
			 session.setAttribute("sourceStatioName", rs.getString(5));
			 session.setAttribute("destinationStationName", rs.getString(6));
			 session.setAttribute("itemType", rs.getString(7));
			 session.setAttribute("itemQuantity", rs.getInt(8));
			 session.setAttribute("weight", rs.getDouble(9));
			 session.setAttribute("distance", rs.getDouble(10));
			 session.setAttribute("price", rs.getDouble(11));
			 session.setAttribute("senderName", rs.getString(12));
			 session.setAttribute("senderMobile", rs.getString(13));
			 session.setAttribute("senderAddress", rs.getString(14));
			 session.setAttribute("recipientName", rs.getString(15));
			 session.setAttribute("recipientMobile", rs.getString(16));
			 session.setAttribute("recipientAddress", rs.getString(17));	
			 
			 request.setAttribute("msg", "success");
		     RequestDispatcher rd=request.getRequestDispatcher("/DisplayParcelDetails.jsp");
			     rd.include(request, response); 
			 }   
			 }
			 else{
				 request.setAttribute("msg", "failure");
			     RequestDispatcher rd=request.getRequestDispatcher("/ClerkHomePage.jsp");
			     rd.include(request, response);   	 
				 
			 }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
