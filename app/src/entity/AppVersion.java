package entity;

import java.util.*;



/**
 * AppVersion entity. @author MyEclipse Persistence Tools
 */

public class AppVersion implements java.io.Serializable {

	// Fields

	private int id;
	private int appId;
	private String versionNo;
	private String versionInfo;
	private int publishStatus;
	private String downloadLink;
	private Double versionSize;
	private int createdBy;
	private Date creationDate;
	private int modifyBy;
	private Date modifyDate;
	private String apkLocPath;
	private String apkFileName;

	// Constructors

	/** default constructor */
	public AppVersion() {
	}

	/** full constructor */
	public AppVersion(int appId, String versionNo, String versionInfo,
			int publishStatus, String downloadLink, Double versionSize,
			int createdBy, Date creationDate, int modifyBy,
			Date modifyDate, String apkLocPath, String apkFileName) {
		this.appId = appId;
		this.versionNo = versionNo;
		this.versionInfo = versionInfo;
		this.publishStatus = publishStatus;
		this.downloadLink = downloadLink;
		this.versionSize = versionSize;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.apkLocPath = apkLocPath;
		this.apkFileName = apkFileName;
	}

	// Property accessors

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAppId() {
		return this.appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getVersionInfo() {
		return this.versionInfo;
	}

	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}

	public int getPublishStatus() {
		return this.publishStatus;
	}

	public void setPublishStatus(int publishStatus) {
		this.publishStatus = publishStatus;
	}

	public String getDownloadLink() {
		return this.downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	public Double getVersionSize() {
		return this.versionSize;
	}

	public void setVersionSize(Double versionSize) {
		this.versionSize = versionSize;
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

	public String getApkLocPath() {
		return this.apkLocPath;
	}

	public void setApkLocPath(String apkLocPath) {
		this.apkLocPath = apkLocPath;
	}

	public String getApkFileName() {
		return this.apkFileName;
	}

	public void setApkFileName(String apkFileName) {
		this.apkFileName = apkFileName;
	}

}