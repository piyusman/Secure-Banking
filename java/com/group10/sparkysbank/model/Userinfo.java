package com.group10.sparkysbank.model;


// default package
// Generated Oct 26, 2014 3:05:06 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Userinfo generated by hbm2java
 */
@Entity
@Table(name = "userinfo", catalog = "sparkysbankdb", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class Userinfo implements java.io.Serializable {

	private int iduserinfo;
	private String firstname;
	private String middlename;
	private String lastname;
	private String username;
	private String password;
	private String address;
	private String identificationid;
	private String email;
	private boolean enable;
	
	@Column(name="enable")
	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public Userinfo() {
	}

	public Userinfo(int iduserinfo) {
		this.iduserinfo = iduserinfo;
	}

	public Userinfo(int iduserinfo, String firstname, String middlename,
			String lastname, String username, String password,
			String address, String identificationid,String email,boolean enable) {
		this.iduserinfo = iduserinfo;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.address = address;
		this.identificationid = identificationid;
		this.email=email;
		this.enable=enable;
	}

	@Id
	@Column(name = "iduserinfo", unique = true, nullable = false)
	@GeneratedValue
	public int getIduserinfo() {
		return this.iduserinfo;
	}

	public void setIduserinfo(int iduserinfo) {
		this.iduserinfo = iduserinfo;
	}

	@Column(name = "firstname", length = 45)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "middlename", length = 45)
	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	@Column(name = "lastname", length = 45)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "username", unique = true, length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 60)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Column(name = "address", length = 45)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "identificationid", length = 45)
	public String getIdentificationid() {
		return this.identificationid;
	}

	public void setIdentificationid(String identificationid) {
		this.identificationid = identificationid;
	}
	
	@Column(name="email", length=30)
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}

	
}
