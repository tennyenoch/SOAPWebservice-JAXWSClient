package com.webservice.jaxws;

public class HelloWorldClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldImplService HWService = new HelloWorldImplService();
		HelloWorldInterface objHW = HWService.getHelloWorldImplPort();
		System.out.println(objHW.helloWorld("Tenny D"));
	}

}
