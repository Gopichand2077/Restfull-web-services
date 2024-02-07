package com.currencyexchangeservice.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.currencyexchangeservice.entity.ExchangeValue;
import com.currencyexchangeservice.repository.ExchangeValueRepository;

//import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
public class ExchangeValueServices {

	@Autowired
	private ExchangeValueRepository exchangeValueRepository;

	public ExchangeValue retriveExchangeServiceValue(String from, String to) {
		return this.exchangeValueRepository.findByFromAndTo(from, to);
	}

}
