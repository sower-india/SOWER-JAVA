package com.sower.rdbms.pojo;

import java.util.List;

import com.sower.rdbms.transactions.AccountInfo;

public class Person {
	
	private long personId;
	private String firstName;
	private String lastName;
	private long DOB; // Will store in Milliseconds
	private String mobileNumber;
	private String emailId;
	private String gender;
	private String createdUser;
	private long createdDate;
	private long updatedDate;
	private String primaryCategoryType;//A person can be a farmer, Delivery Boy, can be customer. We need a designate role for primaryCategoryType
	private String[] secondaryCategoryType;//A farmer can be a customer, or even a delivery boy etc..
	
	
	//Security Informations
	
	private String panCard;
	private String aadharId;
	
	private List<Address> personAddress; //Multple Address Can exist for the customer
	private List<AccountInfo> accounts;
	

}
