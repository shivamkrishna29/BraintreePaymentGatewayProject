package com.project.braintree.Service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.ClientTokenRequest;
import com.braintreegateway.Result;
import com.braintreegateway.Transaction;
import com.braintreegateway.TransactionRequest;

@Service
public class BraintreeService {

	private final BraintreeGateway braintreeGateway;
	
	public BraintreeService(BraintreeGateway braintreeGateway) {
		this.braintreeGateway = braintreeGateway;
	}
	
	public String generateClientToken() {
      ClientTokenRequest clientTokenRequest = new ClientTokenRequest();
      return braintreeGateway.clientToken().generate(clientTokenRequest);
	}
	
	 public Result<Transaction> createTransaction(String nonce, BigDecimal amount) {
	        TransactionRequest request = new TransactionRequest()
	            .amount(amount)
	            .paymentMethodNonce(nonce)
	            .options()
	            .submitForSettlement(true)
	            .done();
	        return braintreeGateway.transaction().sale(request);
	    }
	
}
