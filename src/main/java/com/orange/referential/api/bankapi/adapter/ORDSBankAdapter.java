/**
 * 
 */
package com.orange.referential.api.bankapi.adapter;

import com.orange.referential.api.bankapi.domain.Bank;
import com.orange.referential.api.bankapi.domain.ORDSBank;

/**
 * @author steph
 *
 */
public class ORDSBankAdapter {

	public static Bank getBankFromORDSBank (ORDSBank ordsBank) {
		Bank bank = new Bank();
		bank.setBankCode(ordsBank.getBanque_id());
		bank.setBankName(ordsBank.getBanque_name());
		bank.setCodeGuichet(ordsBank.getBanq_guichet());
		return bank;
	}
	
}
