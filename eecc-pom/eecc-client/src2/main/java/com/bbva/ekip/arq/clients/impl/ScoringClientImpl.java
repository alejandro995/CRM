package com.bbva.ekip.arq.clients.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bbva.ccol.loans.facade.v01.dto.Disbursement;
import com.bbva.ccol.scoring.facade.v01.dto.DataScoringAdd;
import com.bbva.ccol.scoring.facade.v01.dto.DataScoringGet;
import com.bbva.ccol.scoring.facade.v01.dto.InScoringAdd;
import com.bbva.ccol.scoring.facade.v01.dto.InScoringGet;
import com.bbva.ccol.scoring.facade.v01.dto.OutScoringAdd;
import com.bbva.ccol.scoring.facade.v01.dto.OutScoringGet;
import com.bbva.ccol.scoring.facade.v01.impl.SrvScoringV01;
import com.bbva.ekip.arq.clients.ScoringClient;
import com.bbva.ekip.arq.util.HeaderUtils;

/**
 * Created by Efron on 5/08/16.
 */
@Service
public class ScoringClientImpl extends ServiceBase implements ScoringClient {

//	@Value(value = "${scoring.url}")
	private String SCORING_URL;

	public DataScoringGet getScoring(String numoper, String numiden, Map<String, String> headers) throws Exception {
		SrvScoringV01 srv = (SrvScoringV01) getClient(SCORING_URL, SrvScoringV01.class);
		HeaderUtils.applyHeaders(WebClient.client(srv), headers);
		Response res = srv.getScoring(numoper, numiden);

		if (res.getStatus() == Status.OK.getStatusCode()) {
			return res.readEntity(DataScoringGet.class);
		} else {
			Object se = res.readEntity(Object.class);
			LinkedHashMap<String, String> errorMap = new LinkedHashMap<String, String>();
			errorMap = (LinkedHashMap<String, String>) se;
			String exception = res.getStatus() + "&&" + errorMap.get("error-code") + " - "
					+ errorMap.get("error-message");
			throw new Exception(exception);
		}

	}

	public DataScoringAdd addScoring(InScoringAdd inscoringadd, Map<String, String> headers) throws Exception {
		SrvScoringV01 srv = (SrvScoringV01) getClient(SCORING_URL, SrvScoringV01.class);
		HeaderUtils.applyHeaders(WebClient.client(srv), headers);
		Response res = srv.addScoring(inscoringadd);

		if (res.getStatus() == Status.OK.getStatusCode()) {
			return res.readEntity(DataScoringAdd.class);
		} else {
			Object se = res.readEntity(Object.class);
			LinkedHashMap<String, String> errorMap = new LinkedHashMap<String, String>();
			errorMap = (LinkedHashMap<String, String>) se;
			String exception = res.getStatus() + "&&" + errorMap.get("error-code") + " - "
					+ errorMap.get("error-message");
			throw new Exception(exception);
		}

	}

}
