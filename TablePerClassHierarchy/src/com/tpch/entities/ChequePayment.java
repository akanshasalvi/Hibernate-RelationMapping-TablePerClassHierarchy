package com.tpch.entities;

public class ChequePayment extends Payment{
	
	protected String chequeNo;
	protected String bankName;
	protected String branchName;
	protected String ifscCode;
	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", ifscCode=" + ifscCode + ", payment_no=" + payment_no + ", paymentDate=" + paymentDate
				+ ", description=" + description + ", amount=" + amount + "]";
	}
	
	
	

}
