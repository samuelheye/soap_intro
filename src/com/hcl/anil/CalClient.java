package com.hcl.anil;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalClient {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url = new URL("http://localhost:8080/cal?wsdl");
		QName qName = new QName("http://anil.hcl.com/","CalWebServiceImplService");
		Service service = Service.create(url,qName);
		CalWebService calService = service.getPort(CalWebService.class);
		System.out.println(calService.add(10,20));
	}

}
