package com.pluto.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pluto.beans.Parcel;
import com.pluto.daointerfaces.TrainReportDao;
import com.pluto.utilities.DatabaseConnectionUtility;

public class TrainReportDaoImplementation implements TrainReportDao{
	public  ResultSet getTrainReport(Parcel parcel)throws ClassNotFoundException, SQLException{
		Connection con = DatabaseConnectionUtility.getConnection();
	    PreparedStatement psmt = con.prepareStatement("select * from PLUTOPARCEL where TRAIN_NO=? and PARCEL_DATE=?");
	   
	    java.util.Date date =new java.util.Date();
	    long t=date.getTime();
	    java.sql.Date sqlDate =new java.sql.Date(t);
	    psmt.setString(1,parcel.getTrainNo());
	    psmt.setDate(2,sqlDate);
	    ResultSet rs=psmt.executeQuery();
	    return rs;
	}
}
