package com.pluto.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pluto.beans.Login;
import com.pluto.daointerfaces.LoginDao;
import com.pluto.utilities.DatabaseConnectionUtility;

public class LoginDaoImplementation implements LoginDao{
	 public String validateUser( Login login) throws ClassNotFoundException, SQLException{
	        String role = "";
	        Connection con = DatabaseConnectionUtility.getConnection();
	        PreparedStatement psmt = con.prepareStatement("select * from PLUTOREGISTER where USER_ID=? and PASSWORD=?");
	        psmt.setString(1, login.getUserName());
	        psmt.setString(2, login.getPassword());
	        ResultSet rs = psmt.executeQuery();
	        PreparedStatement psmt1 = con.prepareStatement("select * from PLUTOCLERK where CLERK_ID=? and PASSWORD=?");
	        psmt1.setString(1, login.getUserName());
	        psmt1.setString(2, login.getPassword());
	        ResultSet rs1 = psmt1.executeQuery();
	        if(rs.next()){
	            role="user";
	        }
	        else if(rs1.next()){
	        	role="clerk";
	        }
	        
	        else{
	        	role="invalid";	
	        }
	        return role;
	    }
}
