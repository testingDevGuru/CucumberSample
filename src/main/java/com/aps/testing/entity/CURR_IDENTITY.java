package com.aps.testing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;


@Entity
//@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name="CURR_IDENTITY",uniqueConstraints = @UniqueConstraint(columnNames = "ID"))


public class CURR_IDENTITY implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID", unique=true, nullable=false)
	private int identityId;
	
	@Column(name="ACTION_FLAG", unique=true, nullable=true)
	private String actionFlag;

	@Column(name="ACTIVE_IND")
	private String activeInd;

	@Temporal(TemporalType.DATE)
	@Column(name="ALERT_DATE")
	private Date alertDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_INCORPORATED")
	private Date dateIncorporated;
	
	@Temporal(TemporalType.DATE)
	private Date dob;

	@Temporal(TemporalType.DATE)
	private Date dod;

	private String ein;

	@Column(name="ENTITY_SUB_TYPE", unique=false, nullable=true)
	private String entitySubType;

	@Column(name="ENTITY_TYPE", unique=false, nullable=true)
	private String entityType;

	@Column(name="FIRST_NAME", unique=false, nullable=false)
	private String firstName;

	private String gender;

	@Column(name="LAST_NAME", unique=false, nullable=false)
	private String lastName;

	@Column(name="LEGAL_NAME", unique=false, nullable=true)
	private String legalName;

	@Column(name="MEDICARE_COUNT")
	private BigDecimal medicareCount;

	@Column(name="MEDICARE_ID", unique=false, nullable=true)
	private String medicareId;

	@Column(name="MIDDLE_NAME", unique=false, nullable=true)
	private String middleName;

	@Column(name="NAME_PREFIX", unique=false, nullable=true)
	private String namePrefix;

	@Column(name="NAME_SUFFIX", unique=false, nullable=true)
	private String nameSuffix;

	private String npi;

	@Column(name="NPI_COUNT", unique=false, nullable=true)
	private BigDecimal npiCount;

	@Column(name="PRVDR_TYPE_CD", unique=false, nullable=true)
	private String prvdrTypeCd;

	@Column(name="SOURCE_CODE", unique=false, nullable=true)
	private String sourceCode;

	@Column(name="SOURCE_ID", unique=false, nullable=true)
	private String sourceId;

	private String ssn;

	public long getIdentityId() {
		return identityId;
	}

	public void setIdentityId(int identityId) {
		this.identityId = identityId;
	}

	public String getActionFlag() {
		return actionFlag;
	}

	public void setActionFlag(String actionFlag) {
		this.actionFlag = actionFlag;
	}

	public String getActiveInd() {
		return activeInd;
	}

	public void setActiveInd(String activeInd) {
		this.activeInd = activeInd;
	}

	public Date getAlertDate() {
		return alertDate;
	}

	public void setAlertDate(Date alertDate) {
		this.alertDate = alertDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDateIncorporated() {
		return dateIncorporated;
	}

	public void setDateIncorporated(Date dateIncorporated) {
		this.dateIncorporated = dateIncorporated;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDod() {
		return dod;
	}

	public void setDod(Date dod) {
		this.dod = dod;
	}

	public String getEin() {
		return ein;
	}

	public void setEin(String ein) {
		this.ein = ein;
	}

	public String getEntitySubType() {
		return entitySubType;
	}

	public void setEntitySubType(String entitySubType) {
		this.entitySubType = entitySubType;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public BigDecimal getMedicareCount() {
		return medicareCount;
	}

	public void setMedicareCount(BigDecimal medicareCount) {
		this.medicareCount = medicareCount;
	}

	public String getMedicareId() {
		return medicareId;
	}

	public void setMedicareId(String medicareId) {
		this.medicareId = medicareId;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getNamePrefix() {
		return namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getNameSuffix() {
		return nameSuffix;
	}

	public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	public String getNpi() {
		return npi;
	}

	public void setNpi(String npi) {
		this.npi = npi;
	}

	public BigDecimal getNpiCount() {
		return npiCount;
	}

	public void setNpiCount(BigDecimal npiCount) {
		this.npiCount = npiCount;
	}

	public String getPrvdrTypeCd() {
		return prvdrTypeCd;
	}

	public void setPrvdrTypeCd(String prvdrTypeCd) {
		this.prvdrTypeCd = prvdrTypeCd;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getStIncorporated() {
		return stIncorporated;
	}

	public void setStIncorporated(String stIncorporated) {
		this.stIncorporated = stIncorporated;
	}

	public String getTinTypeCd() {
		return tinTypeCd;
	}

	public void setTinTypeCd(String tinTypeCd) {
		this.tinTypeCd = tinTypeCd;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name="ST_INCORPORATED", unique=false, nullable=true)
	private String stIncorporated;

	@Column(name="TIN_TYPE_CD", unique=false, nullable=true)
	private String tinTypeCd;

	@Column(name="UPDATED_BY", unique=false, nullable=true)
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DATE", unique=false, nullable=true)
	private Date updatedDate;
}
