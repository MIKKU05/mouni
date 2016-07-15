package com.pluto.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.pluto.beans.ParcelStatus;
import com.pluto.daointerfaces.ParcelSUDao;
import com.pluto.utilities.DatabaseConnectionUtility;

public class ParcelSUDaoImplementation implements ParcelSUDao{
	public  int updateParcelStatus(ParcelStatus parcelStatusObj)throws ClassNotFoundException, SQLException{
		Connection con = DatabaseConnectionUtility.getConnection();
	    PreparedStatement psmt = con.prepareStatement("UPDATE  PLUTOPARCELSTATUS set PARCEL_STATUS=?  where PRR_NO=?");
	    psmt.setString(1,parcelStatusObj.getParcelStatus());
	    psmt.setInt(2,parcelStatusObj.getPrrNo());
	    int i=psmt.executeUpdate(); 
	    return i;
	}	

}
