package com.pluto.daointerfaces;

import java.sql.SQLException;


import com.pluto.beans.ParcelStatus;

public interface ParcelSUDao {
	public  abstract int updateParcelStatus(ParcelStatus parcelStatusObj)throws ClassNotFoundException, SQLException;
}
