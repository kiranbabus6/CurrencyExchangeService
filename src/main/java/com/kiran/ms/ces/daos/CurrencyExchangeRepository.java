package com.kiran.ms.ces.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiran.ms.ces.vos.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository <CurrencyExchange, Long>{
	CurrencyExchange findByFromAndTo(String from, String to);

}
