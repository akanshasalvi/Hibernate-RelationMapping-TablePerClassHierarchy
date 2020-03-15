package com.tpch.entities;

public class Digital_Payment extends Payment {

	protected String txNo;
	protected String partnerNo;
	protected String remarks;
	public String getTxNo() {
		return txNo;
	}
	public void setTxNo(String txNo) {
		this.txNo = txNo;
	}
	public String getPartnerNo() {
		return partnerNo;
	}
	public void setPartnerNo(String partnerNo) {
		this.partnerNo = partnerNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Digital_Payment [txNo=" + txNo + ", partnerNo=" + partnerNo + ", remarks=" + remarks + "]";
	}
	
}
