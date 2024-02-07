package com.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currencyexchangeservice.entity.ExchangeValue;
import com.currencyexchangeservice.services.ExchangeValueServices;

@RestController
public class CurrencyExchangeController {
	
	
	@Autowired
	private ExchangeValueServices exchangevalueservices;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable("from") String from,@PathVariable("to")String to) 
	{
		
		 ExchangeValue exchangeValue = exchangevalueservices.retriveExchangeServiceValue(from, to);
		 exchangeValue.setEnvironment(
				 "8080");
		 return exchangeValue;
	}

}
