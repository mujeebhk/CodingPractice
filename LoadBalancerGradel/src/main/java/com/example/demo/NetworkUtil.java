package com.example.demo;

import org.springframework.web.client.RestTemplate;

import com.example.demo.instance.Instance;

public class NetworkUtil {

	
	public static String makeAPICall (String protocol, String hostname, String port ) {
		final String uri = uriBuilder(protocol, hostname,port);

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);

	    //System.out.println(result);
	    return result;
	}
	
	static String  uriBuilder (String protocol, String hostname, String port ) {
		final String uri = protocol + "://"+hostname+":"+port+"/";
		return uri;
	}
}
