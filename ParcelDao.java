package com.pluto.daointerfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pluto.beans.Parcel;

public interface ParcelDao {
public abstract int bookParcel(Parcel parcel)throws ClassNotFoundException, SQLException;
public  abstract ResultSet displayParcelDetails(Parcel parcel)throws ClassNotFoundException, SQLException;

}
