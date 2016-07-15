package com.pluto.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.pluto.beans.ParcelStatus;

import com.pluto.daointerfaces.ParcelStatusDao;
import com.pluto.utilities.DatabaseConnectionUtility;

public class ParcelStatusDaoImplementation implements ParcelStatusDao {
	public  ResultSet getParcelStatus(ParcelStatus parcelStatus) throws ClassNotFoundException, SQLException{
		Connection con = DatabaseConnectionUtility.getConnection();
	    PreparedStatement psmt = con.prepareStatement("SELECT * FROM PLUTOPARCELSTATUS WHERE PRR_NO=?");
	    psmt.setInt(1,parcelStatus.getPrrNo());
	    ResultSet rs=psmt.executeQuery(); 
	    return rs;
	}
}
