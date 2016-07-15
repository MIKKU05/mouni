package com.pluto.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pluto.beans.Register;
import com.pluto.daointerfaces.RegisterDao;
import com.pluto.utilities.DatabaseConnectionUtility;

public class RegisterDaoImplementation implements RegisterDao{
	public int registerUser(Register register) throws ClassNotFoundException, SQLException{
		Connection con = DatabaseConnectionUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("insert into PLUTOREGISTER values(?,?,?,?,?,?)");
        psmt.setString(1, register.getUserId());
        psmt.setString(2, register.getPassword());
        psmt.setString(3, register.getName());
        psmt.setInt(4, register.getMobileNo());
        psmt.setString(5, register.getAddress());
        psmt.setString(6,register.getRole());
        
        int i = psmt.executeUpdate();
        return i;
	}
}
