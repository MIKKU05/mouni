package com.pluto.services;

import java.sql.SQLException;


import com.pluto.beans.Register;
import com.pluto.daoimplementations.RegisterDaoImplementation;
import com.pluto.daointerfaces.RegisterDao;

public class RegisterService {
	public int registerUser(Register register) throws ClassNotFoundException, SQLException{
        RegisterDao registerDao = new RegisterDaoImplementation();
        return registerDao.registerUser(register);
    }
}