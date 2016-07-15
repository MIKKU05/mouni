package com.pluto.daointerfaces;

import java.sql.SQLException;

import com.pluto.beans.Login;

public interface LoginDao {
	public abstract String validateUser(Login login ) throws ClassNotFoundException, SQLException;
}
