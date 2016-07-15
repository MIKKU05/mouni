package com.pluto.services;

import java.sql.SQLException;

import com.pluto.beans.Parcel;
import com.pluto.daoimplementations.ParcelSIDaoImplementation;
import com.pluto.daointerfaces.ParcelSIDao;


public class ParcelSIService {
	public  int setParcelStatus(Parcel parcel)throws ClassNotFoundException, SQLException{
		 ParcelSIDao parcelSIDao = new ParcelSIDaoImplementation();
	     return parcelSIDao.setParcelStatus(parcel);	
	}
}
