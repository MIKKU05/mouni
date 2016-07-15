package com.pluto.daointerfaces;

import java.sql.ResultSet;
import java.sql.SQLException;


public interface DayReportDao {
	public abstract ResultSet getDayReport()throws ClassNotFoundException, SQLException;
}
