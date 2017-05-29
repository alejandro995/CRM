/**
 * Grupo CMC Colombia
 * 16/09/2016
 */
package com.bbva.ekip.arq.clients;

import java.util.Map;

import com.bbva.ccol.transactions.facade.v01.dto.Data;
import com.bbva.ccol.transactions.facade.v01.dto.Policy;

/**
 * @author VYG0139 - JFBC
 */
public interface SecurePolicyClient {
	Data createSecurePolicy(String securePolicyId, int numEjec, Policy p, Map<String, String> headers) throws Exception;
}
