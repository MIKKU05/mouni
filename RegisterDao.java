package com.pluto.daointerfaces;

import java.sql.SQLException;

import com.pluto.beans.Register;

public interface RegisterDao {
	public abstract int registerUser(Register register ) throws ClassNotFoundException, SQLException;
}
