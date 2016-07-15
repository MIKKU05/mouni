package com.pluto.beans;

import java.io.Serializable;

public class ParcelStatus implements Serializable{
	private static final long serialVersionUID = 1L;
	private int prrNo;
	private String clerkName;
	private String trainNo;
	private String parcelStatus;
	public int getPrrNo() {
		return prrNo;
	}
	public void setPrrNo(int prrNo) {
		this.prrNo = prrNo;
	}
	public String getClerkName() {
		return clerkName;
	}
	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public String getParcelStatus() {
		return parcelStatus;
	}
	public void setParcelStatus(String parcelStatus) {
		this.parcelStatus = parcelStatus;
	}
}
