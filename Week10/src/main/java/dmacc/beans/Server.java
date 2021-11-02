package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
@Embeddable
public class Server {
	private String fname;
	private String lname;
	
	public Server() {
		super();
	}

	public Server(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Server [fname=" + fname + ", lname=" + lname + "]";
	}
	
	
}
