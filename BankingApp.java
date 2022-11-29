package com.chainsys.day13;

public class BankingApp {

	private String name,accType,ATMpin;

	private int accNo,bal,amt;
	
	//private data members
	//getters and setters - obj --> two strings
	//toString
	//default constant
	//parameterized constant
	
	/*BankingApp() {
		name="Mac";
		accType="savings";
		accNo=4567;
		bal=500;
		amt=700;
		
	}*/
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}

	public String getATMpin() {
		return ATMpin;
	}
	public void setATMpin(String aTMpin) {
		ATMpin = aTMpin;
	}


	
	//Methods
	
	public int deposit() {
		bal=bal+amt;
		return bal;
	}
	
public int withdraw() {
	int withdraw=bal-amt;
	return withdraw;
}

/*
	public int balance(int balance) {
		int balanceIs=;
		return balanceIs;
	}*/
	public int withdraw(int amount) {
		if(amount>0) {
			if(amount<bal) {//1000
				bal=bal-amount;//1000-800=200
				return bal;
			}else
				return bal;
		}else
			return bal;
	}
	
public String ATMpinGen(String ATMpin) {
		//if (accNo==1234) {
			if(getATMpin()=="123") {return ATMpin;}else
	//	}else { return accNo;}
		return name;
	}
		
	//}
	
	
	
	
}

