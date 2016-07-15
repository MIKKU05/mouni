package com.pluto.services;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.pluto.beans.Parcel;
import com.pluto.daoimplementations.ParcelDaoImplementation;
import com.pluto.daointerfaces.ParcelDao;

public class ParcelService {
	public int bookParcel(Parcel parcel) throws ClassNotFoundException, SQLException{
        ParcelDao parcelDao = new ParcelDaoImplementation();
        return parcelDao.bookParcel(parcel);
    }
	public  ResultSet displayParcelDetails(Parcel parcel)throws ClassNotFoundException, SQLException{
		 ParcelDao parcelDao = new ParcelDaoImplementation();
	        return parcelDao.displayParcelDetails(parcel);
		
	}
	
	
}
