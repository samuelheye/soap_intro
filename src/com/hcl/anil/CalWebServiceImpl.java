package com.hcl.anil;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(endpointInterface = "com.hcl.anil.CalWebService")
@SOAPBinding(style=Style.RPC)

public class CalWebServiceImpl implements CalWebService{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}
	

}
