
package com.pluto.services;
import com.pluto.beans.Login;
import com.pluto.daoimplementations.LoginDaoImplementation;
import com.pluto.daointerfaces.LoginDao;

import java.sql.SQLException;

public class LoginService {
	 public String validateUser(Login login) throws ClassNotFoundException, SQLException{
	        LoginDao loginDao = new LoginDaoImplementation();
	        return loginDao.validateUser(login);
	    }
}
