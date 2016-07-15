package com.pluto.daointerfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pluto.beans.ParcelStatus;

public interface ParcelStatusDao {
	public abstract ResultSet getParcelStatus(ParcelStatus parcelStatus) throws ClassNotFoundException, SQLException;
}
