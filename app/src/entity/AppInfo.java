package entity;

import java.util.*;


/**
 * AppInfo entity. @author MyEclipse Persistence Tools
 */

public class AppInfo implements java.io.Serializable {

	// Fields

	private int id;
	private String softwareName;
	private String apkname;
	private String supportRom;
	private String interfaceLanguage;
	private Double softwareSize;
	private Date updateDate;
	private int devId;
	private String appInfo;
	private int status;
	private Date onSaleDate;
	private Date offSaleDate;
	private int flatformId;
	private int categoryLevel3;
	private int downloads;
	private int createdBy;
	private Date creationDate;
	private int modifyBy;
	private Date modifyDate;
	private int categoryLevel1;
	private int categoryLevel2;
	private String logoPicPath;
	private String logoLocPath;
	private int versionId;

	// Constructors

	/** default constructor */
	public AppInfo() {
	}

	/** full constructor */
	public AppInfo(String softwareName, String apkname, String supportRom,
			String interfaceLanguage, Double softwareSize, Date updateDate,
			int devId, String appInfo, int status, Date onSaleDate,
			Date offSaleDate, int flatformId, int categoryLevel3,
			int downloads, int createdBy, Date creationDate,
			int modifyBy, Date modifyDate, int categoryLevel1,
			int categoryLevel2, String logoPicPath, String logoLocPath,
			int versionId) {
		this.softwareName = softwareName;
		this.apkname = apkname;
		this.supportRom = supportRom;
		this.interfaceLanguage = interfaceLanguage;
		this.softwareSize = softwareSize;
		this.updateDate = updateDate;
		this.devId = devId;
		this.appInfo = appInfo;
		this.status = status;
		this.onSaleDate = onSaleDate;
		this.offSaleDate = offSaleDate;
		this.flatformId = flatformId;
		this.categoryLevel3 = categoryLevel3;
		this.downloads = downloads;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.categoryLevel1 = categoryLevel1;
		this.categoryLevel2 = categoryLevel2;
		this.logoPicPath = logoPicPath;
		this.logoLocPath = logoLocPath;
		this.versionId = versionId;
	}

	// Property accessors

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSoftwareName() {
		return this.softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getApkname() {
		return this.apkname;
	}

	public void setApkname(String apkname) {
		this.apkname = apkname;
	}

	public String getSupportRom() {
		return this.supportRom;
	}

	public void setSupportRom(String supportRom) {
		this.supportRom = supportRom;
	}

	public String getInterfaceLanguage() {
		return this.interfaceLanguage;
	}

	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}

	public Double getSoftwareSize() {
		return this.softwareSize;
	}

	public void setSoftwareSize(Double softwareSize) {
		this.softwareSize = softwareSize;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getDevId() {
		return this.devId;
	}

	public void setDevId(int devId) {
		this.devId = devId;
	}

	public String getAppInfo() {
		return this.appInfo;
	}

	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getOnSaleDate() {
		return this.onSaleDate;
	}

	public void setOnSaleDate(Date onSaleDate) {
		this.onSaleDate = onSaleDate;
	}

	public Date getOffSaleDate() {
		return this.offSaleDate;
	}

	public void setOffSaleDate(Date offSaleDate) {
		this.offSaleDate = offSaleDate;
	}

	public int getFlatformId() {
		return this.flatformId;
	}

	public void setFlatformId(int flatformId) {
		this.flatformId = flatformId;
	}

	public int getCategoryLevel3() {
		return this.categoryLevel3;
	}

	public void setCategoryLevel3(int categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}

	public int getDownloads() {
		return this.downloads;
	}

	public void setDownloads(int downloads) {
		this.downloads = downloads;
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

	public int getCategoryLevel1() {
		return this.categoryLevel1;
	}

	public void setCategoryLevel1(int categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}

	public int getCategoryLevel2() {
		return this.categoryLevel2;
	}

	public void setCategoryLevel2(int categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}

	public String getLogoPicPath() {
		return this.logoPicPath;
	}

	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}

	public String getLogoLocPath() {
		return this.logoLocPath;
	}

	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}

	public int getVersionId() {
		return this.versionId;
	}

	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}

}