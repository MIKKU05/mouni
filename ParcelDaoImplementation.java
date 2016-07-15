package com.pluto.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pluto.beans.Parcel;
import com.pluto.daointerfaces.ParcelDao;
import com.pluto.utilities.DatabaseConnectionUtility;

public class ParcelDaoImplementation implements ParcelDao {
	public  int bookParcel(Parcel parcel)throws ClassNotFoundException, SQLException{
	Connection con = DatabaseConnectionUtility.getConnection();
    PreparedStatement psmt = con.prepareStatement("insert into PLUTOPARCEL values(PLUTOPRR.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
   
    psmt.setString(1,parcel.getClerkName());
    psmt.setString(2,parcel.getDate());
    psmt.setString(3,parcel.getTrainNo());
    psmt.setString(4,parcel.getSourceStationName());
    psmt.setString(5,parcel.getDestinationStationName());
    psmt.setString(6,parcel.getItemType());
    psmt.setInt(7,parcel.getItemQuantity());
    psmt.setInt(8,parcel.getWeight());
    psmt.setInt(9,parcel.getDistance());
    psmt.setInt(10,parcel.getPrice());
    psmt.setString(11,parcel.getSenderName());
    psmt.setString(12,parcel.getSenderMobile());
    psmt.setString(13,parcel.getSenderAddress());
    psmt.setString(14,parcel.getRecipientName());
    psmt.setString(15,parcel.getRecipientMobile());
    psmt.setString(16,parcel.getRecipientAddress());
   
  
    int i = psmt.executeUpdate();
    return i;
    }
	
	public  ResultSet displayParcelDetails(Parcel parcel)throws ClassNotFoundException, SQLException{
		ResultSet rs=null;
		Connection con = DatabaseConnectionUtility.getConnection();
		PreparedStatement psmt1 = con.prepareStatement("SELECT * FROM PLUTOPARCEL WHERE PARCEL_DATE=? and TRAIN_NO=? and SENDER_NAME=? and RECIPIENT_NAME=?");
		psmt1.setString(1,parcel.getDate());
		psmt1.setString(2,parcel.getTrainNo());
		psmt1.setString(3,parcel.getSenderName());
		psmt1.setString(4,parcel.getRecipientName());
		rs=psmt1.executeQuery();
	    return rs;
	}
	
}