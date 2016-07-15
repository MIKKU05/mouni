package com.pluto.daointerfaces;

import java.sql.SQLException;

import com.pluto.beans.Parcel;

public interface ParcelSIDao {
	public  abstract int setParcelStatus(Parcel parcel)throws ClassNotFoundException, SQLException;
}
