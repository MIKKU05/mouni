package com.pluto.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pluto.beans.Parcel;
import com.pluto.daoimplementations.TrainReportDaoImplementation;
import com.pluto.daointerfaces.TrainReportDao;

public class TrainReportService {
	public  ResultSet getTrainReport(Parcel parcel)throws ClassNotFoundException, SQLException{
		 TrainReportDao trainReportDao = new TrainReportDaoImplementation();
	        return trainReportDao.getTrainReport(parcel);
		
	}

    
}
