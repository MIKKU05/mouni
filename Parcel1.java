package com.pluto.beans;

import java.io.Serializable;

public class Parcel1 implements Serializable{
	private static final long serialVersionUID = 1L;
	private int prrNo;
	private String clerkName;
	private String date;
	private String trainNo;
	private String sourceStationName;
	private String destinationStationName;
	private String itemType;
	private int itemQuantity;
	private int weight;
	private int distance;
	private int price;
	private String senderName;
	private String senderMobile;
	private String senderAddress;
	private String recipientAddress;
	private String recipientMobile;
	private String recipientName;
	
	
	public String getDate() {
	return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderMobile() {
		return senderMobile;
	}
	public void setSenderMobile(String senderMobile) {
		this.senderMobile = senderMobile;
	}
	public String getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getRecipientAddress() {
		return recipientAddress;
	}
	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}
	public String getRecipientMobile() {
		return recipientMobile;
	}
	public void setRecipientMobile(String recipientMobile) {
		this.recipientMobile = recipientMobile;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getSourceStationName() {
		return sourceStationName;
	}
	public void setSourceStationName(String sourceStationName) {
		this.sourceStationName = sourceStationName;
	}
	public String getDestinationStationName() {
		return destinationStationName;
	}
	public void setDestinationStationName(String destinationStationName) {
		this.destinationStationName = destinationStationName;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getClerkName() {
		return clerkName;
	}
	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrrNo() {
		return prrNo;
	}
	public void setPrrNo(int prrNo) {
		this.prrNo = prrNo;
	}
}
