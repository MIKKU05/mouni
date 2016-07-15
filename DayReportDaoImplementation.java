package com.pluto.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pluto.daointerfaces.DayReportDao;
import com.pluto.utilities.DatabaseConnectionUtility;




public class DayReportDaoImplementation implements DayReportDao{
	


public  ResultSet getDayReport()throws ClassNotFoundException, SQLException{
		

Connection con = DatabaseConnectionUtility.getConnection();
	    

PreparedStatement psmt = con.prepareStatement("select * from PLUTOPARCEL where  PARCEL_DATE=?");
	   
	   
 java.util.Date date =new java.util.Date();
	    l
ong t=date.getTime();
	    
java.sql.Date sqlDate =new java.sql.Date(t);
	   
 psmt.setDate(1,sqlDate);
	   
 ResultSet rs=psmt.executeQuery();
	  
  return rs;
	
}


}
