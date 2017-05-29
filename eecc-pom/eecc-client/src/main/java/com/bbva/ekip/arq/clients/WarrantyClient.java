/**
 * Grupo CMC Colombia
 * 15/09/2016
 */
package com.bbva.ekip.arq.clients;

import java.util.Map;

import com.bbva.ccol.warranty.facade.v01.dto.Warranty;


/**
 * @author VYG0139 - JFBC
 */

public interface WarrantyClient {
	Warranty createWarranty(String contratoEkip, int numEjec, Warranty wrr, Map<String, String> headers) throws Exception;	
}
