package com.pluto.services;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.pluto.beans.ParcelStatus;
import com.pluto.daoimplementations.ParcelStatusDaoImplementation;
import com.pluto.daointerfaces.ParcelStatusDao;

public class ParcelStatusService {
	public ResultSet getParcelStatus(ParcelStatus parcelStatus) throws ClassNotFoundException, SQLException{
        ParcelStatusDao parcelStatusDao = new ParcelStatusDaoImplementation();
        return parcelStatusDao.getParcelStatus(parcelStatus);
        
    }
}
