package com.bbva.ekip.arq.clients.impl;

import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bbva.ccol.scoring.facade.v01.impl.SrvScoringV01;
//import com.bbva.ccol.account.facade.v01.dto.Money;
import com.bbva.czic.dto.canonical_model.Condition;
import com.bbva.czic.dto.canonical_model.ItemCondition;
import com.bbva.czic.dto.canonical_model.ItemConditionValue;
import com.bbva.czic.dto.non_canonical_model.Offer;
import com.bbva.czic.offer.facade.v01.SrvOfferV01;
import com.bbva.ekip.arq.clients.OfferClient;
import com.bbva.ekip.arq.util.HeaderUtils;
import com.bbva.czic.dto.canonical_model.Money;
import com.bbva.czic.dto.canonical_model.OptionsList;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Service
public class OfferClientImpl extends ServiceBase implements OfferClient {

//	@Value(value = "${offers.url}")
	private String OFFER_URL;

	public List<Offer> listOffer(String paginationKey, String pageSize, String $filter, String idCliente,
			String tipoDocumento, String product, Map<String, String> headers) throws Exception {

		SrvOfferV01 srv = (SrvOfferV01) getClient(OFFER_URL, SrvOfferV01.class);
		HeaderUtils.applyHeaders(WebClient.client(srv), headers);
		Response res = srv.listOffers(paginationKey, pageSize, $filter, idCliente, tipoDocumento, product);
		// evaluateResponse(res);

		if (res.getStatus() == Status.OK.getStatusCode()) {
			return res.readEntity(new GenericType<List<Offer>>(){});
		} else {
			try {
				
			
				Object se = res.readEntity(Object.class);
				LinkedHashMap<String, String> errorMap = new LinkedHashMap<String, String>();
				errorMap = (LinkedHashMap<String, String>) se;
				String exception = res.getStatus() + "&&" + errorMap.get("error-code") + " - "
						+ errorMap.get("error-message");
				throw new Exception(exception);	
			} catch (Exception e) {
				String exception = res.getStatus() + "&&" + "NO EXISTEN PREAPROBADOS VIGENTES PARA EL CLIENTE";
				throw new Exception(exception);
				
			}	
			
		}
//		return null;

	}

	public Offer modifyOffer(String $filter, String idCliente, String tipoDocumento, Offer offer,
			Map<String, String> headers) throws Exception {
		
		SrvOfferV01 srv = (SrvOfferV01) getClient(OFFER_URL, SrvOfferV01.class);

		HeaderUtils.applyHeaders(WebClient.client(srv), headers);
		Response res = srv.modifyOffer($filter, idCliente, tipoDocumento, offer);

		// evaluateResponse(res);

		if (res.getStatus() == Status.OK.getStatusCode()) {
			return res.readEntity(Offer.class);
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
