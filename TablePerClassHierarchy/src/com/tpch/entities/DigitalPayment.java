package com.tpch.entities;

public class DigitalPayment extends Payment {

	protected String txNo;
	protected String partnerName;
	protected String remarks;
	public String getTxNo() {
		return txNo;
	}
	public void setTxNo(String txNo) {
		this.txNo = txNo;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerNo) {
		this.partnerName = partnerNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Digital_Payment [txNo=" + txNo + ", partnerName=" + partnerName + ", remarks=" + remarks + "]";
	}
	
}
