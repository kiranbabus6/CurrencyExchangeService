package com.kiran.ms.ces.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.ms.ces.daos.CurrencyExchangeRepository;
import com.kiran.ms.ces.vos.CurrencyExchange;


@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private CurrencyExchangeRepository cer;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue (@PathVariable String from, @PathVariable String to)
	{
		CurrencyExchange ce = cer.findByFromAndTo(from, to);
		if(ce==null)
			throw new RuntimeException("Unable to find data");
		return ce;
	}
}
