package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
@Entity
public class Sandwich {
	@Id
	@GeneratedValue
	private long id;
	private String bread;
	private String meat;
	private String cheese;
	@Autowired
	private Server server;
	
	
	public Sandwich() {
		super();
		this.bread = "wheat";
	}


	public Sandwich(String bread) {
		super();
		this.bread = bread;
	}


	public Sandwich(String bread, String meat, String cheese) {
		super();
		this.bread = bread;
		this.meat = meat;
		this.cheese = cheese;
	}


	public Sandwich(long id, String bread, String meat, String cheese) {
		super();
		this.id = id;
		this.bread = bread;
		this.meat = meat;
		this.cheese = cheese;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getBread() {
		return bread;
	}


	public void setBread(String bread) {
		this.bread = bread;
	}


	public String getMeat() {
		return meat;
	}


	public void setMeat(String meat) {
		this.meat = meat;
	}


	public String getCheese() {
		return cheese;
	}


	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public Server getServer() {
		return server;
	}


	public void setServer(Server server) {
		this.server = server;
	}
	
	@Override
	public String toString() {
		return "Sandwich [id=" + id + ", bread=" + bread + ", meat=" + meat + ", cheese=" + cheese + ", server="
				+ server + "]";
	}
}
