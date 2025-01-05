package com.example.demo.entities;

import java.math.BigDecimal;

import org.hibernate.type.YesNoConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pg")
public class Pg {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="pg_id")
private int pgId;
@Column(name="pg_name")
private String pgName;
@Column(name="pg_address")
private String pgAddress;
private BigDecimal pricing;
private String description;
@Convert(converter = YesNoConverter.class)
private boolean wifi;
@Convert(converter = YesNoConverter.class)
private boolean ac;
@Convert(converter = YesNoConverter.class)
private boolean laundry;

@ManyToOne
@JoinColumn(name="oid")
private Owner owner;

@ManyToOne
@JoinColumn(name="area_id")
private Area area;

public int getPgId() {
	return pgId;
}
public void setPgId(int pgId) {
	this.pgId = pgId;
}

public String getPgName() {
	return pgName;
}

public void setPgName(String pgName) {
	this.pgName = pgName;
}

public String getPgAddress() {
	return pgAddress;
}

public void setPgAddress(String pgAddress) {
	this.pgAddress = pgAddress;
}

public BigDecimal getPricing() {
	return pricing;
}

public void setPricing(BigDecimal pricing) {
	this.pricing = pricing;
}


public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public boolean isWifi() {
	return wifi;
}

public void setWifi(boolean wifi) {
	this.wifi = wifi;
}

public boolean isAc() {
	return ac;
}

public void setAc(boolean ac) {
	this.ac = ac;
}

public boolean isLaundry() {
	return laundry;
}

public void setLaundry(boolean laundry) {
	this.laundry = laundry;
}

public Owner getOwner() {
	return owner;
}

public void setOwner(Owner owner) {
	this.owner = owner;
}

public Area getArea() {
	return area;
}

public void setArea(Area area) {
	this.area = area;
}

public Pg() {
	super();
	// TODO Auto-generated constructor stub
}

public Pg(int pgId, String pgName, String pgAddress, BigDecimal pricing, boolean wifi, boolean ac, boolean laundry,
		Owner owner, Area area) {
	super();
	this.pgId = pgId;
	this.pgName = pgName;
	this.pgAddress = pgAddress;
	this.pricing = pricing;
	this.wifi = wifi;
	this.ac = ac;
	this.laundry = laundry;
	this.owner = owner;
	this.area = area;
}
}
