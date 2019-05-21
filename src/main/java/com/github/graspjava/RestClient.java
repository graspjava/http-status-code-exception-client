package com.github.graspjava;

import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
public class RestClient {

	private RestTemplate restClient;
	
	RestClient() {
		this.restClient = new RestTemplate();
	}
	
	public void restClient() {
		
		try {
			System.out.println(restClient.getForObject("", String.class));
		} catch(HttpStatusCodeException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStatusCode());
			System.out.println(e.getResponseBodyAsString());
		}
	}
	
	public static void main(String[] args) {
		new RestClient().restClient();
	}

}
