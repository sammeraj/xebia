package com.xebia.model;

import java.io.Serializable;
import java.util.Date;

public class BillDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9096318135125352776L;
	
	/*
	 * Id of the generated bill
	 */
	private Integer id;
	/**
	 * Total amount before discount
	 */
	private Double grossAmount;
	
	/*
	 * Date of generation of bill
	 */
	private Date billDate;
	
	/*
	 * Variable to identify the type of users
	 */
	UserType userType;
	
	/**
	 * whether user is existing customer or not
	 */
	boolean isExistingCustomer;
	
	/*
	 * Time period since when customer is an existing customer
	 */
	Double existCustTimePeriod;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getGrossAmount() {
		return grossAmount;
	}
	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public boolean isExistingCustomer() {
		return isExistingCustomer;
	}
	public void setExistingCustomer(boolean isExistingCustomer) {
		this.isExistingCustomer = isExistingCustomer;
	}
	public Double getExistCustTimePeriod() {
		return existCustTimePeriod;
	}
	public void setExistCustTimePeriod(double d) {
		this.existCustTimePeriod = d;
	}
	
}
