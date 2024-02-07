package com.currencyexchangeservice.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class ExchangeValue {

	@Id
	private long id;

	@Column(name = "Currency_from")
	private String from;

	@Column(name = "Currency-to")
	private String to;

	@Column(name = "Conversion_Multiple")
	private BigDecimal connversionMultiple;

	private String environment;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConnversionMultiple() {
		return connversionMultiple;
	}

	public void setConnversionMultiple(BigDecimal connversionMultiple) {
		this.connversionMultiple = connversionMultiple;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExchangeValue(long id, String from, String to, BigDecimal connversionMultiple, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.connversionMultiple = connversionMultiple;
		this.environment = environment;
	}

}
