/**
 * 
 */
package com.orange.referential.api.bankapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orange.referential.api.bankapi.domain.Bank;
import com.orange.referential.api.bankapi.domain.ORDSBank;
import com.orange.referential.api.bankapi.service.BankService;

/**
 * @author steph
 *
 */
@RestController
@RequestMapping("/api/bank/v1")
public class BankApiController {
	
	@Autowired
	private BankService bankservice;
	
	@GetMapping(value = "/bank/{iban}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Bank getBankByIban (@PathVariable String iban) {		
		return bankservice.getBankByIban(iban);
	}
	@GetMapping(value = "/ordsbank/{bankId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ORDSBank getOrdsBankByBankId (@PathVariable String bankId) {		
		return new ORDSBank();
	}
	

	
	
}
