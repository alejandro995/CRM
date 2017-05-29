package com.bbva.ekip.arq.clients;

import java.util.Map;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


import com.bbva.ccol.scoring.facade.v01.dto.DataScoringAdd;
import com.bbva.ccol.scoring.facade.v01.dto.DataScoringGet;
import com.bbva.ccol.scoring.facade.v01.dto.InScoringAdd;
import com.bbva.ccol.scoring.facade.v01.dto.InScoringGet;

/**
 * Created by Efron on 5/08/16.
 */
public interface ScoringClient {

	DataScoringGet getScoring(String numoper, String numiden, Map<String,String> headers) throws Exception;

	DataScoringAdd addScoring(InScoringAdd inscoringadd, Map<String,String> headers) throws Exception;

	
	
}
