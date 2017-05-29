package com.bbva.ekip.arq.clients;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import com.bbva.czic.dto.non_canonical_model.Offer;

/**
 * Created by Efron on 5/08/16.
 */
public interface OfferClient {
	List<Offer> listOffer(String $filter, String paginationKey, String pageSize, String idCliente, String tipoDocumento,
			String product, Map<String,String> headers) throws Exception;

	Offer modifyOffer(String $filter, String idCliente, String tipoDocumento, Offer offer, Map<String,String> headers) throws Exception;

}
