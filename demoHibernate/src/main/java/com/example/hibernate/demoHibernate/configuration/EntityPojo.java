package com.example.hibernate.demoHibernate.configuration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntityPojo {
	
	private int staffid;
	private String staffname;
	private String staffmob;
	private String staffloc;
	
	
	@Id
	@Column
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	@Column
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	@Column
	public String getStaffmob() {
		return staffmob;
	}
	public void setStaffmob(String staffmob) {
		this.staffmob = staffmob;
	}
	@Column
	public String getStaffloc() {
		return staffloc;
	}
	public void setStaffloc(String staffloc) {
		this.staffloc = staffloc;
	}
	
	

}
