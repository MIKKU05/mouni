package com.pluto.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pluto.daoimplementations.DayReportDaoImplementation;
import com.pluto.daointerfaces.DayReportDao;





public class DayReportService {
	
public  ResultSet getDayReport()throws ClassNotFoundException, SQLException{
		 
DayReportDao dayReportDao = new DayReportDaoImplementation();
	       
 return dayReportDao.getDayReport();
		
	
}



}
