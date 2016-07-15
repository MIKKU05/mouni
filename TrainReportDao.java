package com.pluto.daointerfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pluto.beans.Parcel;

public interface TrainReportDao {
	public abstract ResultSet getTrainReport(Parcel parcel)throws ClassNotFoundException, SQLException;
}
