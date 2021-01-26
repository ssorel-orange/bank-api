/**
 * 
 */
package com.orange.referential.api.bankapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author steph
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ORDSBank {

	private String banque_id;
	
	private String ref_version;
	
	private String banque_num;
	
	private String banq_guichet;
	
	private String banque_name;
	
	private String process_id;

	public String getBanque_id() {
		return banque_id;
	}

	public void setBanque_id(String banque_id) {
		this.banque_id = banque_id;
	}

	public String getRef_version() {
		return ref_version;
	}

	public void setRef_version(String ref_version) {
		this.ref_version = ref_version;
	}

	public String getBanque_num() {
		return banque_num;
	}

	public void setBanque_num(String banque_num) {
		this.banque_num = banque_num;
	}

	public String getBanque_name() {
		return banque_name;
	}

	public void setBanque_name(String banque_name) {
		this.banque_name = banque_name;
	}

	public String getProcess_id() {
		return process_id;
	}

	public void setProcess_id(String process_id) {
		this.process_id = process_id;
	}

	public String getBanq_guichet() {
		return banq_guichet;
	}

	public void setBanq_guichet(String banq_guichet) {
		this.banq_guichet = banq_guichet;
	}

	@Override
	public String toString() {
		return "ORDSBank [banque_id=" + banque_id + ", ref_version=" + ref_version + ", banque_num=" + banque_num
				+ ", banq_guichet=" + banq_guichet + ", banque_name=" + banque_name + ", process_id=" + process_id
				+ "]";
	}

	
	
	
}
