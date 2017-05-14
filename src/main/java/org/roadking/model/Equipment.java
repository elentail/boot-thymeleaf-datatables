package org.roadking.model;

public class Equipment {

	private String eqpid;
	private String eqpip;
	private String eqpline;
	private String eqptype;
	
	public Equipment(String eqpid,String eqpip,String eqpline,String eqptype){
		this.setEqpid(eqpid);
		this.setEqpline(eqpline);
		this.setEqpip(eqpip);
		this.setEqptype(eqptype);
	}

	public String getEqptype() {
		return eqptype;
	}

	public void setEqptype(String eqptype) {
		this.eqptype = eqptype;
	}

	public String getEqpip() {
		return eqpip;
	}

	public void setEqpip(String eqpip) {
		this.eqpip = eqpip;
	}

	public String getEqpline() {
		return eqpline;
	}

	public void setEqpline(String eqpline) {
		this.eqpline = eqpline;
	}

	public String getEqpid() {
		return eqpid;
	}

	public void setEqpid(String eqpid) {
		this.eqpid = eqpid;
	}
	
}
