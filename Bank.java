package com.chainsys.day12;

public class Bank {
	
	private int txPassword;
	private String userName;
	
	//if protected - to be use with extends
	
	//give you methods
	
	//To hide Data ->way to encapsulation
	//data members - private
	//getters and setters as public
	
	
	public int getTxPassword() {
		return txPassword;
	}
	public void setTxPassword(int txPassword) {
		this.txPassword = txPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


}
