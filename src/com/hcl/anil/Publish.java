package com.hcl.anil;

import javax.xml.ws.Endpoint;

public class Publish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint endpoint = Endpoint.publish("http://localhost:8080/cal", new CalWebServiceImpl());
		System.out.println(endpoint.isPublished());
	}

}
