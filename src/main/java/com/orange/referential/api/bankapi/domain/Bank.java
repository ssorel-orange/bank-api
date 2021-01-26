/**
 * 
 */
package com.orange.referential.api.bankapi.domain;

/**
 * @author steph
 *
 */
public class Bank {
	
	private String iBAN;
	
	private String bankCode;
	
	private String bankName;
	
	private String codeGuichet;

	public String getiBAN() {
		return iBAN;
	}

	public void setiBAN(String iBAN) {
		this.iBAN = iBAN;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCodeGuichet() {
		return codeGuichet;
	}

	public void setCodeGuichet(String codeGuichet) {
		this.codeGuichet = codeGuichet;
	}

	@Override
	public String toString() {
		return "Bank [iBAN=" + iBAN + ", bankCode=" + bankCode + ", bankName=" + bankName + ", codeGuichet="
				+ codeGuichet + "]";
	}

	
	
	
	
}
