package com.pluto.services;

import java.sql.SQLException;

import com.pluto.beans.ParcelStatus;
import com.pluto.daoimplementations.ParcelSUDaoImplementation;
import com.pluto.daointerfaces.ParcelSUDao;

public class ParcelSUService {
	public int updateParcelStatus(ParcelStatus parcelStatusObj) throws ClassNotFoundException, SQLException{
        ParcelSUDao parcelSUDao = new ParcelSUDaoImplementation();
        return parcelSUDao.updateParcelStatus(parcelStatusObj);
        
    }
}
