package com.bbva.ekip.arq.clients;

import com.bbva.ccol.investmentfund.facade.v01.dto.Condition;
import com.bbva.ccol.investmentfund.facade.v01.dto.InvestmentFund;
import com.bbva.ccol.investmentfund.facade.v01.dto.RelatedContract;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro.daza
 */
public interface InvestmentfundClient {
    
    InvestmentFund createInvestmentfund(InvestmentFund investmentfound, Map<String, String> headers) throws Exception;
    
    Response modifyInvestmentfund(String investmentfundId, InvestmentFund investmentfund, Map<String, String> headers) throws Exception;

    InvestmentFund getInvestmentfund(String investmentfundId, Map<String, String> headers) throws Exception;
    
    
     //public List<Limits> listFundsLimits(String idInvestmentFund);

		//Response listInvestmentFunds(String filter, String fields, String expands, String orderby, Map<String, String> headers) throws Exception;

		//InvestmentFund getInvestmentFunds(String idInvestmentFund, Map<String, String> headers) throws Exception;

		//Response modifyInvestmentFunds(String idInvestmentFund, InvestmentFund infoInvestmentFund, Map<String, String> headers) throws Exception;

		//public List<Indicators> listFundsIndicators(String idInvestmentFund);

		//List<RelatedContract> listFundsRelatedContracts(String idInvestmentFund, Map<String, String> headers) throws Exception;

		//Response modifyFundsRelatedContracts(String idInvestmentFund, String idRelatedContract, RelatedContract infoRelatedContract, Map<String, String> headers) throws Exception;

		//Response deleteFundsRelatedContracts(String idInvestmentFund, String idRelatedContract,Map<String, String> headers) throws Exception;

		//public List<Participants> listFundsParticipants(String idInvestmentFund);

		//List<Condition> listFundsConditions(String idInvestmentFund, Map<String, String> headers) throws Exception;

		//public Response createFundsRelatedContracts( String idInvestmentFund ,String idRelatedContract, CommissionAgent infoCommissionAgent);

		//List<InvestmentFund> listFunds(String idInvestmentFund, Map<String, String> headers) throws Exception;

		//InvestmentFund getFunds(String idInvestmentFund, String idFund, Map<String, String> headers) throws Exception;

		//InvestmentFund modifyfunds(String idInvestmentFund, String idFund, InvestmentFund infoFund, Map<String, String> headers) throws Exception;
    
    
                
    
}
