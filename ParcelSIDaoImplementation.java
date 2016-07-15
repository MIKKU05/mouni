package com.pluto.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pluto.beans.Parcel;
import com.pluto.daointerfaces.ParcelSIDao;
import com.pluto.utilities.DatabaseConnectionUtility;


public class ParcelSIDaoImplementation implements ParcelSIDao{
	public  int setParcelStatus(Parcel parcel)throws ClassNotFoundException, SQLException{
		Connection con = DatabaseConnectionUtility.getConnection();
	    PreparedStatement psmt = con.prepareStatement("insert into PLUTOPARCELSTATUS values(?,?,?,'ABOUT TO DELIVER')");
	    psmt.setInt(1,parcel.getPrrNo());
	    psmt.setString(2,parcel.getClerkName());
	    psmt.setString(3,parcel.getTrainNo());
	    
	    int i=psmt.executeUpdate(); 
	    return i;
	}	
}
