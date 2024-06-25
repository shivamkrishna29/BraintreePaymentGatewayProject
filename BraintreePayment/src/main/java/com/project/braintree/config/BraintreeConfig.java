package com.project.braintree.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Environment;

@Configuration
public class BraintreeConfig {

	@Value("${braintree.merchant-id}")
	private String merchantId;
	@Value("${braintree.private-key}")
	private String privateKey;
	@Value("${braintree.public-key }")
	private String publicKey;
	
	@Bean
	public BraintreeGateway braintreeGateway() {
		return new BraintreeGateway(Environment.SANDBOX , merchantId, publicKey, privateKey);
	}
}
