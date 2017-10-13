package entity;

import java.util.*;

/**
 * DevUser entity. @author MyEclipse Persistence Tools
 */

public class DevUser implements java.io.Serializable {

	// Fields

	private int id;
	private String devCode;
	private String devName;
	private String devPassword;
	private String devEmail;
	private String devInfo;
	private int createdBy;
	private Date creationDate;
	private int modifyBy;
	private Date modifyDate;

	// Constructors

	/** default constructor */
	public DevUser() {
	}

	/** full constructor */
	public DevUser(String devCode, String devName, String devPassword,
			String devEmail, String devInfo, int createdBy,
			Date creationDate, int modifyBy, Date modifyDate) {
		this.devCode = devCode;
		this.devName = devName;
		this.devPassword = devPassword;
		this.devEmail = devEmail;
		this.devInfo = devInfo;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
	}

	// Property accessors

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDevCode() {
		return this.devCode;
	}

	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}

	public String getDevName() {
		return this.devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getDevPassword() {
		return this.devPassword;
	}

	public void setDevPassword(String devPassword) {
		this.devPassword = devPassword;
	}

	public String getDevEmail() {
		return this.devEmail;
	}

	public void setDevEmail(String devEmail) {
		this.devEmail = devEmail;
	}

	public String getDevInfo() {
		return this.devInfo;
	}

	public void setDevInfo(String devInfo) {
		this.devInfo = devInfo;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}