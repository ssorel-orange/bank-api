/**
 * 
 */
package com.orange.referential.api.bankapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.orange.referential.api.bankapi.adapter.ORDSBankAdapter;
import com.orange.referential.api.bankapi.domain.Bank;
import com.orange.referential.api.bankapi.domain.ORDSBank;

/**
 * @author steph
 *
 */
@Service
public class BankService {
    @Autowired
	private RestTemplate restTemplate;
    @Value( "${ords.api.url}" )
    private String ordsApiUrl;
    
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	private String getBankCodeFromIban (String iban) {
		if (iban !=null && !iban.isEmpty() && !iban.isBlank() ) {
			return iban.substring(5,10);
		}
		else return null;
	}
	
	public Bank getBankByIban (String iban) {
		String bankId = this.getBankCodeFromIban(iban);
		
		ORDSBank ordsBank = restTemplate.getForObject(
				ordsApiUrl+bankId, ORDSBank.class);
		
		return ORDSBankAdapter.getBankFromORDSBank(ordsBank);
		
		
	}
	
	
}
