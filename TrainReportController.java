package com.pluto.controllers;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pluto.beans.Parcel;
import com.pluto.beans.Parcel1;
import com.pluto.services.TrainReportService;

/**
 * Servlet implementation class TrainReportController
 */
public class TrainReportController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrainReportController() {
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
		String trainNo=request.getParameter("trainNo");
		Parcel parcel=new Parcel();
		parcel.setTrainNo(trainNo);
		
		TrainReportService trainReportService=new TrainReportService();
		List<Parcel1> trainReportList=new ArrayList<Parcel1>();
		try {
			 ResultSet rs=null;
			rs=trainReportService.getTrainReport(parcel);
			while(rs.next()){
				Parcel1 parcel1=new Parcel1();
				parcel1.setPrrNo(rs.getInt("PRR_NO"));
				parcel1.setClerkName(rs.getString("CLERK_NAME"));
				parcel1.setDate(rs.getString("PARCEL_DATE"));
				parcel1.setTrainNo(rs.getString("TRAIN_NO"));
				parcel1.setSourceStationName(rs.getString("SOURCE"));
				parcel1.setDestinationStationName(rs.getString("DESTINATION"));
				parcel1.setItemType(rs.getString("ITEMTYPE"));
				parcel1.setItemQuantity(rs.getInt("ITEMQUANTITY"));
				parcel1.setWeight(rs.getInt("WEIGHT"));
				parcel1.setDistance(rs.getInt("DISTANCE"));
				parcel1.setPrice(rs.getInt("PRICE"));
				parcel1.setSenderName(rs.getString("SENDER_NAME"));
				parcel1.setSenderMobile(rs.getString("SENDER_MOBILE_NO"));
				parcel1.setSenderAddress(rs.getString("SENDER_ADDRESS"));
				parcel1.setRecipientName(rs.getString("RECIPIENT_NAME"));
				parcel1.setRecipientMobile(rs.getString("RECIPIENT_MOBILE_NO"));
				parcel1.setRecipientAddress(rs.getString("RECIPIENT_ADDRESS"));
				trainReportList.add(parcel1);
			}
			System.out.println(trainReportList);
			request.setAttribute("report", trainReportList);
			getServletContext().getRequestDispatcher("/getTrainReport.jsp").forward(request, response);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
